/*
 * Malone はあるゲームに参加しています。
 * このゲームでは数字のカードをいくつか並べて、数字を並び替えることで値を大きくしていくというルールになっています。
 * 並べられている数字 intArr が与えられるので、
 * 数字を並び替えてさらに大きい整数を返す、nextPermitation という関数を作成してください。
 * ただし、大きくなる数値の中で最も小さいものを返すようにしてください。
 * 与えられた数字がすでに最大の場合はそのまま返してください。
 * 例えば、[1,2,3,4] が与えられるとき、1,2,3,4 を並べ替えて得られる数字の中で 1234 より大きく、
 * 最も小さいものは 1243 になるので [1,2,4,3] を返します。
 */
public class Problem124 {
/*
 * C++で解いた。
#include <iostream>
#include <string>
#include <cmath>
#include <vector>
#include <iterator>
#include <sstream>

using namespace std;

bool  nextPermitationHelper(vector<int> intArr){
    for(int i=0;i<intArr.size()-1;i++){
        if(intArr[i]-intArr[i+1]<0) return false;
    }
    return true;

}
vector<int> nextPermitation(vector<int> intArr){
    if(nextPermitationHelper(intArr)) return intArr;
    next_permutation(intArr.begin(),intArr.end());
    return intArr;
}
 */
}
