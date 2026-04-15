.class public final Lp5/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Lya/a1;

.field public b:Lm4/q;

.field public c:J

.field public d:J

.field public e:J

.field public final synthetic f:Lp5/p;


# direct methods
.method public constructor <init>(Lp5/p;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp5/l;->f:Lp5/p;

    .line 5
    .line 6
    invoke-static {p2}, Lp4/c0;->J(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    sget-object p1, Lya/i0;->b:Lya/g0;

    .line 10
    .line 11
    sget-object p1, Lya/a1;->e:Lya/a1;

    .line 12
    .line 13
    iput-object p1, p0, Lp5/l;->a:Lya/a1;

    .line 14
    .line 15
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Lp5/l;->e:J

    .line 21
    .line 22
    return-void
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


# virtual methods
.method public final a(Z)V
    .locals 14

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lp5/l;->e:J

    .line 7
    .line 8
    iget-object v2, p0, Lp5/l;->f:Lp5/p;

    .line 9
    .line 10
    iget-object v3, v2, Lp5/p;->f:Lp5/c;

    .line 11
    .line 12
    iget-object v4, v2, Lp5/p;->b:Lce/g;

    .line 13
    .line 14
    iget v5, v2, Lp5/p;->k:I

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    if-ne v5, v6, :cond_9

    .line 18
    .line 19
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, v3, Lp5/c;->a:Lp5/r;

    .line 30
    .line 31
    iget-object v11, p1, Lp5/r;->b:Lp5/u;

    .line 32
    .line 33
    iput-wide v9, v11, Lp5/u;->m:J

    .line 34
    .line 35
    const-wide/16 v12, -0x1

    .line 36
    .line 37
    iput-wide v12, v11, Lp5/u;->p:J

    .line 38
    .line 39
    iput-wide v12, v11, Lp5/u;->n:J

    .line 40
    .line 41
    iput-wide v7, p1, Lp5/r;->g:J

    .line 42
    .line 43
    iput-wide v7, p1, Lp5/r;->e:J

    .line 44
    .line 45
    invoke-virtual {p1, v5}, Lp5/r;->d(I)V

    .line 46
    .line 47
    .line 48
    iput-wide v7, p1, Lp5/r;->h:J

    .line 49
    .line 50
    :cond_0
    iget-object p1, v3, Lp5/c;->c:Lp5/v;

    .line 51
    .line 52
    iget-object v11, p1, Lp5/v;->d:Lce/g;

    .line 53
    .line 54
    iget-object v12, p1, Lp5/v;->f:Lm4/j;

    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    iput v13, v12, Lm4/j;->b:I

    .line 58
    .line 59
    iput v13, v12, Lm4/j;->c:I

    .line 60
    .line 61
    iput-wide v7, p1, Lp5/v;->g:J

    .line 62
    .line 63
    iget-object p1, p1, Lp5/v;->e:Lce/g;

    .line 64
    .line 65
    invoke-virtual {p1}, Lce/g;->D()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-lez v7, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Lce/g;->D()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-lez v7, :cond_1

    .line 76
    .line 77
    const/4 v7, 0x1

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/4 v7, 0x0

    .line 80
    :goto_0
    invoke-static {v7}, Lp4/c;->c(Z)V

    .line 81
    .line 82
    .line 83
    :goto_1
    invoke-virtual {p1}, Lce/g;->D()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-le v7, v5, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1}, Lce/g;->x()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {p1}, Lce/g;->x()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    check-cast v7, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {p1, v9, v10, v7}, Lce/g;->a(JLjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-virtual {v11}, Lce/g;->D()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-lez p1, :cond_6

    .line 110
    .line 111
    invoke-virtual {v11}, Lce/g;->D()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-lez p1, :cond_4

    .line 116
    .line 117
    const/4 v13, 0x1

    .line 118
    :cond_4
    invoke-static {v13}, Lp4/c;->c(Z)V

    .line 119
    .line 120
    .line 121
    :goto_2
    invoke-virtual {v11}, Lce/g;->D()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-le p1, v5, :cond_5

    .line 126
    .line 127
    invoke-virtual {v11}, Lce/g;->x()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    invoke-virtual {v11}, Lce/g;->x()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast p1, Lm4/u1;

    .line 139
    .line 140
    invoke-virtual {v11, v9, v10, p1}, Lce/g;->a(JLjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    iget-object p1, v3, Lp5/c;->d:Ljava/util/ArrayDeque;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 146
    .line 147
    .line 148
    :goto_3
    invoke-virtual {v4}, Lce/g;->D()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-le p1, v6, :cond_7

    .line 153
    .line 154
    invoke-virtual {v4}, Lce/g;->x()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    invoke-virtual {v4}, Lce/g;->D()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-ne p1, v6, :cond_8

    .line 163
    .line 164
    invoke-virtual {v4}, Lce/g;->x()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Ljava/lang/Long;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v4

    .line 177
    iget-wide v6, v2, Lp5/p;->m:J

    .line 178
    .line 179
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v3 .. v9}, Lp5/c;->a(JJJ)V

    .line 185
    .line 186
    .line 187
    :cond_8
    iput-wide v0, v2, Lp5/p;->l:J

    .line 188
    .line 189
    iget-object p1, v2, Lp5/p;->i:Lp4/x;

    .line 190
    .line 191
    invoke-static {p1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance v0, Lj2/m;

    .line 195
    .line 196
    invoke-direct {v0, v2}, Lj2/m;-><init>(Lp5/p;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v0}, Lp4/x;->c(Ljava/lang/Runnable;)Z

    .line 200
    .line 201
    .line 202
    :cond_9
    return-void
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

.method public final b(Lm4/q;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget v1, v0, Lp5/p;->k:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, Lm4/q;->B:Lm4/h;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Lm4/h;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    :cond_1
    sget-object v1, Lm4/h;->h:Lm4/h;

    .line 24
    .line 25
    :cond_2
    iget v1, v1, Lm4/h;->c:I

    .line 26
    .line 27
    const/4 v2, 0x7

    .line 28
    if-ne v1, v2, :cond_3

    .line 29
    .line 30
    sget v1, Lp4/c0;->a:I

    .line 31
    .line 32
    const/16 v2, 0x22

    .line 33
    .line 34
    if-ge v1, v2, :cond_3

    .line 35
    .line 36
    new-instance v1, Lm4/h;

    .line 37
    .line 38
    :cond_3
    iget-object v1, v0, Lp5/p;->g:Lp4/v;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v1, v2, v3}, Lp4/v;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp4/x;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, v0, Lp5/p;->i:Lp4/x;

    .line 53
    .line 54
    :try_start_0
    iget-object v0, v0, Lp5/p;->c:Lp5/o;

    .line 55
    .line 56
    invoke-virtual {v0}, Lp5/o;->a()V
    :try_end_0
    .catch Lm4/s1; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    throw v3

    .line 60
    :catch_0
    move-exception v0

    .line 61
    new-instance v1, Lp5/a0;

    .line 62
    .line 63
    invoke-direct {v1, v0, p1}, Lp5/a0;-><init>(Ljava/lang/Exception;Lm4/q;)V

    .line 64
    .line 65
    .line 66
    throw v1
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
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 4
    .line 5
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lp5/r;->c(Z)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 4
    .line 5
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 6
    .line 7
    iget-object v0, v0, Lp5/r;->b:Lp5/u;

    .line 8
    .line 9
    iget v1, v0, Lp5/u;->j:I

    .line 10
    .line 11
    if-ne v1, p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput p1, v0, Lp5/u;->j:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-virtual {v0, p1}, Lp5/u;->d(Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
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

.method public final e(Landroid/view/Surface;Lp4/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget-object v1, v0, Lp5/p;->j:Landroid/util/Pair;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/view/Surface;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lp5/p;->j:Landroid/util/Pair;

    .line 18
    .line 19
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lp4/u;

    .line 22
    .line 23
    invoke-virtual {v1, p2}, Lp4/u;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, v0, Lp5/p;->j:Landroid/util/Pair;

    .line 35
    .line 36
    iget p1, p2, Lp4/u;->a:I

    .line 37
    .line 38
    return-void
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

.method public final f(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 4
    .line 5
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lp5/r;->g(F)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public final g(JJJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget-object v1, v0, Lp5/p;->b:Lce/g;

    .line 4
    .line 5
    iget-wide v5, p0, Lp5/l;->e:J

    .line 6
    .line 7
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v2, v5, v7

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 v7, 0x1

    .line 20
    .line 21
    add-long/2addr v5, v7

    .line 22
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v5, v6, v2}, Lce/g;->a(JLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-wide p3, p0, Lp5/l;->c:J

    .line 30
    .line 31
    iput-wide p3, v0, Lp5/p;->m:J

    .line 32
    .line 33
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 34
    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    move-wide v3, p3

    .line 43
    invoke-virtual/range {v0 .. v6}, Lp5/c;->a(JJJ)V

    .line 44
    .line 45
    .line 46
    move-wide v0, p5

    .line 47
    iput-wide v0, p0, Lp5/l;->d:J

    .line 48
    .line 49
    return-void
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

.method public final h(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp5/l;->a:Lya/a1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 11
    .line 12
    iget-object v1, v0, Lp5/p;->c:Lp5/o;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lya/f0;

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-direct {v1, v2}, Lya/c0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, v0, Lp5/p;->e:Lya/a1;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lya/f0;->f()Lya/a1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lp5/l;->a:Lya/a1;

    .line 36
    .line 37
    iget-object p1, p0, Lp5/l;->b:Lm4/q;

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :cond_1
    invoke-virtual {p1}, Lm4/q;->a()Lm4/p;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object p1, p1, Lm4/q;->B:Lm4/h;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Lm4/h;->d()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    :cond_2
    sget-object p1, Lm4/h;->h:Lm4/h;

    .line 57
    .line 58
    :cond_3
    iput-object p1, v0, Lm4/p;->A:Lm4/h;

    .line 59
    .line 60
    invoke-virtual {v0}, Lm4/p;->a()Lm4/q;

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-static {p1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    throw p1
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
.end method

.method public final i(Lp5/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/l;->f:Lp5/p;

    .line 2
    .line 3
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 4
    .line 5
    iput-object p1, v0, Lp5/c;->i:Lp5/q;

    .line 6
    .line 7
    return-void
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
.end method

.method public final j()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lp5/l;->e:J

    .line 2
    .line 3
    iget-object v2, p0, Lp5/l;->f:Lp5/p;

    .line 4
    .line 5
    iget-wide v3, v2, Lp5/p;->l:J

    .line 6
    .line 7
    cmp-long v5, v3, v0

    .line 8
    .line 9
    if-ltz v5, :cond_0

    .line 10
    .line 11
    iget-object v0, v2, Lp5/p;->f:Lp5/c;

    .line 12
    .line 13
    iget-object v0, v0, Lp5/c;->c:Lp5/v;

    .line 14
    .line 15
    iget-wide v0, v0, Lp5/v;->g:J

    .line 16
    .line 17
    :cond_0
    return-void
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
