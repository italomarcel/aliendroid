package getinfo.net.br.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import com.alienlabz.activerecord.Model;

import java.util.List;

import roboguice.activity.RoboActivity;

public class MainActivity extends RoboActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact contact = new Contact();
        contact.name = "My Name";
        contact.age = 21;
        contact.save();
        // Contact contactTemp = Model.findFirst(Contact.class);
        //contactTemp.name = "Changed Name";
        //contactTemp.save();

        List contacts = Model.findAll(Contact.class);
        Toast.makeText(this, "Tamanho:" + contacts.size(), Toast.LENGTH_LONG).show();
        // List contacts = Model.where(Contact.class, "name like ?", new String[] {"name"});
        for (int i = 0; i < contacts.size() ; i++) {
            contacts.get(i);

        }

    }


}
