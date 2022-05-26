#include <string>

using namespace std;

bool solution(string s) {
    bool answer = true;

    for (int i = 0; i < s.length(); i++) {
        if (s.length() == 4 || s.length() == 6) {
            if (s[i] > 60 && s[i] < 130) {
                answer = false;
                break;
            }
        }
        else {
            answer = false;
        }
    }
    return answer;
}
/*
   for (int i = 0; i < s.size(); i++)
    {
        if (!isdigit(s[i]))
            answer = false;
    }
*/