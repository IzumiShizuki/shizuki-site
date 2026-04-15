.class public abstract Ls4/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls4/h;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:Ls4/m;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ls4/c;->a:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ls4/c;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
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


# virtual methods
.method public final a(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Ls4/c;->d:Ls4/m;

    .line 2
    .line 3
    sget v1, Lp4/c0;->a:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    iget v3, p0, Ls4/c;->c:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_3

    .line 10
    .line 11
    iget-object v3, p0, Ls4/c;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ls4/f0;

    .line 18
    .line 19
    iget-boolean v4, p0, Ls4/c;->a:Z

    .line 20
    .line 21
    check-cast v3, Ln5/i;

    .line 22
    .line 23
    monitor-enter v3

    .line 24
    :try_start_0
    sget-object v5, Ln5/i;->n:Lya/a1;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget v4, v0, Ls4/m;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    const/16 v5, 0x8

    .line 31
    .line 32
    and-int/2addr v4, v5

    .line 33
    if-ne v4, v5, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const/4 v4, 0x1

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_1
    const/4 v4, 0x0

    .line 39
    :goto_2
    if-nez v4, :cond_2

    .line 40
    .line 41
    monitor-exit v3

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    :try_start_1
    iget-wide v4, v3, Ln5/i;->h:J

    .line 44
    .line 45
    int-to-long v6, p1

    .line 46
    add-long/2addr v4, v6

    .line 47
    iput-wide v4, v3, Ln5/i;->h:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    monitor-exit v3

    .line 50
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    throw p1

    .line 56
    :cond_3
    return-void
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
.end method

.method public final b()V
    .locals 13

    .line 1
    iget-object v0, p0, Ls4/c;->d:Ls4/m;

    .line 2
    .line 3
    sget v1, Lp4/c0;->a:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    iget v3, p0, Ls4/c;->c:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_7

    .line 10
    .line 11
    iget-object v3, p0, Ls4/c;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ls4/f0;

    .line 18
    .line 19
    iget-boolean v4, p0, Ls4/c;->a:Z

    .line 20
    .line 21
    move-object v5, v3

    .line 22
    check-cast v5, Ln5/i;

    .line 23
    .line 24
    monitor-enter v5

    .line 25
    :try_start_0
    sget-object v3, Ln5/i;->n:Lya/a1;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget v4, v0, Ls4/m;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    const/16 v6, 0x8

    .line 33
    .line 34
    and-int/2addr v4, v6

    .line 35
    if-ne v4, v6, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    const/4 v4, 0x1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :goto_1
    const/4 v4, 0x0

    .line 41
    :goto_2
    if-nez v4, :cond_2

    .line 42
    .line 43
    monitor-exit v5

    .line 44
    goto :goto_5

    .line 45
    :cond_2
    :try_start_1
    iget v4, v5, Ln5/i;->f:I

    .line 46
    .line 47
    if-lez v4, :cond_3

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    const/4 v4, 0x0

    .line 52
    :goto_3
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v5, Ln5/i;->c:Lp4/v;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v11

    .line 64
    iget-wide v6, v5, Ln5/i;->g:J

    .line 65
    .line 66
    sub-long v6, v11, v6

    .line 67
    .line 68
    long-to-int v6, v6

    .line 69
    iget-wide v7, v5, Ln5/i;->i:J

    .line 70
    .line 71
    int-to-long v9, v6

    .line 72
    add-long/2addr v7, v9

    .line 73
    iput-wide v7, v5, Ln5/i;->i:J

    .line 74
    .line 75
    iget-wide v7, v5, Ln5/i;->j:J

    .line 76
    .line 77
    iget-wide v9, v5, Ln5/i;->h:J

    .line 78
    .line 79
    add-long/2addr v7, v9

    .line 80
    iput-wide v7, v5, Ln5/i;->j:J

    .line 81
    .line 82
    if-lez v6, :cond_6

    .line 83
    .line 84
    long-to-float v4, v9

    .line 85
    const/high16 v7, 0x45fa0000    # 8000.0f

    .line 86
    .line 87
    mul-float v4, v4, v7

    .line 88
    .line 89
    int-to-float v7, v6

    .line 90
    div-float/2addr v4, v7

    .line 91
    iget-object v7, v5, Ln5/i;->e:Ln5/t;

    .line 92
    .line 93
    long-to-double v8, v9

    .line 94
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    double-to-int v8, v8

    .line 99
    invoke-virtual {v7, v4, v8}, Ln5/t;->a(FI)V

    .line 100
    .line 101
    .line 102
    iget-wide v7, v5, Ln5/i;->i:J

    .line 103
    .line 104
    const-wide/16 v9, 0x7d0

    .line 105
    .line 106
    cmp-long v4, v7, v9

    .line 107
    .line 108
    if-gez v4, :cond_4

    .line 109
    .line 110
    iget-wide v7, v5, Ln5/i;->j:J

    .line 111
    .line 112
    const-wide/32 v9, 0x80000

    .line 113
    .line 114
    .line 115
    cmp-long v4, v7, v9

    .line 116
    .line 117
    if-ltz v4, :cond_5

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto :goto_6

    .line 122
    :cond_4
    :goto_4
    iget-object v4, v5, Ln5/i;->e:Ln5/t;

    .line 123
    .line 124
    invoke-virtual {v4}, Ln5/t;->b()F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    float-to-long v7, v4

    .line 129
    iput-wide v7, v5, Ln5/i;->k:J

    .line 130
    .line 131
    :cond_5
    iget-wide v7, v5, Ln5/i;->h:J

    .line 132
    .line 133
    iget-wide v9, v5, Ln5/i;->k:J

    .line 134
    .line 135
    invoke-virtual/range {v5 .. v10}, Ln5/i;->c(IJJ)V

    .line 136
    .line 137
    .line 138
    iput-wide v11, v5, Ln5/i;->g:J

    .line 139
    .line 140
    const-wide/16 v6, 0x0

    .line 141
    .line 142
    iput-wide v6, v5, Ln5/i;->h:J

    .line 143
    .line 144
    :cond_6
    iget v4, v5, Ln5/i;->f:I

    .line 145
    .line 146
    sub-int/2addr v4, v3

    .line 147
    iput v4, v5, Ln5/i;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    .line 149
    monitor-exit v5

    .line 150
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :goto_6
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 155
    throw v0

    .line 156
    :cond_7
    const/4 v0, 0x0

    .line 157
    iput-object v0, p0, Ls4/c;->d:Ls4/m;

    .line 158
    .line 159
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final c()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Ls4/c;->c:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Ls4/c;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ls4/f0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
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
.end method

.method public final e(Ls4/m;)V
    .locals 7

    .line 1
    iput-object p1, p0, Ls4/c;->d:Ls4/m;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget v2, p0, Ls4/c;->c:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_4

    .line 8
    .line 9
    iget-object v2, p0, Ls4/c;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ls4/f0;

    .line 16
    .line 17
    iget-boolean v3, p0, Ls4/c;->a:Z

    .line 18
    .line 19
    check-cast v2, Ln5/i;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    sget-object v4, Ln5/i;->n:Lya/a1;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget v3, p1, Ls4/m;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    const/16 v5, 0x8

    .line 30
    .line 31
    and-int/2addr v3, v5

    .line 32
    if-ne v3, v5, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 v3, 0x1

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    const/4 v3, 0x0

    .line 38
    :goto_2
    if-nez v3, :cond_2

    .line 39
    .line 40
    monitor-exit v2

    .line 41
    goto :goto_4

    .line 42
    :cond_2
    :try_start_1
    iget v3, v2, Ln5/i;->f:I

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    iget-object v3, v2, Ln5/i;->c:Lp4/v;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    iput-wide v5, v2, Ln5/i;->g:J

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_5

    .line 60
    :cond_3
    :goto_3
    iget v3, v2, Ln5/i;->f:I

    .line 61
    .line 62
    add-int/2addr v3, v4

    .line 63
    iput v3, v2, Ln5/i;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    monitor-exit v2

    .line 66
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_5
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    throw p1

    .line 71
    :cond_4
    return-void
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

.method public p()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final t(Ls4/f0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls4/c;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget p1, p0, Ls4/c;->c:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    iput p1, p0, Ls4/c;->c:I

    .line 20
    .line 21
    :cond_0
    return-void
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
