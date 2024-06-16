#include <bits/stdc++.h>
using namespace std;

int longestNGoodSubsequence(string &s, int N)
{
    unordered_map<char, int> frequency;
    for (char c : s)
    {
        frequency[c]++;
    }
    vector<int> freqCounts;
    for (auto entry : frequency)
    {
        freqCounts.push_back(entry.second);
    }
    sort(freqCounts.begin(), freqCounts.end(), greater<int>());
    if (freqCounts.size() < N - 1)
    {
        return 0;
    }
    int subsequenceLength = 0;
    for (int i = 0; i < N - 1; ++i)
    {
        if (freqCounts[i] < i + 2)
        {
            return 0;
        }
        subsequenceLength += (i + 2);
    }
    return subsequenceLength;
}

int main()
{
    string s;
    int N;
    cin >> s >> N;
    int result = longestNGoodSubsequence(s, N);
    cout << result << endl;
    return 0;
}
