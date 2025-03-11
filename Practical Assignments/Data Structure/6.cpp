#include <iostream>
#include <queue>

using namespace std;

int main() {
    queue<int> marksQueue;
    int totalMarks = 0;
    const int numSubjects = 5;
    int mark;

    cout << "Enter marks for " << numSubjects << " subjects (out of 100):\n";
    
    for (int i = 0; i < numSubjects; i++) {
        cout << "Subject " << (i + 1) << ": ";
        cin >> mark;
        marksQueue.push(mark);
        totalMarks += mark;
    }
    
    double percentage = (static_cast<double>(totalMarks) / (numSubjects * 100)) * 100;
    
    cout << "Total Marks: " << totalMarks << " out of " << (numSubjects * 100) << endl;
    cout << "Percentage: " << percentage << "%" << endl;
    
    return 0;
}