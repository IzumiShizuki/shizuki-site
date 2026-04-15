.class public final Lt4/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls4/h;


# instance fields
.field public final a:Lt4/b;

.field public final b:Ls4/h;

.field public final c:Ls4/e0;

.field public final d:Ls4/h;

.field public final e:Lt4/j;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public i:Landroid/net/Uri;

.field public j:Ls4/m;

.field public k:Ls4/m;

.field public l:Ls4/h;

.field public m:J

.field public n:J

.field public o:J

.field public p:Lt4/z;

.field public q:Z

.field public r:Z

.field public s:J


# direct methods
.method public constructor <init>(Lt4/b;Ls4/h;Ls4/h;Lt4/d;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt4/f;->a:Lt4/b;

    .line 5
    .line 6
    iput-object p3, p0, Lt4/f;->b:Ls4/h;

    .line 7
    .line 8
    sget-object p1, Lt4/j;->a:Lt4/j;

    .line 9
    .line 10
    iput-object p1, p0, Lt4/f;->e:Lt4/j;

    .line 11
    .line 12
    and-int/lit8 p1, p5, 0x1

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    const/4 v0, 0x1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, p0, Lt4/f;->f:Z

    .line 22
    .line 23
    and-int/lit8 p1, p5, 0x2

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    :goto_1
    iput-boolean p1, p0, Lt4/f;->g:Z

    .line 31
    .line 32
    and-int/lit8 p1, p5, 0x4

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    :cond_2
    iput-boolean p3, p0, Lt4/f;->h:Z

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    if-eqz p2, :cond_4

    .line 41
    .line 42
    iput-object p2, p0, Lt4/f;->d:Ls4/h;

    .line 43
    .line 44
    if-eqz p4, :cond_3

    .line 45
    .line 46
    new-instance p1, Ls4/e0;

    .line 47
    .line 48
    invoke-direct {p1, p2, p4}, Ls4/e0;-><init>(Ls4/h;Lt4/d;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iput-object p1, p0, Lt4/f;->c:Ls4/e0;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    sget-object p2, Ls4/a0;->a:Ls4/a0;

    .line 55
    .line 56
    iput-object p2, p0, Lt4/f;->d:Ls4/h;

    .line 57
    .line 58
    iput-object p1, p0, Lt4/f;->c:Ls4/e0;

    .line 59
    .line 60
    return-void
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt4/f;->a:Lt4/b;

    .line 2
    .line 3
    iget-object v1, p0, Lt4/f;->l:Ls4/h;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-interface {v1}, Ls4/h;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iput-object v2, p0, Lt4/f;->k:Ls4/m;

    .line 13
    .line 14
    iput-object v2, p0, Lt4/f;->l:Ls4/h;

    .line 15
    .line 16
    iget-object v1, p0, Lt4/f;->p:Lt4/z;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    check-cast v0, Lt4/y;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lt4/y;->l(Lt4/z;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lt4/f;->p:Lt4/z;

    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    iput-object v2, p0, Lt4/f;->k:Ls4/m;

    .line 30
    .line 31
    iput-object v2, p0, Lt4/f;->l:Ls4/h;

    .line 32
    .line 33
    iget-object v3, p0, Lt4/f;->p:Lt4/z;

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    check-cast v0, Lt4/y;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Lt4/y;->l(Lt4/z;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Lt4/f;->p:Lt4/z;

    .line 43
    .line 44
    :cond_2
    throw v1
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
.end method

.method public final b(Ls4/m;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v7, v0, Ls4/m;->h:Ljava/lang/String;

    .line 6
    .line 7
    sget v2, Lp4/c0;->a:I

    .line 8
    .line 9
    iget-boolean v2, v1, Lt4/f;->r:Z

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move-object v9, v8

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-boolean v2, v1, Lt4/f;->f:Z

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    :try_start_0
    iget-object v2, v1, Lt4/f;->a:Lt4/b;

    .line 21
    .line 22
    iget-wide v3, v1, Lt4/f;->n:J

    .line 23
    .line 24
    iget-wide v5, v1, Lt4/f;->o:J

    .line 25
    .line 26
    check-cast v2, Lt4/y;

    .line 27
    .line 28
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :try_start_1
    invoke-virtual {v2}, Lt4/y;->d()V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual/range {v2 .. v7}, Lt4/y;->p(JJLjava/lang/String;)Lt4/z;

    .line 33
    .line 34
    .line 35
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    if-eqz v9, :cond_1

    .line 37
    .line 38
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 47
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    iget-object v2, v1, Lt4/f;->a:Lt4/b;

    .line 61
    .line 62
    iget-wide v3, v1, Lt4/f;->n:J

    .line 63
    .line 64
    iget-wide v5, v1, Lt4/f;->o:J

    .line 65
    .line 66
    check-cast v2, Lt4/y;

    .line 67
    .line 68
    invoke-virtual/range {v2 .. v7}, Lt4/y;->p(JJLjava/lang/String;)Lt4/z;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    :goto_1
    const-wide/16 v2, -0x1

    .line 73
    .line 74
    if-nez v9, :cond_3

    .line 75
    .line 76
    iget-object v4, v1, Lt4/f;->d:Ls4/h;

    .line 77
    .line 78
    invoke-virtual {v0}, Ls4/m;->a()Ls4/l;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    iget-wide v10, v1, Lt4/f;->n:J

    .line 83
    .line 84
    iput-wide v10, v5, Ls4/l;->f:J

    .line 85
    .line 86
    iget-wide v10, v1, Lt4/f;->o:J

    .line 87
    .line 88
    iput-wide v10, v5, Ls4/l;->g:J

    .line 89
    .line 90
    invoke-virtual {v5}, Ls4/l;->a()Ls4/m;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget-boolean v4, v9, Lt4/k;->d:Z

    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    iget-object v4, v9, Lt4/k;->e:Ljava/io/File;

    .line 100
    .line 101
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-wide v5, v9, Lt4/k;->b:J

    .line 106
    .line 107
    iget-wide v10, v1, Lt4/f;->n:J

    .line 108
    .line 109
    sub-long/2addr v10, v5

    .line 110
    iget-wide v12, v9, Lt4/k;->c:J

    .line 111
    .line 112
    sub-long/2addr v12, v10

    .line 113
    iget-wide v14, v1, Lt4/f;->o:J

    .line 114
    .line 115
    cmp-long v16, v14, v2

    .line 116
    .line 117
    if-eqz v16, :cond_4

    .line 118
    .line 119
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v12

    .line 123
    :cond_4
    invoke-virtual {v0}, Ls4/m;->a()Ls4/l;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    iput-object v4, v14, Ls4/l;->a:Landroid/net/Uri;

    .line 128
    .line 129
    iput-wide v5, v14, Ls4/l;->b:J

    .line 130
    .line 131
    iput-wide v10, v14, Ls4/l;->f:J

    .line 132
    .line 133
    iput-wide v12, v14, Ls4/l;->g:J

    .line 134
    .line 135
    invoke-virtual {v14}, Ls4/l;->a()Ls4/m;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    iget-object v4, v1, Lt4/f;->b:Ls4/h;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    iget-wide v4, v9, Lt4/k;->c:J

    .line 143
    .line 144
    cmp-long v6, v4, v2

    .line 145
    .line 146
    if-nez v6, :cond_6

    .line 147
    .line 148
    iget-wide v4, v1, Lt4/f;->o:J

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    iget-wide v10, v1, Lt4/f;->o:J

    .line 152
    .line 153
    cmp-long v6, v10, v2

    .line 154
    .line 155
    if-eqz v6, :cond_7

    .line 156
    .line 157
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    :cond_7
    :goto_2
    invoke-virtual {v0}, Ls4/m;->a()Ls4/l;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    iget-wide v10, v1, Lt4/f;->n:J

    .line 166
    .line 167
    iput-wide v10, v6, Ls4/l;->f:J

    .line 168
    .line 169
    iput-wide v4, v6, Ls4/l;->g:J

    .line 170
    .line 171
    invoke-virtual {v6}, Ls4/l;->a()Ls4/m;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    iget-object v4, v1, Lt4/f;->c:Ls4/e0;

    .line 176
    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_8
    iget-object v4, v1, Lt4/f;->d:Ls4/h;

    .line 181
    .line 182
    iget-object v6, v1, Lt4/f;->a:Lt4/b;

    .line 183
    .line 184
    check-cast v6, Lt4/y;

    .line 185
    .line 186
    invoke-virtual {v6, v9}, Lt4/y;->l(Lt4/z;)V

    .line 187
    .line 188
    .line 189
    move-object v9, v8

    .line 190
    :goto_3
    iget-boolean v6, v1, Lt4/f;->r:Z

    .line 191
    .line 192
    if-nez v6, :cond_9

    .line 193
    .line 194
    iget-object v6, v1, Lt4/f;->d:Ls4/h;

    .line 195
    .line 196
    if-ne v4, v6, :cond_9

    .line 197
    .line 198
    iget-wide v10, v1, Lt4/f;->n:J

    .line 199
    .line 200
    const-wide/32 v12, 0x19000

    .line 201
    .line 202
    .line 203
    add-long/2addr v10, v12

    .line 204
    goto :goto_4

    .line 205
    :cond_9
    const-wide v10, 0x7fffffffffffffffL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    :goto_4
    iput-wide v10, v1, Lt4/f;->s:J

    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    const/4 v10, 0x1

    .line 214
    if-eqz p2, :cond_d

    .line 215
    .line 216
    iget-object v11, v1, Lt4/f;->l:Ls4/h;

    .line 217
    .line 218
    iget-object v12, v1, Lt4/f;->d:Ls4/h;

    .line 219
    .line 220
    if-ne v11, v12, :cond_a

    .line 221
    .line 222
    const/4 v11, 0x1

    .line 223
    goto :goto_5

    .line 224
    :cond_a
    const/4 v11, 0x0

    .line 225
    :goto_5
    invoke-static {v11}, Lp4/c;->i(Z)V

    .line 226
    .line 227
    .line 228
    iget-object v11, v1, Lt4/f;->d:Ls4/h;

    .line 229
    .line 230
    if-ne v4, v11, :cond_b

    .line 231
    .line 232
    return-void

    .line 233
    :cond_b
    :try_start_5
    invoke-virtual {v1}, Lt4/f;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    iget-boolean v2, v9, Lt4/k;->d:Z

    .line 239
    .line 240
    if-nez v2, :cond_c

    .line 241
    .line 242
    iget-object v2, v1, Lt4/f;->a:Lt4/b;

    .line 243
    .line 244
    check-cast v2, Lt4/y;

    .line 245
    .line 246
    invoke-virtual {v2, v9}, Lt4/y;->l(Lt4/z;)V

    .line 247
    .line 248
    .line 249
    :cond_c
    throw v0

    .line 250
    :cond_d
    :goto_6
    if-eqz v9, :cond_e

    .line 251
    .line 252
    iget-boolean v11, v9, Lt4/k;->d:Z

    .line 253
    .line 254
    if-nez v11, :cond_e

    .line 255
    .line 256
    iput-object v9, v1, Lt4/f;->p:Lt4/z;

    .line 257
    .line 258
    :cond_e
    iput-object v4, v1, Lt4/f;->l:Ls4/h;

    .line 259
    .line 260
    iput-object v5, v1, Lt4/f;->k:Ls4/m;

    .line 261
    .line 262
    const-wide/16 v11, 0x0

    .line 263
    .line 264
    iput-wide v11, v1, Lt4/f;->m:J

    .line 265
    .line 266
    invoke-interface {v4, v5}, Ls4/h;->f(Ls4/m;)J

    .line 267
    .line 268
    .line 269
    move-result-wide v11

    .line 270
    new-instance v9, Lt4/i;

    .line 271
    .line 272
    invoke-direct {v9}, Lt4/i;-><init>()V

    .line 273
    .line 274
    .line 275
    iget-wide v13, v5, Ls4/m;->g:J

    .line 276
    .line 277
    cmp-long v5, v13, v2

    .line 278
    .line 279
    if-nez v5, :cond_f

    .line 280
    .line 281
    cmp-long v5, v11, v2

    .line 282
    .line 283
    if-eqz v5, :cond_f

    .line 284
    .line 285
    iput-wide v11, v1, Lt4/f;->o:J

    .line 286
    .line 287
    iget-wide v2, v1, Lt4/f;->n:J

    .line 288
    .line 289
    add-long/2addr v2, v11

    .line 290
    const-string v5, "exo_len"

    .line 291
    .line 292
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v9, v2, v5}, Lt4/i;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :cond_f
    iget-object v2, v1, Lt4/f;->l:Ls4/h;

    .line 300
    .line 301
    iget-object v3, v1, Lt4/f;->b:Ls4/h;

    .line 302
    .line 303
    if-ne v2, v3, :cond_10

    .line 304
    .line 305
    const/4 v6, 0x1

    .line 306
    :cond_10
    if-nez v6, :cond_13

    .line 307
    .line 308
    invoke-interface {v4}, Ls4/h;->w()Landroid/net/Uri;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iput-object v2, v1, Lt4/f;->i:Landroid/net/Uri;

    .line 313
    .line 314
    iget-object v0, v0, Ls4/m;->a:Landroid/net/Uri;

    .line 315
    .line 316
    invoke-virtual {v0, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-nez v0, :cond_11

    .line 321
    .line 322
    iget-object v8, v1, Lt4/f;->i:Landroid/net/Uri;

    .line 323
    .line 324
    :cond_11
    const-string v0, "exo_redir"

    .line 325
    .line 326
    if-nez v8, :cond_12

    .line 327
    .line 328
    iget-object v2, v9, Lt4/i;->b:Ljava/io/Serializable;

    .line 329
    .line 330
    check-cast v2, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    iget-object v2, v9, Lt4/i;->a:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v2, Ljava/util/HashMap;

    .line 338
    .line 339
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_12
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v9, v2, v0}, Lt4/i;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_13
    :goto_7
    iget-object v0, v1, Lt4/f;->l:Ls4/h;

    .line 351
    .line 352
    iget-object v2, v1, Lt4/f;->c:Ls4/e0;

    .line 353
    .line 354
    if-ne v0, v2, :cond_14

    .line 355
    .line 356
    iget-object v0, v1, Lt4/f;->a:Lt4/b;

    .line 357
    .line 358
    check-cast v0, Lt4/y;

    .line 359
    .line 360
    invoke-virtual {v0, v7, v9}, Lt4/y;->c(Ljava/lang/String;Lt4/i;)V

    .line 361
    .line 362
    .line 363
    :cond_14
    return-void
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt4/f;->j:Ls4/m;

    .line 3
    .line 4
    iput-object v0, p0, Lt4/f;->i:Landroid/net/Uri;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lt4/f;->n:J

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lt4/f;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    iget-object v1, p0, Lt4/f;->l:Ls4/h;

    .line 16
    .line 17
    iget-object v2, p0, Lt4/f;->b:Ls4/h;

    .line 18
    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    instance-of v1, v0, Lt4/a;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Lt4/f;->q:Z

    .line 27
    .line 28
    :cond_1
    throw v0
    .line 29
.end method

.method public final f(Ls4/m;)J
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lt4/f;->a:Lt4/b;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    iget-object v4, v1, Lt4/f;->e:Lt4/j;

    .line 9
    .line 10
    invoke-virtual {v4, v0}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-wide v5, v0, Ls4/m;->f:J

    .line 15
    .line 16
    iget-wide v7, v0, Ls4/m;->g:J

    .line 17
    .line 18
    invoke-virtual {v0}, Ls4/m;->a()Ls4/l;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v4, v0, Ls4/l;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0}, Ls4/l;->a()Ls4/m;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, v1, Lt4/f;->j:Ls4/m;

    .line 29
    .line 30
    iget-object v9, v0, Ls4/m;->a:Landroid/net/Uri;

    .line 31
    .line 32
    move-object v10, v2

    .line 33
    check-cast v10, Lt4/y;

    .line 34
    .line 35
    invoke-virtual {v10, v4}, Lt4/y;->j(Ljava/lang/String;)Lt4/s;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    const-string v11, "exo_redir"

    .line 40
    .line 41
    iget-object v10, v10, Lt4/s;->b:Ljava/util/Map;

    .line 42
    .line 43
    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    check-cast v10, [B

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    if-eqz v10, :cond_0

    .line 51
    .line 52
    new-instance v12, Ljava/lang/String;

    .line 53
    .line 54
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 55
    .line 56
    invoke-direct {v12, v10, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v12, v11

    .line 61
    :goto_0
    if-nez v12, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    :goto_1
    if-eqz v11, :cond_2

    .line 69
    .line 70
    move-object v9, v11

    .line 71
    :cond_2
    iput-object v9, v1, Lt4/f;->i:Landroid/net/Uri;

    .line 72
    .line 73
    iput-wide v5, v1, Lt4/f;->n:J

    .line 74
    .line 75
    iget-boolean v9, v1, Lt4/f;->g:Z

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    const-wide/16 v11, -0x1

    .line 79
    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    iget-boolean v9, v1, Lt4/f;->q:Z

    .line 83
    .line 84
    if-eqz v9, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    iget-boolean v9, v1, Lt4/f;->h:Z

    .line 88
    .line 89
    if-eqz v9, :cond_4

    .line 90
    .line 91
    cmp-long v9, v7, v11

    .line 92
    .line 93
    if-nez v9, :cond_4

    .line 94
    .line 95
    :goto_2
    const/4 v9, 0x1

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    const/4 v9, 0x0

    .line 98
    :goto_3
    iput-boolean v9, v1, Lt4/f;->r:Z

    .line 99
    .line 100
    const-wide/16 v13, 0x0

    .line 101
    .line 102
    if-eqz v9, :cond_5

    .line 103
    .line 104
    iput-wide v11, v1, Lt4/f;->o:J

    .line 105
    .line 106
    move-wide v15, v11

    .line 107
    goto :goto_4

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_6

    .line 110
    :cond_5
    check-cast v2, Lt4/y;

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Lt4/y;->j(Ljava/lang/String;)Lt4/s;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    move-wide v15, v11

    .line 117
    invoke-static {v2}, Lq/t0;->t(Lt4/r;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v11

    .line 121
    iput-wide v11, v1, Lt4/f;->o:J

    .line 122
    .line 123
    cmp-long v2, v11, v15

    .line 124
    .line 125
    if-eqz v2, :cond_7

    .line 126
    .line 127
    sub-long/2addr v11, v5

    .line 128
    iput-wide v11, v1, Lt4/f;->o:J

    .line 129
    .line 130
    cmp-long v2, v11, v13

    .line 131
    .line 132
    if-ltz v2, :cond_6

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    new-instance v0, Ls4/j;

    .line 136
    .line 137
    const/16 v2, 0x7d8

    .line 138
    .line 139
    invoke-direct {v0, v2}, Ls4/j;-><init>(I)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_7
    :goto_4
    cmp-long v2, v7, v15

    .line 144
    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    iget-wide v4, v1, Lt4/f;->o:J

    .line 148
    .line 149
    cmp-long v6, v4, v15

    .line 150
    .line 151
    if-nez v6, :cond_8

    .line 152
    .line 153
    move-wide v4, v7

    .line 154
    goto :goto_5

    .line 155
    :cond_8
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    :goto_5
    iput-wide v4, v1, Lt4/f;->o:J

    .line 160
    .line 161
    :cond_9
    iget-wide v4, v1, Lt4/f;->o:J

    .line 162
    .line 163
    cmp-long v6, v4, v13

    .line 164
    .line 165
    if-gtz v6, :cond_a

    .line 166
    .line 167
    cmp-long v6, v4, v15

    .line 168
    .line 169
    if-nez v6, :cond_b

    .line 170
    .line 171
    :cond_a
    invoke-virtual {v1, v0, v10}, Lt4/f;->b(Ls4/m;Z)V

    .line 172
    .line 173
    .line 174
    :cond_b
    if-eqz v2, :cond_c

    .line 175
    .line 176
    return-wide v7

    .line 177
    :cond_c
    iget-wide v2, v1, Lt4/f;->o:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    return-wide v2

    .line 180
    :goto_6
    iget-object v2, v1, Lt4/f;->l:Ls4/h;

    .line 181
    .line 182
    iget-object v4, v1, Lt4/f;->b:Ls4/h;

    .line 183
    .line 184
    if-eq v2, v4, :cond_d

    .line 185
    .line 186
    instance-of v2, v0, Lt4/a;

    .line 187
    .line 188
    if-eqz v2, :cond_e

    .line 189
    .line 190
    :cond_d
    iput-boolean v3, v1, Lt4/f;->q:Z

    .line 191
    .line 192
    :cond_e
    throw v0
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

.method public final p()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/f;->l:Ls4/h;

    .line 2
    .line 3
    iget-object v1, p0, Lt4/f;->b:Ls4/h;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lt4/f;->d:Ls4/h;

    .line 13
    .line 14
    invoke-interface {v0}, Ls4/h;->p()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final read([BII)I
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    iget-object v2, v1, Lt4/f;->b:Ls4/h;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v3

    .line 11
    :cond_0
    iget-wide v4, v1, Lt4/f;->o:J

    .line 12
    .line 13
    const/4 v6, -0x1

    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    cmp-long v9, v4, v7

    .line 17
    .line 18
    if-nez v9, :cond_1

    .line 19
    .line 20
    return v6

    .line 21
    :cond_1
    iget-object v4, v1, Lt4/f;->j:Ls4/m;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v5, v1, Lt4/f;->k:Ls4/m;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    :try_start_0
    iget-wide v10, v1, Lt4/f;->n:J

    .line 33
    .line 34
    iget-wide v12, v1, Lt4/f;->s:J

    .line 35
    .line 36
    cmp-long v14, v10, v12

    .line 37
    .line 38
    if-ltz v14, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1, v4, v9}, Lt4/f;->b(Ls4/m;Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_2
    :goto_0
    iget-object v10, v1, Lt4/f;->l:Ls4/h;

    .line 48
    .line 49
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-object/from16 v11, p1

    .line 53
    .line 54
    move/from16 v12, p2

    .line 55
    .line 56
    invoke-interface {v10, v11, v12, v0}, Lm4/i;->read([BII)I

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    const-wide/16 v13, -0x1

    .line 61
    .line 62
    if-eq v10, v6, :cond_4

    .line 63
    .line 64
    iget-wide v3, v1, Lt4/f;->n:J

    .line 65
    .line 66
    int-to-long v5, v10

    .line 67
    add-long/2addr v3, v5

    .line 68
    iput-wide v3, v1, Lt4/f;->n:J

    .line 69
    .line 70
    iget-wide v3, v1, Lt4/f;->m:J

    .line 71
    .line 72
    add-long/2addr v3, v5

    .line 73
    iput-wide v3, v1, Lt4/f;->m:J

    .line 74
    .line 75
    iget-wide v3, v1, Lt4/f;->o:J

    .line 76
    .line 77
    cmp-long v0, v3, v13

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    sub-long/2addr v3, v5

    .line 82
    iput-wide v3, v1, Lt4/f;->o:J

    .line 83
    .line 84
    return v10

    .line 85
    :cond_3
    move/from16 v17, v10

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    iget-object v6, v1, Lt4/f;->l:Ls4/h;

    .line 89
    .line 90
    if-ne v6, v2, :cond_5

    .line 91
    .line 92
    const/4 v15, 0x1

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    const/4 v15, 0x0

    .line 95
    :goto_1
    if-nez v15, :cond_8

    .line 96
    .line 97
    move-wide v15, v13

    .line 98
    iget-wide v13, v5, Ls4/m;->g:J

    .line 99
    .line 100
    cmp-long v5, v13, v15

    .line 101
    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    move/from16 v17, v10

    .line 105
    .line 106
    iget-wide v9, v1, Lt4/f;->m:J

    .line 107
    .line 108
    cmp-long v18, v9, v13

    .line 109
    .line 110
    if-gez v18, :cond_9

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    move/from16 v17, v10

    .line 114
    .line 115
    :goto_2
    iget-object v0, v4, Ls4/m;->h:Ljava/lang/String;

    .line 116
    .line 117
    sget v4, Lp4/c0;->a:I

    .line 118
    .line 119
    iput-wide v7, v1, Lt4/f;->o:J

    .line 120
    .line 121
    iget-object v4, v1, Lt4/f;->c:Ls4/e0;

    .line 122
    .line 123
    if-ne v6, v4, :cond_7

    .line 124
    .line 125
    const/4 v3, 0x1

    .line 126
    :cond_7
    if-eqz v3, :cond_a

    .line 127
    .line 128
    new-instance v3, Lt4/i;

    .line 129
    .line 130
    invoke-direct {v3}, Lt4/i;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-wide v6, v1, Lt4/f;->n:J

    .line 134
    .line 135
    const-string v4, "exo_len"

    .line 136
    .line 137
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v3, v6, v4}, Lt4/i;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object v4, v1, Lt4/f;->a:Lt4/b;

    .line 145
    .line 146
    check-cast v4, Lt4/y;

    .line 147
    .line 148
    invoke-virtual {v4, v0, v3}, Lt4/y;->c(Ljava/lang/String;Lt4/i;)V

    .line 149
    .line 150
    .line 151
    return v17

    .line 152
    :cond_8
    move/from16 v17, v10

    .line 153
    .line 154
    move-wide v15, v13

    .line 155
    :cond_9
    iget-wide v9, v1, Lt4/f;->o:J

    .line 156
    .line 157
    cmp-long v6, v9, v7

    .line 158
    .line 159
    if-gtz v6, :cond_b

    .line 160
    .line 161
    cmp-long v6, v9, v15

    .line 162
    .line 163
    if-nez v6, :cond_a

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_a
    :goto_3
    return v17

    .line 167
    :cond_b
    :goto_4
    invoke-virtual {v1}, Lt4/f;->a()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v4, v3}, Lt4/f;->b(Ls4/m;Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {p0 .. p3}, Lt4/f;->read([BII)I

    .line 174
    .line 175
    .line 176
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    return v0

    .line 178
    :goto_5
    iget-object v3, v1, Lt4/f;->l:Ls4/h;

    .line 179
    .line 180
    if-eq v3, v2, :cond_c

    .line 181
    .line 182
    instance-of v2, v0, Lt4/a;

    .line 183
    .line 184
    if-eqz v2, :cond_d

    .line 185
    .line 186
    :cond_c
    const/4 v5, 0x1

    .line 187
    iput-boolean v5, v1, Lt4/f;->q:Z

    .line 188
    .line 189
    :cond_d
    throw v0
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final t(Ls4/f0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt4/f;->b:Ls4/h;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ls4/h;->t(Ls4/f0;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lt4/f;->d:Ls4/h;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ls4/h;->t(Ls4/f0;)V

    .line 12
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

.method public final w()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/f;->i:Landroid/net/Uri;

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
