package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

   @FXML
   TextField textField;
   @FXML
   TextField first_field;
   @FXML
   TextField sign_field;

   char sign;
   String first = "";
   String second = "";
   String result = "";
   double first_num;
   double second_num;
   double result_num;
   short counter = 0;
   short decimal_counter = 0;


   public void click_One(){
      if (counter==0){first = first + 1;textField.setText(first);}
      else {second = second +1;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Two(){
      if (counter==0){first = first + 2;textField.setText(first);}
      else {second = second +2;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Three(){
      if (counter==0){first = first + 3;textField.setText(first);}
      else {second = second +3;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Four(){
      if (counter==0){first = first + 4;textField.setText(first);}
      else {second = second +4;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Five(){
      if (counter==0){first = first + 5;textField.setText(first);}
      else {second = second +5;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Six(){
      if (counter==0){first = first + 6;textField.setText(first);}
      else {second = second +6;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Seven(){
      if (counter==0){first = first + 7;textField.setText(first);}
      else {second = second +7;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Eight(){
      if (counter==0){first = first + 8;textField.setText(first);}
      else {second = second +8;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Nine(){
      if (counter==0){first = first + 9;textField.setText(first);}
      else {second = second +9;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_Zero(){
      if (first.equals(""));
      else if (counter==0){first = first + 0;textField.setText(first);}
      else {second = second +0;textField.setText(second);first_field.setText(first);sign_field.setText(String.valueOf(sign));}
   }
   public void click_decimal(){
      if (decimal_counter==0){
         if (counter == 0) {
            if (first.equals("")){
               first = "0.";
            }
            else{first = first + ".";}
            textField.setText(first);
         }
         else {
            if (second.equals("")){
               second="0.";
            }
            else{second = second + ".";}
            textField.setText(second);
         }
         decimal_counter++;
      }
   }



   public void click_equal(){
      if (first.equals("")){}
      else if (second.equals("")) {
         textField.setText(first);
      }
      else if(sign == '+'){
         result_num = Double.parseDouble(first)+Double.parseDouble(second);
         result_num= (double) Math.round(result_num* 10000) / 10000;
         result = result_num+"";
         textField.setText(result);
         first_field.setText("");
         sign_field.setText("");
         first = result;
         second = result = "";
      }
      else if(sign == '-'){
         result_num = Double.parseDouble(first)-Double.parseDouble(second);
         result_num= (double) Math.round(result_num* 10000) / 10000;
         result = result_num+"";
         textField.setText(result);
         first_field.setText("");
         sign_field.setText("");
         first = result;
         second = result = "";
      }
      else if(sign == '*'){
         result_num = Double.parseDouble(first)*Double.parseDouble(second);
         result_num= (double) Math.round(result_num* 10000) / 10000;
         result = result_num+"";
         textField.setText(result);
         first_field.setText("");
         sign_field.setText("");
         first = result;
         second = result = "";
      }
      else if(sign == '/'){
         result_num = Double.parseDouble(first)/Double.parseDouble(second);
         result_num= (double) Math.round(result_num* 10000) / 10000;
         result = result_num+"";
         textField.setText(result);
         first_field.setText("");
         sign_field.setText("");
         first = result;
         second = result = "";
      }
   }



   public void click_clear(){counter=0;decimal_counter=0;first = "";second = "";result = "";textField.setText("0");first_field.setText(first);sign_field.setText(String.valueOf(sign));}

   public void click_plus(){
      if (!first.equals("")){
         if(!second.equals("")){
            result_num = Double.parseDouble(first)+Double.parseDouble(second);
            result_num= (double) Math.round(result_num* 10000) / 10000;
            result = result_num+"";
            first_field.setText(result);
            textField.setText(String.valueOf(sign));
            first = result;
            second = result = "";
         }
         else{
            sign= '+';
            textField.setText(Character.toString(sign));
            counter++;
            decimal_counter = 0;
         }
      }
   }
   public void click_minus(){
      if (!first.equals("")){
         if(!second.equals("")){
            result_num = Double.parseDouble(first)-Double.parseDouble(second);
            result_num= (double) Math.round(result_num* 10000) / 10000;
            result = result_num+"";
            first_field.setText(result);
            textField.setText(String.valueOf(sign));
            first = result;
            second = result = "";
         }
         else{
            sign = '-';
            textField.setText(Character.toString(sign));
            counter++;
            decimal_counter = 0;
         }
      }
   }
   public void click_multiply(){
      if (!first.equals("")){
         if(!second.equals("")){
            result_num = Double.parseDouble(first)*Double.parseDouble(second);
            result_num= (double) Math.round(result_num* 10000) / 10000;
            result = result_num+"";
            first_field.setText(result);
            textField.setText(String.valueOf(sign));
            first = result;
            second = result = "";
         }
         else{sign = '*';
            textField.setText(Character.toString(sign));
            counter++;
            decimal_counter = 0;
         }
      }
   }
   public void click_division(){
      if (!first.equals("")){
         if(!second.equals("")){
            result_num = Double.parseDouble(first)/Double.parseDouble(second);
            result_num= (double) Math.round(result_num* 10000) / 10000;
            result = result_num+"";
            first_field.setText(result);
            textField.setText(String.valueOf(sign));
            first = result;
            second = result = "";
         }
         else{
            sign = '/';
            textField.setText(Character.toString(sign));
            counter++;
            decimal_counter = 0;
         }
      }
   }


   //------------------------------------------------------------------------------------------------------------------------------
   public double add(double first, double second ){
      double result = first + second;return result;
   }
   public double minus(double first, double second ){
      double result = first - second;return result;
   }
   public double multiply(double first, double second ){
      double result = first * second;return result;
   }
   public double divide(double first, double second ){
      double result = first / second;return result;
   }

}