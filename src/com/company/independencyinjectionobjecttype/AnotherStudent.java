package com.company.independencyinjectionobjecttype;

public class AnotherStudent {
  private  int id;
  private  MathCheat mathCheat;


    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cheating(){
        mathCheat.mathCheat();
        System.out.println("Student ID: "+id);
    }

}
