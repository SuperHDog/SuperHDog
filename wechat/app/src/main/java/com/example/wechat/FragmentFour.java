package com.example.wechat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentFour extends Fragment {
    private String[] date={"支付","收藏","相册","银行卡","表情","设置"};
    private ListView myList3;
    private List<Contact> contactList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.four_fragment,container,false);
        myList3 = view.findViewById(R.id.my_list3);
        InitContact();
        FourAdapter fourAdapter = new FourAdapter(getActivity(),R.layout.four_layout,contactList);
        myList3.setAdapter(fourAdapter);
        return view;
    }

    public void InitContact(){
        Contact contact0 = new Contact("煎蛋卷",R.drawable.touxiang);
        contactList.add(contact0);
        Contact contact = new Contact("支付",R.drawable.f1);
        contactList.add(contact);

        Contact contact1 = new Contact("收藏",R.drawable.f2);
        contactList.add(contact1);

        Contact contact2 = new Contact("相册",R.drawable.f3);
        contactList.add(contact2);

        Contact contact3 = new Contact("银行卡",R.drawable.f4);
        contactList.add(contact3);

        Contact contact4 = new Contact("表情",R.drawable.f5);
        contactList.add(contact4);

        Contact contact5 = new Contact("设置",R.drawable.f6);
        contactList.add(contact5);
    }

}
