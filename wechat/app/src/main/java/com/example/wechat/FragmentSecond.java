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

public class FragmentSecond extends Fragment {
    private String[] date={"母亲大人","老爹","妹妹","舅舅","奶奶","姨妈","爷爷","表妹","外婆","外公"};
    private ListView myList1;
    private List<Contact> contactList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment,container,false);
        myList1 = view.findViewById(R.id.my_list1);
        InitContact();
        SecondAdapter secondAdapter = new SecondAdapter(getActivity(),R.layout.second_layout,contactList);
        myList1.setAdapter(secondAdapter);
        return view;
    }

    public void InitContact(){
        Contact contact = new Contact("母亲大人",R.drawable.user_1);
        contactList.add(contact);

        Contact contact1 = new Contact("老爹",R.drawable.user_2);
        contactList.add(contact1);

        Contact contact2 = new Contact("妹妹",R.drawable.user_3);
        contactList.add(contact2);

        Contact contact3 = new Contact("舅舅",R.drawable.user_4);
        contactList.add(contact3);

        Contact contact4 = new Contact("奶奶",R.drawable.user_5);
        contactList.add(contact4);

        Contact contact5 = new Contact("姨妈",R.drawable.user_6);
        contactList.add(contact5);

        Contact contact6 = new Contact("爷爷",R.drawable.user_7);
        contactList.add(contact6);

        Contact contact7 = new Contact("表妹",R.drawable.user_8);
        contactList.add(contact7);

        Contact contact8 = new Contact("外婆",R.drawable.user_9);
        contactList.add(contact8);

        Contact contact9 = new Contact("外公",R.drawable.user_10);
        contactList.add(contact9);

    }

}
