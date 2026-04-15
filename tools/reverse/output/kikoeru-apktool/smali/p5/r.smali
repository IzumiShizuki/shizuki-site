.class public final Lp5/r;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lp5/i;

.field public final b:Lp5/u;

.field public c:Z

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Z

.field public j:F

.field public k:Lp4/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lp5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lp5/r;->a:Lp5/i;

    .line 5
    .line 6
    new-instance p2, Lp5/u;

    .line 7
    .line 8
    invoke-direct {p2, p1}, Lp5/u;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lp5/r;->b:Lp5/u;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lp5/r;->d:I

    .line 15
    .line 16
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide p1, p0, Lp5/r;->e:J

    .line 22
    .line 23
    iput-wide p1, p0, Lp5/r;->g:J

    .line 24
    .line 25
    iput-wide p1, p0, Lp5/r;->h:J

    .line 26
    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p1, p0, Lp5/r;->j:F

    .line 30
    .line 31
    sget-object p1, Lp4/v;->a:Lp4/v;

    .line 32
    .line 33
    iput-object p1, p0, Lp5/r;->k:Lp4/v;

    .line 34
    .line 35
    return-void
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
.method public final a(JJJJZLmh/f;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v5, p10

    .line 8
    .line 9
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v6, v5, Lmh/f;->a:J

    .line 15
    .line 16
    iput-wide v6, v5, Lmh/f;->b:J

    .line 17
    .line 18
    iget-wide v8, v0, Lp5/r;->e:J

    .line 19
    .line 20
    cmp-long v10, v8, v6

    .line 21
    .line 22
    if-nez v10, :cond_0

    .line 23
    .line 24
    iput-wide v3, v0, Lp5/r;->e:J

    .line 25
    .line 26
    :cond_0
    iget-wide v8, v0, Lp5/r;->g:J

    .line 27
    .line 28
    const-wide/16 v12, -0x1

    .line 29
    .line 30
    move-wide/from16 v16, v6

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    cmp-long v18, v8, v1

    .line 35
    .line 36
    if-eqz v18, :cond_9

    .line 37
    .line 38
    iget-object v8, v0, Lp5/r;->b:Lp5/u;

    .line 39
    .line 40
    const-wide/16 v18, 0x3e8

    .line 41
    .line 42
    iget-wide v14, v8, Lp5/u;->n:J

    .line 43
    .line 44
    cmp-long v9, v14, v12

    .line 45
    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    iput-wide v14, v8, Lp5/u;->p:J

    .line 49
    .line 50
    iget-wide v14, v8, Lp5/u;->o:J

    .line 51
    .line 52
    iput-wide v14, v8, Lp5/u;->q:J

    .line 53
    .line 54
    :cond_1
    iget-wide v14, v8, Lp5/u;->m:J

    .line 55
    .line 56
    const-wide/16 v20, 0x1

    .line 57
    .line 58
    add-long v14, v14, v20

    .line 59
    .line 60
    iput-wide v14, v8, Lp5/u;->m:J

    .line 61
    .line 62
    iget-object v9, v8, Lp5/u;->a:Lp5/e;

    .line 63
    .line 64
    mul-long v14, v1, v18

    .line 65
    .line 66
    move-wide/from16 v22, v12

    .line 67
    .line 68
    iget-object v12, v9, Lp5/e;->a:Lp5/d;

    .line 69
    .line 70
    invoke-virtual {v12, v14, v15}, Lp5/d;->b(J)V

    .line 71
    .line 72
    .line 73
    iget-object v12, v9, Lp5/e;->a:Lp5/d;

    .line 74
    .line 75
    invoke-virtual {v12}, Lp5/d;->a()Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-eqz v12, :cond_3

    .line 80
    .line 81
    iput-boolean v6, v9, Lp5/e;->c:Z

    .line 82
    .line 83
    :cond_2
    const-wide/16 v24, 0x0

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    iget-wide v12, v9, Lp5/e;->d:J

    .line 87
    .line 88
    cmp-long v24, v12, v16

    .line 89
    .line 90
    if-eqz v24, :cond_2

    .line 91
    .line 92
    iget-boolean v12, v9, Lp5/e;->c:Z

    .line 93
    .line 94
    if-eqz v12, :cond_5

    .line 95
    .line 96
    iget-object v12, v9, Lp5/e;->b:Lp5/d;

    .line 97
    .line 98
    const-wide/16 v24, 0x0

    .line 99
    .line 100
    iget-wide v10, v12, Lp5/d;->d:J

    .line 101
    .line 102
    cmp-long v13, v10, v24

    .line 103
    .line 104
    if-nez v13, :cond_4

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    iget-object v12, v12, Lp5/d;->g:[Z

    .line 109
    .line 110
    sub-long v10, v10, v20

    .line 111
    .line 112
    const-wide/16 v20, 0xf

    .line 113
    .line 114
    rem-long v10, v10, v20

    .line 115
    .line 116
    long-to-int v11, v10

    .line 117
    aget-boolean v10, v12, v11

    .line 118
    .line 119
    :goto_0
    if-eqz v10, :cond_6

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    const-wide/16 v24, 0x0

    .line 123
    .line 124
    :goto_1
    iget-object v10, v9, Lp5/e;->b:Lp5/d;

    .line 125
    .line 126
    invoke-virtual {v10}, Lp5/d;->c()V

    .line 127
    .line 128
    .line 129
    iget-object v10, v9, Lp5/e;->b:Lp5/d;

    .line 130
    .line 131
    iget-wide v11, v9, Lp5/e;->d:J

    .line 132
    .line 133
    invoke-virtual {v10, v11, v12}, Lp5/d;->b(J)V

    .line 134
    .line 135
    .line 136
    :cond_6
    iput-boolean v7, v9, Lp5/e;->c:Z

    .line 137
    .line 138
    iget-object v10, v9, Lp5/e;->b:Lp5/d;

    .line 139
    .line 140
    invoke-virtual {v10, v14, v15}, Lp5/d;->b(J)V

    .line 141
    .line 142
    .line 143
    :goto_2
    iget-boolean v10, v9, Lp5/e;->c:Z

    .line 144
    .line 145
    if-eqz v10, :cond_7

    .line 146
    .line 147
    iget-object v10, v9, Lp5/e;->b:Lp5/d;

    .line 148
    .line 149
    invoke-virtual {v10}, Lp5/d;->a()Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_7

    .line 154
    .line 155
    iget-object v10, v9, Lp5/e;->a:Lp5/d;

    .line 156
    .line 157
    iget-object v11, v9, Lp5/e;->b:Lp5/d;

    .line 158
    .line 159
    iput-object v11, v9, Lp5/e;->a:Lp5/d;

    .line 160
    .line 161
    iput-object v10, v9, Lp5/e;->b:Lp5/d;

    .line 162
    .line 163
    iput-boolean v6, v9, Lp5/e;->c:Z

    .line 164
    .line 165
    :cond_7
    iput-wide v14, v9, Lp5/e;->d:J

    .line 166
    .line 167
    iget-object v10, v9, Lp5/e;->a:Lp5/d;

    .line 168
    .line 169
    invoke-virtual {v10}, Lp5/d;->a()Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_8

    .line 174
    .line 175
    const/4 v10, 0x0

    .line 176
    goto :goto_3

    .line 177
    :cond_8
    iget v10, v9, Lp5/e;->e:I

    .line 178
    .line 179
    add-int/2addr v10, v7

    .line 180
    :goto_3
    iput v10, v9, Lp5/e;->e:I

    .line 181
    .line 182
    invoke-virtual {v8}, Lp5/u;->c()V

    .line 183
    .line 184
    .line 185
    iput-wide v1, v0, Lp5/r;->g:J

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_9
    move-wide/from16 v22, v12

    .line 189
    .line 190
    const-wide/16 v18, 0x3e8

    .line 191
    .line 192
    const-wide/16 v24, 0x0

    .line 193
    .line 194
    :goto_4
    sub-long/2addr v1, v3

    .line 195
    long-to-double v1, v1

    .line 196
    iget v8, v0, Lp5/r;->j:F

    .line 197
    .line 198
    float-to-double v8, v8

    .line 199
    div-double/2addr v1, v8

    .line 200
    double-to-long v1, v1

    .line 201
    iget-boolean v8, v0, Lp5/r;->c:Z

    .line 202
    .line 203
    if-eqz v8, :cond_a

    .line 204
    .line 205
    iget-object v8, v0, Lp5/r;->k:Lp4/v;

    .line 206
    .line 207
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 211
    .line 212
    .line 213
    move-result-wide v8

    .line 214
    invoke-static {v8, v9}, Lp4/c0;->N(J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v8

    .line 218
    sub-long v8, v8, p5

    .line 219
    .line 220
    sub-long/2addr v1, v8

    .line 221
    :cond_a
    iput-wide v1, v5, Lmh/f;->a:J

    .line 222
    .line 223
    iget-wide v8, v0, Lp5/r;->h:J

    .line 224
    .line 225
    const-wide/16 v10, -0x7530

    .line 226
    .line 227
    const/4 v12, 0x3

    .line 228
    const/4 v13, 0x2

    .line 229
    cmp-long v14, v8, v16

    .line 230
    .line 231
    if-eqz v14, :cond_c

    .line 232
    .line 233
    iget-boolean v8, v0, Lp5/r;->i:Z

    .line 234
    .line 235
    if-nez v8, :cond_c

    .line 236
    .line 237
    :cond_b
    const/4 v1, 0x0

    .line 238
    goto :goto_6

    .line 239
    :cond_c
    iget v8, v0, Lp5/r;->d:I

    .line 240
    .line 241
    if-eqz v8, :cond_10

    .line 242
    .line 243
    if-eq v8, v7, :cond_d

    .line 244
    .line 245
    if-eq v8, v13, :cond_f

    .line 246
    .line 247
    if-ne v8, v12, :cond_e

    .line 248
    .line 249
    iget-object v8, v0, Lp5/r;->k:Lp4/v;

    .line 250
    .line 251
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 255
    .line 256
    .line 257
    move-result-wide v8

    .line 258
    invoke-static {v8, v9}, Lp4/c0;->N(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v8

    .line 262
    iget-wide v14, v0, Lp5/r;->f:J

    .line 263
    .line 264
    sub-long/2addr v8, v14

    .line 265
    iget-boolean v14, v0, Lp5/r;->c:Z

    .line 266
    .line 267
    if-eqz v14, :cond_b

    .line 268
    .line 269
    cmp-long v14, v1, v10

    .line 270
    .line 271
    if-gez v14, :cond_b

    .line 272
    .line 273
    const-wide/32 v1, 0x186a0

    .line 274
    .line 275
    .line 276
    cmp-long v14, v8, v1

    .line 277
    .line 278
    if-lez v14, :cond_b

    .line 279
    .line 280
    :cond_d
    :goto_5
    const/4 v1, 0x1

    .line 281
    goto :goto_6

    .line 282
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 283
    .line 284
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 285
    .line 286
    .line 287
    throw v1

    .line 288
    :cond_f
    cmp-long v1, v3, p7

    .line 289
    .line 290
    if-ltz v1, :cond_b

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_10
    iget-boolean v1, v0, Lp5/r;->c:Z

    .line 294
    .line 295
    :goto_6
    if-eqz v1, :cond_11

    .line 296
    .line 297
    return v6

    .line 298
    :cond_11
    iget-boolean v1, v0, Lp5/r;->c:Z

    .line 299
    .line 300
    if-eqz v1, :cond_27

    .line 301
    .line 302
    iget-wide v1, v0, Lp5/r;->e:J

    .line 303
    .line 304
    cmp-long v8, v3, v1

    .line 305
    .line 306
    if-nez v8, :cond_12

    .line 307
    .line 308
    goto/16 :goto_11

    .line 309
    .line 310
    :cond_12
    iget-object v1, v0, Lp5/r;->k:Lp4/v;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 316
    .line 317
    .line 318
    move-result-wide v1

    .line 319
    iget-object v8, v0, Lp5/r;->b:Lp5/u;

    .line 320
    .line 321
    iget-wide v14, v5, Lmh/f;->a:J

    .line 322
    .line 323
    mul-long v14, v14, v18

    .line 324
    .line 325
    add-long/2addr v14, v1

    .line 326
    move-wide/from16 p1, v10

    .line 327
    .line 328
    iget-wide v10, v8, Lp5/u;->p:J

    .line 329
    .line 330
    cmp-long v9, v10, v22

    .line 331
    .line 332
    if-eqz v9, :cond_16

    .line 333
    .line 334
    iget-object v9, v8, Lp5/u;->a:Lp5/e;

    .line 335
    .line 336
    iget-object v9, v9, Lp5/e;->a:Lp5/d;

    .line 337
    .line 338
    invoke-virtual {v9}, Lp5/d;->a()Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-eqz v9, :cond_16

    .line 343
    .line 344
    iget-object v9, v8, Lp5/u;->a:Lp5/e;

    .line 345
    .line 346
    iget-object v10, v9, Lp5/e;->a:Lp5/d;

    .line 347
    .line 348
    invoke-virtual {v10}, Lp5/d;->a()Z

    .line 349
    .line 350
    .line 351
    move-result v10

    .line 352
    if-eqz v10, :cond_14

    .line 353
    .line 354
    iget-object v9, v9, Lp5/e;->a:Lp5/d;

    .line 355
    .line 356
    iget-wide v10, v9, Lp5/d;->e:J

    .line 357
    .line 358
    cmp-long v20, v10, v24

    .line 359
    .line 360
    if-nez v20, :cond_13

    .line 361
    .line 362
    move-wide/from16 v12, v24

    .line 363
    .line 364
    const/16 p5, 0x3

    .line 365
    .line 366
    const/16 p6, 0x2

    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_13
    const/16 p5, 0x3

    .line 370
    .line 371
    const/16 p6, 0x2

    .line 372
    .line 373
    iget-wide v12, v9, Lp5/d;->f:J

    .line 374
    .line 375
    div-long/2addr v12, v10

    .line 376
    goto :goto_7

    .line 377
    :cond_14
    const/16 p5, 0x3

    .line 378
    .line 379
    const/16 p6, 0x2

    .line 380
    .line 381
    move-wide/from16 v12, v16

    .line 382
    .line 383
    :goto_7
    iget-wide v9, v8, Lp5/u;->q:J

    .line 384
    .line 385
    const/16 v20, 0x1

    .line 386
    .line 387
    iget-wide v6, v8, Lp5/u;->m:J

    .line 388
    .line 389
    move-wide/from16 p7, v12

    .line 390
    .line 391
    iget-wide v11, v8, Lp5/u;->p:J

    .line 392
    .line 393
    sub-long/2addr v6, v11

    .line 394
    mul-long v6, v6, p7

    .line 395
    .line 396
    long-to-float v6, v6

    .line 397
    iget v7, v8, Lp5/u;->i:F

    .line 398
    .line 399
    div-float/2addr v6, v7

    .line 400
    float-to-long v6, v6

    .line 401
    add-long/2addr v9, v6

    .line 402
    sub-long v6, v14, v9

    .line 403
    .line 404
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v6

    .line 408
    const-wide/32 v11, 0x1312d00

    .line 409
    .line 410
    .line 411
    cmp-long v21, v6, v11

    .line 412
    .line 413
    if-gtz v21, :cond_15

    .line 414
    .line 415
    move-wide v14, v9

    .line 416
    goto :goto_8

    .line 417
    :cond_15
    move-wide/from16 v6, v24

    .line 418
    .line 419
    iput-wide v6, v8, Lp5/u;->m:J

    .line 420
    .line 421
    move-wide/from16 v6, v22

    .line 422
    .line 423
    iput-wide v6, v8, Lp5/u;->p:J

    .line 424
    .line 425
    iput-wide v6, v8, Lp5/u;->n:J

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_16
    const/16 p5, 0x3

    .line 429
    .line 430
    const/16 p6, 0x2

    .line 431
    .line 432
    const/16 v20, 0x1

    .line 433
    .line 434
    :goto_8
    iget-wide v6, v8, Lp5/u;->m:J

    .line 435
    .line 436
    iput-wide v6, v8, Lp5/u;->n:J

    .line 437
    .line 438
    iput-wide v14, v8, Lp5/u;->o:J

    .line 439
    .line 440
    iget-object v6, v8, Lp5/u;->c:Lp5/t;

    .line 441
    .line 442
    if-eqz v6, :cond_1b

    .line 443
    .line 444
    iget-wide v9, v8, Lp5/u;->k:J

    .line 445
    .line 446
    cmp-long v7, v9, v16

    .line 447
    .line 448
    if-nez v7, :cond_17

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_17
    iget-wide v6, v6, Lp5/t;->a:J

    .line 452
    .line 453
    cmp-long v9, v6, v16

    .line 454
    .line 455
    if-nez v9, :cond_18

    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_18
    iget-wide v9, v8, Lp5/u;->k:J

    .line 459
    .line 460
    sub-long v11, v14, v6

    .line 461
    .line 462
    div-long/2addr v11, v9

    .line 463
    mul-long v11, v11, v9

    .line 464
    .line 465
    add-long/2addr v11, v6

    .line 466
    cmp-long v6, v14, v11

    .line 467
    .line 468
    if-gtz v6, :cond_19

    .line 469
    .line 470
    sub-long v6, v11, v9

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_19
    add-long/2addr v9, v11

    .line 474
    move-wide v6, v11

    .line 475
    move-wide v11, v9

    .line 476
    :goto_9
    sub-long v9, v11, v14

    .line 477
    .line 478
    sub-long/2addr v14, v6

    .line 479
    cmp-long v21, v9, v14

    .line 480
    .line 481
    if-gez v21, :cond_1a

    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_1a
    move-wide v11, v6

    .line 485
    :goto_a
    iget-wide v6, v8, Lp5/u;->l:J

    .line 486
    .line 487
    sub-long v14, v11, v6

    .line 488
    .line 489
    :cond_1b
    :goto_b
    iput-wide v14, v5, Lmh/f;->b:J

    .line 490
    .line 491
    sub-long/2addr v14, v1

    .line 492
    div-long v14, v14, v18

    .line 493
    .line 494
    iput-wide v14, v5, Lmh/f;->a:J

    .line 495
    .line 496
    iget-wide v1, v0, Lp5/r;->h:J

    .line 497
    .line 498
    cmp-long v6, v1, v16

    .line 499
    .line 500
    if-eqz v6, :cond_1c

    .line 501
    .line 502
    iget-boolean v1, v0, Lp5/r;->i:Z

    .line 503
    .line 504
    if-nez v1, :cond_1c

    .line 505
    .line 506
    const/4 v1, 0x1

    .line 507
    goto :goto_c

    .line 508
    :cond_1c
    const/4 v1, 0x0

    .line 509
    :goto_c
    iget-object v2, v0, Lp5/r;->a:Lp5/i;

    .line 510
    .line 511
    const-wide/32 v6, -0x7a120

    .line 512
    .line 513
    .line 514
    cmp-long v8, v14, v6

    .line 515
    .line 516
    if-gez v8, :cond_1d

    .line 517
    .line 518
    if-nez p9, :cond_1d

    .line 519
    .line 520
    iget-object v6, v2, Lv4/e;->i:Lj5/c1;

    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    iget-wide v7, v2, Lv4/e;->k:J

    .line 526
    .line 527
    sub-long/2addr v3, v7

    .line 528
    invoke-interface {v6, v3, v4}, Lj5/c1;->j(J)I

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    if-nez v3, :cond_1e

    .line 533
    .line 534
    :cond_1d
    const/4 v11, 0x0

    .line 535
    goto :goto_e

    .line 536
    :cond_1e
    if-eqz v1, :cond_1f

    .line 537
    .line 538
    iget-object v4, v2, Lg5/q;->N0:Lv4/f;

    .line 539
    .line 540
    iget v6, v4, Lv4/f;->d:I

    .line 541
    .line 542
    add-int/2addr v6, v3

    .line 543
    iput v6, v4, Lv4/f;->d:I

    .line 544
    .line 545
    iget v3, v4, Lv4/f;->f:I

    .line 546
    .line 547
    iget v6, v2, Lp5/i;->o1:I

    .line 548
    .line 549
    add-int/2addr v3, v6

    .line 550
    iput v3, v4, Lv4/f;->f:I

    .line 551
    .line 552
    goto :goto_d

    .line 553
    :cond_1f
    iget-object v4, v2, Lg5/q;->N0:Lv4/f;

    .line 554
    .line 555
    iget v6, v4, Lv4/f;->j:I

    .line 556
    .line 557
    add-int/lit8 v6, v6, 0x1

    .line 558
    .line 559
    iput v6, v4, Lv4/f;->j:I

    .line 560
    .line 561
    iget v4, v2, Lp5/i;->o1:I

    .line 562
    .line 563
    invoke-virtual {v2, v3, v4}, Lp5/i;->G0(II)V

    .line 564
    .line 565
    .line 566
    :goto_d
    invoke-virtual {v2}, Lg5/q;->I()Z

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    if-eqz v3, :cond_20

    .line 571
    .line 572
    invoke-virtual {v2}, Lg5/q;->S()V

    .line 573
    .line 574
    .line 575
    :cond_20
    iget-object v2, v2, Lp5/i;->c1:Lp5/l;

    .line 576
    .line 577
    const/4 v11, 0x0

    .line 578
    if-eqz v2, :cond_21

    .line 579
    .line 580
    invoke-virtual {v2, v11}, Lp5/l;->a(Z)V

    .line 581
    .line 582
    .line 583
    :cond_21
    const/4 v13, 0x1

    .line 584
    goto :goto_f

    .line 585
    :goto_e
    const/4 v13, 0x0

    .line 586
    :goto_f
    if-eqz v13, :cond_22

    .line 587
    .line 588
    const/4 v1, 0x4

    .line 589
    return v1

    .line 590
    :cond_22
    iget-wide v2, v5, Lmh/f;->a:J

    .line 591
    .line 592
    cmp-long v4, v2, p1

    .line 593
    .line 594
    if-gez v4, :cond_23

    .line 595
    .line 596
    if-nez p9, :cond_23

    .line 597
    .line 598
    const/4 v6, 0x1

    .line 599
    goto :goto_10

    .line 600
    :cond_23
    const/4 v6, 0x0

    .line 601
    :goto_10
    if-eqz v6, :cond_25

    .line 602
    .line 603
    if-eqz v1, :cond_24

    .line 604
    .line 605
    return p5

    .line 606
    :cond_24
    return p6

    .line 607
    :cond_25
    const-wide/32 v4, 0xc350

    .line 608
    .line 609
    .line 610
    cmp-long v1, v2, v4

    .line 611
    .line 612
    if-lez v1, :cond_26

    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_26
    return v20

    .line 616
    :cond_27
    :goto_11
    const/4 v1, 0x5

    .line 617
    return v1
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
.end method

.method public final b(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lp5/r;->d:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-ne p1, v3, :cond_0

    .line 13
    .line 14
    iput-wide v1, p0, Lp5/r;->h:J

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-wide v3, p0, Lp5/r;->h:J

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    cmp-long v5, v3, v1

    .line 21
    .line 22
    if-nez v5, :cond_1

    .line 23
    .line 24
    return p1

    .line 25
    :cond_1
    iget-object v3, p0, Lp5/r;->k:Lp4/v;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    iget-wide v5, p0, Lp5/r;->h:J

    .line 35
    .line 36
    cmp-long v7, v3, v5

    .line 37
    .line 38
    if-gez v7, :cond_2

    .line 39
    .line 40
    return v0

    .line 41
    :cond_2
    iput-wide v1, p0, Lp5/r;->h:J

    .line 42
    .line 43
    return p1
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
.end method

.method public final c(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lp5/r;->i:Z

    .line 2
    .line 3
    iget-object p1, p0, Lp5/r;->k:Lp4/v;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x1388

    .line 13
    .line 14
    add-long/2addr v0, v2

    .line 15
    iput-wide v0, p0, Lp5/r;->h:J

    .line 16
    .line 17
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget v0, p0, Lp5/r;->d:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lp5/r;->d:I

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
.end method

.method public final e()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lp5/r;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, Lp5/r;->k:Lp4/v;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Lp4/c0;->N(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, p0, Lp5/r;->f:J

    .line 18
    .line 19
    iget-object v1, p0, Lp5/r;->b:Lp5/u;

    .line 20
    .line 21
    iput-boolean v0, v1, Lp5/u;->d:Z

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    iput-wide v2, v1, Lp5/u;->m:J

    .line 26
    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    iput-wide v2, v1, Lp5/u;->p:J

    .line 30
    .line 31
    iput-wide v2, v1, Lp5/u;->n:J

    .line 32
    .line 33
    iget-object v0, v1, Lp5/u;->b:Lp5/s;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v3, v0, Lp5/s;->a:Landroid/hardware/display/DisplayManager;

    .line 39
    .line 40
    iget-object v4, v1, Lp5/u;->c:Lp5/t;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v4, v4, Lp5/t;->b:Landroid/os/Handler;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {v4}, Lp4/c0;->n(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v3, v0, v4}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, Lp5/s;->b:Lp5/u;

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v0, v3}, Lp5/u;->a(Lp5/u;Landroid/view/Display;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-virtual {v1, v2}, Lp5/u;->d(Z)V

    .line 69
    .line 70
    .line 71
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
.end method

.method public final f()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lp5/r;->c:Z

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lp5/r;->h:J

    .line 10
    .line 11
    iget-object v1, p0, Lp5/r;->b:Lp5/u;

    .line 12
    .line 13
    iput-boolean v0, v1, Lp5/u;->d:Z

    .line 14
    .line 15
    iget-object v0, v1, Lp5/u;->b:Lp5/s;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, Lp5/s;->a:Landroid/hardware/display/DisplayManager;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, Lp5/u;->c:Lp5/t;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lp5/t;->b:Landroid/os/Handler;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, Lp5/u;->b()V

    .line 36
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

.method public final g(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

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
    invoke-static {v0}, Lp4/c;->c(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lp5/r;->j:F

    .line 14
    .line 15
    cmpl-float v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iput p1, p0, Lp5/r;->j:F

    .line 21
    .line 22
    iget-object v0, p0, Lp5/r;->b:Lp5/u;

    .line 23
    .line 24
    iput p1, v0, Lp5/u;->i:F

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    iput-wide v2, v0, Lp5/u;->m:J

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    iput-wide v2, v0, Lp5/u;->p:J

    .line 33
    .line 34
    iput-wide v2, v0, Lp5/u;->n:J

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lp5/u;->d(Z)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method
