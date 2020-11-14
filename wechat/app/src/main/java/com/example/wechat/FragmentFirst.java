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

public class FragmentFirst extends Fragment {
    private String[] date={"在吗？","谢谢","嗯","啊","是的","可以","感谢","再见","拜拜"};
    private ListView myList;
    private List<Contact> contactList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        myList = view.findViewById(R.id.my_list);
        InitContact();
        FirstAdapter firstAdapter = new FirstAdapter(getActivity(),R.layout.first_layout,contactList);
        myList.setAdapter(firstAdapter);
        return view;
    }

    public void InitContact(){
        Contact contact = new Contact("在吗？",R.drawable.user1);
        contactList.add(contact);

        Contact contact1 = new Contact("谢谢",R.drawable.user2);
        contactList.add(contact1);

        Contact contact2 = new Contact("嗯",R.drawable.user3);
        contactList.add(contact2);

        Contact contact3 = new Contact("啊",R.drawable.user4);
        contactList.add(contact3);

        Contact contact4 = new Contact("是的",R.drawable.user5);
        contactList.add(contact4);

        Contact contact5 = new Contact("可以",R.drawable.user6);
        contactList.add(contact5);

        Contact contact6 = new Contact("感谢",R.drawable.user7);
        contactList.add(contact6);

        Contact contact7 = new Contact("再见",R.drawable.user8);
        contactList.add(contact7);

        Contact contact8 = new Contact("拜拜",R.drawable.user9);
        contactList.add(contact8);

    }

}
