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

public class FragmentThree extends Fragment {
    private String[] date={"朋友圈","频道","搜一搜","摇一摇","附近","游戏","小故事","探查","小程序"};
    private ListView myList2;
    private List<Contact> contactList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.three_fragment,container,false);
        myList2 = view.findViewById(R.id.my_list2);
        InitContact();
       ThreeAdapter threeAdapter = new ThreeAdapter(getActivity(),R.layout.three_layout,contactList);
        myList2.setAdapter(threeAdapter);
        return view;
    }

    public void InitContact(){
        Contact contact = new Contact("朋友圈",R.drawable.m1);
        contactList.add(contact);

        Contact contact1 = new Contact("频道",R.drawable.m2);
        contactList.add(contact1);

        Contact contact2 = new Contact("搜一搜",R.drawable.m3);
        contactList.add(contact2);

        Contact contact3 = new Contact("摇一摇",R.drawable.m4);
        contactList.add(contact3);

        Contact contact4 = new Contact("附近",R.drawable.m5);
        contactList.add(contact4);

        Contact contact5 = new Contact("游戏",R.drawable.m6);
        contactList.add(contact5);

        Contact contact6 = new Contact("小故事",R.drawable.m7);
        contactList.add(contact6);

        Contact contact7 = new Contact("探查",R.drawable.m8);
        contactList.add(contact7);

        Contact contact8 = new Contact("小程序",R.drawable.m9);
        contactList.add(contact8);

    }

}
