.class public abstract Li7/u;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li7/u;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final a(Llf/f;Lk4/a;)Llf/j0;
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Li7/i;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, p1, v3}, Li7/i;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, Li7/u;->f(Llf/f;Lic/o;)Llf/f;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v1, Li7/j;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, v2, v3}, Li7/j;-><init>(ILyb/c;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Li7/s;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v0, p0, v1, v3, v4}, Li7/s;-><init>(Llf/f;Lic/o;Lyb/c;I)V

    .line 30
    .line 31
    .line 32
    new-instance p0, Li7/n;

    .line 33
    .line 34
    invoke-direct {p0, v0}, Li7/n;-><init>(Lic/n;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Li7/h;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, v1}, Li7/h;-><init>(Li7/n;I)V

    .line 41
    .line 42
    .line 43
    new-instance p0, La0/c0;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    const/16 v4, 0xa

    .line 47
    .line 48
    invoke-direct {p0, v1, v3, v4}, La0/c0;-><init>(ILyb/c;I)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Li7/v1;

    .line 52
    .line 53
    invoke-direct {v1, p0, v0}, Li7/v1;-><init>(Lic/n;Llf/f;)V

    .line 54
    .line 55
    .line 56
    new-instance p0, Li7/k;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, v2, v3, v0}, Li7/k;-><init>(ILyb/c;I)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Llf/n;

    .line 63
    .line 64
    invoke-direct {v0, v1, p0}, Llf/n;-><init>(Llf/f;Lic/o;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Llf/p0;->i(Llf/f;)Lk9/c;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget v0, p0, Lk9/c;->c:I

    .line 72
    .line 73
    iget-object v1, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lkf/a;

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-static {v2, v0, v1}, Llf/p0;->a(IILkf/a;)Llf/o0;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    iget-object v0, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lyb/h;

    .line 85
    .line 86
    iget-object p0, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v5, p0

    .line 89
    check-cast v5, Llf/f;

    .line 90
    .line 91
    sget-object v7, Llf/p0;->a:Lapp/nekogram/translator/r;

    .line 92
    .line 93
    sget-object p0, Llf/s0;->a:Llf/u0;

    .line 94
    .line 95
    sget-object v4, Llf/s0;->b:Llf/u0;

    .line 96
    .line 97
    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_0

    .line 102
    .line 103
    sget-object p0, Lhf/z;->a:Lhf/z;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    sget-object p0, Lhf/z;->d:Lhf/z;

    .line 107
    .line 108
    :goto_0
    new-instance v3, Le/j;

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    invoke-direct/range {v3 .. v8}, Le/j;-><init>(Llf/t0;Llf/f;Llf/h0;Ljava/lang/Object;Lyb/c;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0, p0, v3}, Lhf/a0;->x(Lhf/y;Lyb/h;Lhf/z;Lic/n;)Lhf/r1;

    .line 115
    .line 116
    .line 117
    new-instance p0, Llf/j0;

    .line 118
    .line 119
    invoke-direct {p0, v6}, Llf/j0;-><init>(Llf/o0;)V

    .line 120
    .line 121
    .line 122
    return-object p0
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static final b(Li7/l1;Lic/n;)Li7/l1;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li7/l1;

    .line 7
    .line 8
    iget-object v1, p0, Li7/l1;->a:Llf/f;

    .line 9
    .line 10
    new-instance v2, Li7/v1;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, v1, p1, v3}, Li7/v1;-><init>(Llf/f;Lic/n;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Li7/l1;->b:Li7/r2;

    .line 17
    .line 18
    iget-object p0, p0, Li7/l1;->c:Lb0/c1;

    .line 19
    .line 20
    sget-object v1, Li7/k1;->b:Li7/k1;

    .line 21
    .line 22
    invoke-direct {v0, v2, p1, p0, v1}, Li7/l1;-><init>(Llf/f;Li7/r2;Lb0/c1;Lic/a;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static final c(Li7/l1;Lic/n;)Li7/l1;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li7/l1;

    .line 7
    .line 8
    iget-object v1, p0, Li7/l1;->a:Llf/f;

    .line 9
    .line 10
    new-instance v2, Li7/v1;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v1, p1, v3}, Li7/v1;-><init>(Llf/f;Lic/n;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Li7/l1;->b:Li7/r2;

    .line 17
    .line 18
    iget-object p0, p0, Li7/l1;->c:Lb0/c1;

    .line 19
    .line 20
    sget-object v1, Li7/k1;->b:Li7/k1;

    .line 21
    .line 22
    invoke-direct {v0, v2, p1, p0, v1}, Li7/l1;-><init>(Llf/f;Li7/r2;Lb0/c1;Lic/a;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static final d(Li7/u2;Li7/u2;Li7/d0;)Z
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of v1, p1, Li7/t2;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    instance-of v1, p0, Li7/s2;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    instance-of v1, p0, Li7/t2;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    instance-of v1, p1, Li7/s2;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    return v2

    .line 29
    :cond_2
    iget v1, p0, Li7/u2;->c:I

    .line 30
    .line 31
    iget v3, p1, Li7/u2;->c:I

    .line 32
    .line 33
    if-eq v1, v3, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget v1, p0, Li7/u2;->d:I

    .line 37
    .line 38
    iget v3, p1, Li7/u2;->d:I

    .line 39
    .line 40
    if-eq v1, v3, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    invoke-virtual {p1, p2}, Li7/u2;->a(Li7/d0;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, p2}, Li7/u2;->a(Li7/d0;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-gt p1, p0, :cond_5

    .line 52
    .line 53
    return v2

    .line 54
    :cond_5
    :goto_0
    return v0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static final e(Lic/n;)Llf/f;
    .locals 2

    .line 1
    new-instance v0, Lba/u0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lba/u0;-><init>(Lic/n;Lyb/c;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Li7/n;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Li7/n;-><init>(Lic/n;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, -0x2

    .line 13
    invoke-static {p0, v0}, Llf/p0;->g(Llf/f;I)Llf/f;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static final f(Llf/f;Lic/o;)Llf/f;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li7/s;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, p0, p1, v1, v2}, Li7/s;-><init>(Llf/f;Lic/o;Lyb/c;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Li7/u;->e(Lic/n;)Llf/f;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
