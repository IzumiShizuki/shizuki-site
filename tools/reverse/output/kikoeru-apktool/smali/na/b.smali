.class public final Lna/b;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# static fields
.field public static final synthetic i:[Lpc/u;


# instance fields
.field public e:Ljava/io/Serializable;

.field public f:I

.field public final synthetic g:Z

.field public final synthetic h:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljc/r;

    .line 2
    .line 3
    const-class v1, Lna/c;

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    const-string v3, "<v#0>"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/r;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljc/a0;->f(Ljc/r;)Lpc/r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-array v1, v4, [Lpc/u;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    sput-object v1, Lna/b;->i:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(ZJLyb/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lna/b;->g:Z

    .line 2
    .line 3
    iput-wide p2, p0, Lna/b;->h:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 3

    .line 1
    new-instance p1, Lna/b;

    .line 2
    .line 3
    iget-boolean v0, p0, Lna/b;->g:Z

    .line 4
    .line 5
    iget-wide v1, p0, Lna/b;->h:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Lna/b;-><init>(ZJLyb/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lhf/y;

    .line 2
    .line 3
    check-cast p2, Lyb/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lna/b;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lna/b;

    .line 10
    .line 11
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lna/b;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lna/b;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lna/b;->e:Ljava/io/Serializable;

    .line 9
    .line 10
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lna/b;->g:Z

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    sget-object p1, Lag/z;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-wide v2, p0, Lna/b;->h:J

    .line 36
    .line 37
    invoke-static {v2, v3, p1}, Lag/z;->a(JLjava/lang/String;)Ljava/io/Serializable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    move-object v0, p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-class v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v2, "username"

    .line 54
    .line 55
    const-string v3, ""

    .line 56
    .line 57
    invoke-static {p1, v2, v3, v0}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v0, Lag/z;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget-object v0, Lna/b;->i:[Lpc/u;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    aget-object v0, v0, v3

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    move-object v6, p1

    .line 77
    check-cast v6, Ljava/lang/String;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    sget-object v3, Lbg/d;->a:Lbg/d;

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    iget-wide v7, p0, Lna/b;->h:J

    .line 84
    .line 85
    invoke-static/range {v2 .. v8}, Lag/z;->c(Ljava/lang/String;Lbg/d;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)Ljava/io/Serializable;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_0

    .line 90
    :goto_1
    instance-of p1, v0, Lub/m;

    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    move-object p1, v0

    .line 95
    check-cast p1, Ljava/lang/String;

    .line 96
    .line 97
    sget-object p1, Lh9/d;->a:Lx0/e1;

    .line 98
    .line 99
    iput-object v0, p0, Lna/b;->e:Ljava/io/Serializable;

    .line 100
    .line 101
    iput v1, p0, Lna/b;->f:I

    .line 102
    .line 103
    invoke-static {p0}, Lh9/d;->h(Lac/i;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    sget-object v1, Lzb/a;->a:Lzb/a;

    .line 108
    .line 109
    if-ne p1, v1, :cond_3

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_3
    :goto_2
    const p1, 0x7f0c013f

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const/4 v5, 0x0

    .line 120
    const/16 v6, 0x1ff

    .line 121
    .line 122
    const-wide/16 v2, 0x0

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-static/range {v1 .. v6}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    :cond_4
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-static {v1}, Lna/q;->k(Ljava/lang/Throwable;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_5

    .line 139
    .line 140
    const/4 v5, 0x0

    .line 141
    const/16 v6, 0x1ff

    .line 142
    .line 143
    const-wide/16 v2, 0x0

    .line 144
    .line 145
    const/4 v4, 0x0

    .line 146
    invoke-static/range {v1 .. v6}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    :cond_5
    new-instance p1, Lub/n;

    .line 150
    .line 151
    invoke-direct {p1, v0}, Lub/n;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-object p1
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
