package com.example.handleclick;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      //method 1 - uses an inner class named btn1Listener...
      Button btn1 = (Button)findViewById(R.id.Button01);
      btn1.setOnClickListener(btn1Listener);

      //method 2 - use an anonymous inner class as a listener...
      Button btn2 = (Button)findViewById(R.id.Button02);
      btn2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              showToastMessage("You clicked btn2 - uses an anonymouse inner class");
          }

      });

      //method 3 - note that this class implements

      //the View.OnClickListener interface

      //which means that we must implement the onClick()

      //method (which you'll find below)..

      Button btn3 = (Button)findViewById(R.id.Button03);
      btn3.setOnClickListener(this);
      //method 4 - look at the method btn4Listener() below       

  }

  //here's the inner class used as a listener for btn1...
  private View.OnClickListener btn1Listener = new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToastMessage("You clicked btn1 - uses an inner class named btn1Listener");
      }
  };

  //here's a method that you must have when your activity implements the

  //View.OnClickListener interface...

  @Override

  public void onClick(View v) {

      showToastMessage("you clicked on a btn3, which uses this Activity as the listener");

  }
  //here's the handler for btn4 (declared in the xml layout file)...

  //note: this method only works with android 2.1 (api level 7), it must be public and

  //must take a single parameter which is a View

  public void btn4Listener(View v) {

          showToastMessage("You clicked btn4 - listener was set up in the XML layout");

  }

  private void showToastMessage(String msg){

      Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);

      toast.show();

  }
}