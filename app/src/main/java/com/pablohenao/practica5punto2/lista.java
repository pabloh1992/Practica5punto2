package com.pablohenao.practica5punto2;


import android.app.AlertDialog;
import android.app.ListFragment;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class lista extends ListFragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this.getActivity(),
                        R.array.list_array, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        int orientation = getResources().getConfiguration().orientation;
//
//        if(orientation == Configuration.ORIENTATION_LANDSCAPE ){
//            this.getFragmentManager().beginTransaction()
//                    .replace(android.R.id.content,null)
//                    .commit();
//        }
        return inflater.inflate(R.layout.fragment_lista, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int orientation = getResources().getConfiguration().orientation;

        if(orientation == Configuration.ORIENTATION_LANDSCAPE ){


            switch(position){
                case 0:
                    FragmentHoteles Hoteles= new FragmentHoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Hoteles)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 1:

                    FragmentBares Bares= new FragmentBares();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Bares)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 2:
                    FragmentTurismo Turismo= new FragmentTurismo();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Turismo)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 3:
                    FragmentDemografia Info= new FragmentDemografia();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.container, Info)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 4:

                    break;
            }
        }
        else{
            switch(position){
                case 0:
                    FragmentHoteles Hoteles= new FragmentHoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Hoteles)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 1:

                    FragmentBares Bares= new FragmentBares();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Bares)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 2:
                    FragmentTurismo Turismo= new FragmentTurismo();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Turismo)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 3:
                    FragmentDemografia Info= new FragmentDemografia();
                    this.getFragmentManager().beginTransaction()
                            .replace(android.R.id.content, Info)
                            .addToBackStack(null)
                            .commit();
                    break;

                case 4:
         /*           new AlertDialog.Builder(this)
                            .setTitle(getResources().getString(R.string.acerca))
                            .setMessage(getResources().getString(R.string.acercainfo))
                            .setNeutralButton(getResources().getString(R.string.Ok), new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // TODO Auto-generated method stub

                                }
                            }).show(); */
                    break;
            }
        }

    }
}