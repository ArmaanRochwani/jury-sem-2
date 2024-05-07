#include <iostream>
#include <string>
int main()
{
float DCF, DS, OOP, EEE, WAD;
int f = 0;
int g = 0;
std::string grace;
float graceMarks = 0;
// Input and validation for DCF
std::cout << "Enter DCF Marks : ";
std::cin >> DCF;
if (DCF < 0 || DCF > 100)
{
std::cout << "Invalid value for DCF\n";
return 0;
}
else if (DCF < 33 && DCF >= 30)
{
g++;
graceMarks = 33 - DCF; // going to apply grace marks
grace = "DCF";
}
else if (DCF < 30)
{
f++;
}
// Input and validation for DS
std::cout << "Enter DS Marks : ";
std::cin >> DS;
if (DS < 0 || DS > 100)
{
std::cout << "Invalid value for DS\n";
return 0;
}
else if (DS < 33 && DS >= 30)
{
g++;
graceMarks = 33 - DS; // Apply grace marks
grace = "DS";
}
else if (DS < 30)
{
f++;
}
// Input and validation for OOP
std::cout << "Enter OOP Marks : ";
std::cin >> OOP;
if (OOP < 0 || OOP > 100)
{
std::cout << "Invalid value for OOP\n";
return 0;
}
else if (OOP < 33 && OOP >= 30)
{
g++;
graceMarks = 33 - OOP; // Apply grace marks
grace = "OOP";
}
else if (OOP < 30)
{
f++;
}
// Input and validation for EEE
std::cout << "Enter EEE Marks : ";
std::cin >> EEE;
if (EEE < 0 || EEE > 100)
{
std::cout << "Invalid value for EEE\n";
return 0;
}
else if (EEE < 33 && EEE >= 30)
{
g++;
graceMarks = 33 - EEE; // Apply grace marks
grace = "EEE";
}
else if (EEE < 30)
{
f++;
}
// Input and validation for WAD
std::cout << "Enter WAD Marks : ";
std::cin >> WAD;
if (WAD < 0 || WAD > 100)
{
std::cout << "Invalid value for WAD\n";
return 0;
}
else if (WAD < 33 && WAD >= 30)
{
g++;
graceMarks = 33 - WAD; // Apply grace marks
grace = "WAD";
}
else if (WAD < 30)
{
f++;
}
// Determine overall result
if (f == 0 && g == 0)
{
float totalM = DCF + DS + OOP + EEE + WAD;
float percentage = (totalM / 500) * 100;
std::cout << "Result: Passed\n";
std::cout << "Percentage: " << percentage << "%\n";
if (percentage >= 60)
{
std::cout << "Division: First Division\n";
}
else if (percentage >= 45)
{
std::cout << "Division: Second Division\n";
}
else if (percentage >= 33)
{
std::cout << "Division: Third Division\n";
}
}
else
{
if (g == 1 && f == 0)
{
std::cout << "Passed in grace marks " << graceMarks << ", Grace Subject is " << grace << std::endl;
}
else if (f == 1 && g == 0)
{
std::cout << "Result : Supplementary\n";
}
else
{
std::cout << "Result : fail\n";
}
}
return 0;
}