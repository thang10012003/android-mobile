package com.tdtu.englishvocabquiz.Activity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tdtu.englishvocabquiz.R;
import com.tdtu.englishvocabquiz.databinding.ActivityChangePasswordBinding;

public class ChangePasswordActivity extends AppCompatActivity {
    ActivityChangePasswordBinding binding;
    private FirebaseAuth auth;
    private FirebaseDatabase db;
    private DatabaseReference ref;
    private FirebaseUser currUser;
    private  String oldPass;
    private  String newPass;
    private  String confNewPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangePasswordBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //firebase init
        auth = FirebaseAuth.getInstance();
        //get current user
        currUser = auth.getCurrentUser();


        //submit update btn
        binding.updateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                 oldPass = binding.oldPassEdt.getText().toString().trim();
                 newPass = binding.newPassEdt.getText().toString().trim();
                 confNewPass = binding.confNewPassEdt.getText().toString().trim();
                //validate
                if(oldPass.isEmpty()){
                    binding.oldPassEdt.setError("Mật khẩu cũ chưa nhập !");
                }else if(newPass.isEmpty() ){
                    binding.newPassEdt.setError("Mật khẩu mới chưa nhập !");
                }else if(confNewPass.isEmpty() ){
                    binding.confNewPassEdt.setError("Mật khẩu xác nhận chưa nhập !");
                }
                else if(!confNewPass.equals(newPass) ){
                    binding.confNewPassEdt.setError("Mật khẩu xác nhận chưa trùng khớp !");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangePasswordActivity.this);
                builder.setCancelable(false);
                builder.setView(R.layout.progress_layout);
                AlertDialog dialog = builder.create();
                dialog.show();
                    String email = currUser.getEmail().trim();
                     AuthCredential  credential = EmailAuthProvider.getCredential(email,oldPass);
                    //re-auth
                    currUser.reauthenticate(credential)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if(task.isSuccessful()){
                                        currUser.updatePassword(newPass).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if(task.isSuccessful()){
                                                    Toast.makeText(ChangePasswordActivity.this,"Cập nhật thành công !",Toast.LENGTH_LONG).show();
                                                    //startActivity(new Intent(ChangePasswordActivity.this, MainActivity.class));
                                                    dialog.dismiss();
                                                    finish();
                                                }else{
                                                    dialog.dismiss();
                                                    Toast.makeText(ChangePasswordActivity.this,"Không thể cập nhất mới mật khẩu !",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                    }else{
                                        Log.d(TAG, "Error auth failed");
                                        dialog.dismiss();
                                        Toast.makeText(ChangePasswordActivity.this,"Mật khẩu cũ không chính xác !",Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                }


        });
    }
}
