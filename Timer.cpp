#include <iostream>
#include <iomanip>
#include <sstream>
#include <ctime>
#include <vector>
using namespace std;

// Global variables
int milHour = 0;
int minute = 0;
int hour = 0;
int second = 0;
int dataEdit;
bool menuLoop = true;

string am_pm() {
    if ((milHour >= 12) && (milHour <= 23)) {
        return " P.M.";
    } else {
        return " A.M.";
    }
}

void starPrint(int j, int k) {
    int m;
    int i;
    for (m = 0; m < k; m++) {
        cout << "*";
    }
    for (i = 0; i < j; i++) {
        cout << " ";
    }
}

void timeCheck() {
    if (second >= 60) {
        second = 0;
        minute++;
    }
    if (minute >= 60) {
        hour++;
        milHour++;
    }
    if ((hour == 12) && (second > 59)) {
        hour = 1;
    }
    if (milHour >= 24) {
        milHour = 0;
    }
}

void twelveHourClock() {
    timeCheck();
    cout << setfill('0') << setw(2) << hour << ":";
    cout << setfill('0') << setw(2) << minute << ":";
    cout << setfill('0') << setw(2) << second << am_pm();
}

void twentyfourHourClock() {
    timeCheck();
    cout << setfill('0') << setw(2) << milHour << ":";
    cout << setfill('0') << setw(2) << minute << ":";
    cout << setfill('0') << setw(2) << second;
}

void printClock() {
    starPrint(2, 32);
    cout << endl;
    cout << "*12 hour clock** 24 hour clock *";
    cout << endl;
    cout << "*";
    twelveHourClock();
    cout << " *" << " * ";
    twentyfourHourClock();
    cout << " *" << endl;
    starPrint(2, 32);
    cout << endl;
}

void showMenu() {
    while (menuLoop) {
        starPrint(1, 32);
        cout << endl;
        cout << "* 1- Add Hour *";
        cout << endl;
        cout << "* 2- Add Minute *" << endl;
        cout << "* 3- Add Second *" << endl;
        cout << "* 4- Exit Program *" << endl;
        starPrint(2, 32);
        cin >> dataEdit;
        switch (dataEdit) {
            case 1:
                hour++;
                milHour++;
                printClock();
                break;
            case 2:
                minute++;
                printClock();
                break;
            case 3:
                second++;
                printClock();
                break;
            case 4:
                cout << "Program Ended" << endl;
                menuLoop = false;
                break;
        }
    }
}

string getTime() {
    time_t now = time(0);
    char* timeStr = ctime(&now);
    istringstream iss(timeStr);
    vector<string> dt;
    string s;
    string t;
    string clock;
    string hh;
    while (getline(iss, s, ' ')) {
        dt.push_back(s.c_str());
    }
    return dt.at(3);
}

int main() {
    string clockTime = getTime();
    milHour = stoi(clockTime.substr(0, 2));
    minute = stoi(clockTime.substr(3, 2));
    second = stoi(clockTime.substr(6, 2));
    if (milHour <= 12) {
        hour = milHour;
    } else {
        hour = milHour - 12;
    }
    printClock();
    showMenu();
    return 0;
}