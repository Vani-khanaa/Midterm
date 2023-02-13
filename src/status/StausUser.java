/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
 
{
   public enum StatusCode
   {
       ZERO, ONE, TWO, ThREE
   }
   public enum Status
   {
       REJECTED, PENDING, PROCESSING, APPROVED, NOT 
   }
   private StatusCode code;
   private Status status;
   
   public StausUser(StatusCode code, Status status)
   {
       this.code = code;
       this.status = status;
   }
   public String setCode(StatusCode code)
   {
       if(((code == "ZERO" || code == "ONE") || code == "TWO")||code=="THREE")
       {
           this.code = code;
       }
       else
       {
           return "NOT VALID CODE";
       }
   
   public StatusCode getCode()

       return this.code;
   }
   
   public void setStatus(Status status)
   {
       this.status = status;
   }
   public Status getStatus()
   {
       return this.status;
   }
