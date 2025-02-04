function shortestPalindrome(s: string): string {
    const wordLength: number = s.length;
    const reversedString: string = s.split('').reverse().join('');
    const newWord: string = s + "#" + reversedString;
    const lps: number[] = new Array(newWord.length).fill(0);

    let i = 0, j = 1;
    while (j < newWord.length) {
        if (newWord[i] === newWord[j]) {
            lps[j] = i + 1;
            i++;
            j++;
        } else {
            if (i != 0) {
                i = lps[i - 1];
            } else {
                lps[j] = 0;
                j++;
            }
        }
    }

    const diff: number = wordLength - lps[wordLength * 2];
    return reversedString.substring(0, diff) + s;
};