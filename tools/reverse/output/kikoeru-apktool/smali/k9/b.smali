.class public final Lk9/b;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# static fields
.field public static final synthetic h:[Lpc/u;


# instance fields
.field public e:Ljava/io/Serializable;

.field public f:Ljava/io/Serializable;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljc/r;

    .line 2
    .line 3
    const-class v1, Lk9/c;

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    const-string v3, "<v#0>"

    .line 8
    .line 9
    const/4 v4, 0x0

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
    const/4 v1, 0x1

    .line 20
    new-array v1, v1, [Lpc/u;

    .line 21
    .line 22
    aput-object v0, v1, v4

    .line 23
    .line 24
    sput-object v1, Lk9/b;->h:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 1

    .line 1
    new-instance p1, Lk9/b;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, v0, p2}, Lac/i;-><init>(ILyb/c;)V

    .line 5
    .line 6
    .line 7
    return-object p1
    .line 8
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
    invoke-virtual {p0, p1, p2}, Lk9/b;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lk9/b;

    .line 10
    .line 11
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lk9/b;->u(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget v0, p0, Lk9/b;->g:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v4, :cond_2

    .line 14
    .line 15
    if-eq v0, v3, :cond_1

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v0, p0, Lk9/b;->f:Ljava/io/Serializable;

    .line 32
    .line 33
    iget-object v3, p0, Lk9/b;->e:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v3, Lhg/b;

    .line 36
    .line 37
    :goto_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lk9/b;->f:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Lk9/b;->e:Ljava/io/Serializable;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lh9/d;->a:Lx0/e1;

    .line 53
    .line 54
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lbg/a2;

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_4
    iget-object v0, p1, Lbg/a2;->m:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    iget-object v0, p1, Lbg/a2;->w:Ljava/lang/Integer;

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    iget-object v0, p1, Lbg/a2;->t:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-class v4, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v4}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v7, "username"

    .line 88
    .line 89
    const-string v8, ""

    .line 90
    .line 91
    invoke-static {v0, v7, v8, v4}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v4, Lag/z;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    sget-object v4, Lk9/b;->h:[Lpc/u;

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    aget-object v4, v4, v8

    .line 105
    .line 106
    invoke-virtual {v0, v4}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    move-object v11, v0

    .line 111
    check-cast v11, Ljava/lang/String;

    .line 112
    .line 113
    iget-wide v12, p1, Lbg/a2;->f:J

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    sget-object v8, Lbg/d;->a:Lbg/d;

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    invoke-static/range {v7 .. v13}, Lag/z;->c(Ljava/lang/String;Lbg/d;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)Ljava/io/Serializable;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    instance-of p1, v0, Lub/m;

    .line 124
    .line 125
    if-nez p1, :cond_7

    .line 126
    .line 127
    move-object p1, v0

    .line 128
    check-cast p1, Ljava/lang/String;

    .line 129
    .line 130
    const p1, 0x7f0c013f

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object v5, p0, Lk9/b;->e:Ljava/io/Serializable;

    .line 138
    .line 139
    iput-object v0, p0, Lk9/b;->f:Ljava/io/Serializable;

    .line 140
    .line 141
    iput v3, p0, Lk9/b;->g:I

    .line 142
    .line 143
    invoke-static {p1, p0}, Lna/q;->j(Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v6, :cond_7

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    :goto_1
    sget-object v0, Lag/z;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-wide v7, p1, Lbg/a2;->f:J

    .line 157
    .line 158
    invoke-static {v7, v8, v0}, Lag/z;->a(JLjava/lang/String;)Ljava/io/Serializable;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    instance-of p1, v0, Lub/m;

    .line 163
    .line 164
    if-nez p1, :cond_7

    .line 165
    .line 166
    move-object p1, v0

    .line 167
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    const p1, 0x7f0c0061

    .line 170
    .line 171
    .line 172
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iput-object v0, p0, Lk9/b;->e:Ljava/io/Serializable;

    .line 177
    .line 178
    iput-object v5, p0, Lk9/b;->f:Ljava/io/Serializable;

    .line 179
    .line 180
    iput v4, p0, Lk9/b;->g:I

    .line 181
    .line 182
    invoke-static {p1, p0}, Lna/q;->j(Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-ne p1, v6, :cond_7

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    :goto_2
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 196
    .line 197
    .line 198
    const p1, 0x7f0c0078

    .line 199
    .line 200
    .line 201
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    const/4 v11, 0x0

    .line 206
    const/16 v12, 0x1ff

    .line 207
    .line 208
    const-wide/16 v8, 0x0

    .line 209
    .line 210
    const/4 v10, 0x0

    .line 211
    invoke-static/range {v7 .. v12}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    :cond_8
    sget-object p1, Lh9/d;->a:Lx0/e1;

    .line 215
    .line 216
    iput-object v5, p0, Lk9/b;->e:Ljava/io/Serializable;

    .line 217
    .line 218
    iput-object v5, p0, Lk9/b;->f:Ljava/io/Serializable;

    .line 219
    .line 220
    iput v2, p0, Lk9/b;->g:I

    .line 221
    .line 222
    invoke-static {p0}, Lh9/d;->h(Lac/i;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-ne p1, v6, :cond_9

    .line 227
    .line 228
    :goto_3
    return-object v6

    .line 229
    :cond_9
    :goto_4
    return-object v1
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
