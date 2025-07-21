char* makeFancyString(char* s) {
    int l = strlen(s);
    char *r = (char*)malloc(l + 1); // +1 for '\0'
    int i = 0, j = 0, c = 1;

    r[j++] = s[0]; // Always include the first character

    for (i = 1; s[i] != '\0'; i++) {
        if (s[i] == s[i - 1]) {
            c++;
        } else {
            c = 1; // Reset count if character changes
        }

        if (c <= 2) {
            r[j++] = s[i];
        }
    }

    r[j] = '\0'; // Null terminate the result
    return r;
}