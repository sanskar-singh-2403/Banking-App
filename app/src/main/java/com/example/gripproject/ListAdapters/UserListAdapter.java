package com.example.gripproject.ListAdapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gripproject.Data.User;
import com.example.gripproject.R;
import com.example.gripproject.UI.UserData;

import java.security.AccessController;
import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.ViewHolder> {

    private ArrayList<User> userArrayList;

    public UserListAdapter(Context context,ArrayList<User> list){
        userArrayList=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView userName, userAccountBalance;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userName=itemView.findViewById(R.id.username);
            userAccountBalance=itemView.findViewById(R.id.amount);

        }
    }

    @NonNull
    @Override
    public UserListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        AccessController viewGroup;
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")   // I don't know what dis
    @Override
    public void onBindViewHolder(@NonNull UserListAdapter.ViewHolder viewHolder, int position) {
        viewHolder.itemView.setTag(userArrayList.get(position));
        viewHolder.userName.setText(userArrayList.get(position).getName());
        viewHolder.userAccountBalance.setText(String.format("%d", userArrayList.get(position).getBalance()));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), UserData.class);
                intent.putExtra("ACCOUNT_NO",userArrayList.get(position).getAccountNumber());
                intent.putExtra("NAME", userArrayList.get(position).getName());
                intent.putExtra("EMAIL", userArrayList.get(position).getEmail());
                intent.putExtra("IFSC_CODE", userArrayList.get(position).getIfscCode());
                intent.putExtra("PHONE_NO", userArrayList.get(position).getPhoneNumber());
                intent.putExtra("BALANCE", String.valueOf(userArrayList.get(position).getBalance()));
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }


}
