package com.tdtu.englishvocabquiz.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tdtu.englishvocabquiz.Activity.FolderDetails;
import com.tdtu.englishvocabquiz.Activity.HomeActivity;
import com.tdtu.englishvocabquiz.Activity.TopicDetails;
import com.tdtu.englishvocabquiz.Listener.User.OnGetUserListener;
import com.tdtu.englishvocabquiz.Model.TopicModel;
import com.tdtu.englishvocabquiz.Model.UserModel;
import com.tdtu.englishvocabquiz.R;
import com.tdtu.englishvocabquiz.Service.UserDatabaseService;

import java.util.ArrayList;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {
    private Context context;
    private ArrayList<TopicModel> list;
    private UserDatabaseService userDatabaseService ;
    private TopicAdapter.OnItemClickListener listener;

    public TopicAdapter(Context context, ArrayList<TopicModel> list) {
        this.context = context;
        this.list = list;
        this.userDatabaseService = new UserDatabaseService(context);
    }

    @NonNull
    @Override
    public TopicAdapter.TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopicViewHolder(LayoutInflater.from(context).inflate(R.layout.new_topic_item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicViewHolder holder, int position) {
        TopicModel item = list.get(position);
        holder.tvTopicName.setText(item.getTopicName());
        holder.tvCountWord.setText(item.getNumberOfVocab() + " học phần");
//        holder.tvCreatorName.setText(item.getIdAuthor());
        userDatabaseService.getUserById(item.getIdAuthor(),new OnGetUserListener() {
            @Override
            public void onGetReady(UserModel userModel) {
                String AuthorName = userModel.getName();
                holder.tvCreatorName.setText(AuthorName);
            }
        });
//        holder.tvCreatorName.setText(item.getIdAuthor());

        if (context instanceof HomeActivity){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =  new Intent(view.getContext(), TopicDetails.class);
                    intent.putExtra("TopicName",item.getTopicName());
                    intent.putExtra("NumberOfVocab",item.getNumberOfVocab());
                    intent.putExtra("IdAuthor",item.getIdAuthor());
                    intent.putExtra("IdTopic",item.getIdTopic());
                    context.startActivity(intent);
                }
            });

        } else {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onItemClick(holder.getAdapterPosition());
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    // Setter để thiết lập listener từ bên ngoài Adapter
    public void setOnItemClickListener(TopicAdapter.OnItemClickListener listener) {
        this.listener = listener;
    }
    public class TopicViewHolder extends RecyclerView.ViewHolder{
        TextView tvTopicName;
        ImageView imViewAvatar;
        TextView tvCreatorName;
        TextView tvCountWord;
        public TopicViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTopicName = itemView.findViewById(R.id.tvTopicName);
            imViewAvatar = itemView.findViewById(R.id.imViewAvatar);
            tvCountWord = itemView.findViewById(R.id.tvCountWord);
            tvCreatorName = itemView.findViewById(R.id.tvCreatorName);
        }
    }
}


