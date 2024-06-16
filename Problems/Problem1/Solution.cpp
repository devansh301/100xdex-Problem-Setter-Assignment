#include <bits/stdc++.h>
using namespace std;

int longestSubsequence(vector<int> &arr, int k)
{
    map<int, vector<int>> indices;
    for (int i = 0; i < arr.size(); ++i)
    {
        indices[arr[i]].push_back(i);
    }
    int maxLength = 0;
    auto longestDistanceSubsequence = [&](vector<int> &indexList, int k)
    {
        int length = 0;
        int lastIndex = -k;
        for (int index : indexList)
        {
            if (index - lastIndex >= k)
            {
                length += 1;
                lastIndex = index;
            }
        }
        return length;
    };
    for(auto &pair : indices)
    {
        maxLength = max(maxLength, longestDistanceSubsequence(pair.second, k));
    }
    return maxLength;
}

int main()
{
    int N,k;
    cin >> N >> k;
    vector<int> arr(N);
    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }
    cout << longestSubsequence(arr, k) << endl;
    return 0;
}
