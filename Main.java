Set balance to desired ammount
initiate int variable withdraw and deposit without no value
set pin to desired pin number
 print "please input pin number"
if input == to 2130
 print "Welcome account number 37282"
else 
 print "Sorry there's no account bound to this pin number, please try again"
end if 
initiate while (true)
set choice to input 
choice 1 view balance 
       2 withdraw 
       3 deposit 
       4 exit 
initiate swtich(choice) 
 case 1 view balance 
  print "balance is " + balance 
   break 
 case 2 withdraw 
  print "enter amount to be withdrawn"
 set withdraw to input 
 if balance >= balance 
  print thank you!!
 end if
 set balance = balance - withdraw 
   break 
initiate while balance >= 100 
  print "leave atleast a minimum of 100, please try again" 
set ab to input 
 case 3
  print "enter amount to be deposited"
set deposit to input 
  print "your money has been successfully deposited" 
set balance = balance + deposit 
   break 
 case 4 
   System exit 
end code
