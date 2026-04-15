.class public final synthetic Lt0/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(J[FLjc/w;Ljc/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lt0/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lt0/c;->b:J

    iput-object p3, p0, Lt0/c;->c:Ljava/lang/Object;

    iput-object p4, p0, Lt0/c;->d:Ljava/lang/Object;

    iput-object p5, p0, Lt0/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lt0/j;Lx0/n2;JLq1/e0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lt0/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lt0/c;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lt0/c;->b:J

    iput-object p5, p0, Lt0/c;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lt0/c;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lt0/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [F

    .line 11
    .line 12
    iget-object v2, v1, Lt0/c;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljc/w;

    .line 15
    .line 16
    iget-object v3, v1, Lt0/c;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljc/v;

    .line 19
    .line 20
    move-object/from16 v4, p1

    .line 21
    .line 22
    check-cast v4, Lt2/p;

    .line 23
    .line 24
    iget v5, v4, Lt2/p;->b:I

    .line 25
    .line 26
    iget-object v6, v4, Lt2/p;->a:Lt2/a;

    .line 27
    .line 28
    iget v7, v4, Lt2/p;->c:I

    .line 29
    .line 30
    iget-wide v8, v1, Lt0/c;->b:J

    .line 31
    .line 32
    invoke-static {v8, v9}, Lt2/k0;->e(J)I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    if-le v5, v10, :cond_0

    .line 37
    .line 38
    iget v5, v4, Lt2/p;->b:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v8, v9}, Lt2/k0;->e(J)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    :goto_0
    invoke-static {v8, v9}, Lt2/k0;->d(J)I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-ge v7, v10, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v8, v9}, Lt2/k0;->d(J)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    :goto_1
    invoke-virtual {v4, v5}, Lt2/p;->d(I)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v4, v7}, Lt2/p;->d(I)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-static {v5, v4}, Lt2/c0;->b(II)J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    iget v7, v2, Ljc/w;->a:I

    .line 69
    .line 70
    iget-object v8, v6, Lt2/a;->d:Lu2/k;

    .line 71
    .line 72
    invoke-static {v4, v5}, Lt2/k0;->e(J)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-static {v4, v5}, Lt2/k0;->d(J)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    iget-object v11, v8, Lu2/k;->f:Landroid/text/Layout;

    .line 81
    .line 82
    invoke-virtual {v11}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    if-ltz v9, :cond_2

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    const-string v13, "startOffset must be > 0"

    .line 94
    .line 95
    invoke-static {v13}, Lz2/a;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    if-ge v9, v12, :cond_3

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    const-string v13, "startOffset must be less than text length"

    .line 102
    .line 103
    invoke-static {v13}, Lz2/a;->a(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_3
    if-le v10, v9, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    const-string v13, "endOffset must be greater than startOffset"

    .line 110
    .line 111
    invoke-static {v13}, Lz2/a;->a(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    if-gt v10, v12, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    const-string v12, "endOffset must be smaller or equal to text length"

    .line 118
    .line 119
    invoke-static {v12}, Lz2/a;->a(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_5
    sub-int v12, v10, v9

    .line 123
    .line 124
    mul-int/lit8 v12, v12, 0x4

    .line 125
    .line 126
    array-length v13, v0

    .line 127
    sub-int/2addr v13, v7

    .line 128
    if-lt v13, v12, :cond_6

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_6
    const-string v12, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"

    .line 132
    .line 133
    invoke-static {v12}, Lz2/a;->a(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_6
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    add-int/lit8 v13, v10, -0x1

    .line 141
    .line 142
    invoke-virtual {v11, v13}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    new-instance v14, Lp2/f;

    .line 147
    .line 148
    invoke-direct {v14, v8}, Lp2/f;-><init>(Lu2/k;)V

    .line 149
    .line 150
    .line 151
    if-gt v12, v13, :cond_c

    .line 152
    .line 153
    :goto_7
    invoke-virtual {v11, v12}, Landroid/text/Layout;->getLineStart(I)I

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    move-object/from16 v16, v0

    .line 158
    .line 159
    invoke-virtual {v8, v12}, Lu2/k;->f(I)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {v8, v12}, Lu2/k;->g(I)F

    .line 172
    .line 173
    .line 174
    move-result v17

    .line 175
    invoke-virtual {v8, v12}, Lu2/k;->e(I)F

    .line 176
    .line 177
    .line 178
    move-result v18

    .line 179
    move-wide/from16 v19, v4

    .line 180
    .line 181
    invoke-virtual {v11, v12}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    const/4 v5, 0x1

    .line 186
    move-object/from16 p1, v6

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    if-ne v4, v5, :cond_7

    .line 190
    .line 191
    const/4 v4, 0x1

    .line 192
    goto :goto_8

    .line 193
    :cond_7
    const/4 v4, 0x0

    .line 194
    :goto_8
    if-ge v15, v0, :cond_b

    .line 195
    .line 196
    invoke-virtual {v11, v15}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 197
    .line 198
    .line 199
    move-result v21

    .line 200
    if-eqz v4, :cond_8

    .line 201
    .line 202
    if-nez v21, :cond_8

    .line 203
    .line 204
    invoke-virtual {v14, v15, v6, v6, v5}, Lp2/f;->a(IZZZ)F

    .line 205
    .line 206
    .line 207
    move-result v21

    .line 208
    add-int/lit8 v6, v15, 0x1

    .line 209
    .line 210
    invoke-virtual {v14, v6, v5, v5, v5}, Lp2/f;->a(IZZZ)F

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    move/from16 v22, v0

    .line 215
    .line 216
    move v0, v6

    .line 217
    :goto_9
    const/4 v6, 0x0

    .line 218
    goto :goto_a

    .line 219
    :cond_8
    if-eqz v4, :cond_9

    .line 220
    .line 221
    if-eqz v21, :cond_9

    .line 222
    .line 223
    const/4 v6, 0x0

    .line 224
    invoke-virtual {v14, v15, v6, v6, v6}, Lp2/f;->a(IZZZ)F

    .line 225
    .line 226
    .line 227
    move-result v21

    .line 228
    move/from16 v22, v0

    .line 229
    .line 230
    add-int/lit8 v0, v15, 0x1

    .line 231
    .line 232
    invoke-virtual {v14, v0, v5, v5, v6}, Lp2/f;->a(IZZZ)F

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    move/from16 v32, v21

    .line 237
    .line 238
    move/from16 v21, v0

    .line 239
    .line 240
    move/from16 v0, v32

    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_9
    move/from16 v22, v0

    .line 244
    .line 245
    const/4 v6, 0x0

    .line 246
    if-nez v4, :cond_a

    .line 247
    .line 248
    if-eqz v21, :cond_a

    .line 249
    .line 250
    invoke-virtual {v14, v15, v6, v6, v5}, Lp2/f;->a(IZZZ)F

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    add-int/lit8 v6, v15, 0x1

    .line 255
    .line 256
    invoke-virtual {v14, v6, v5, v5, v5}, Lp2/f;->a(IZZZ)F

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    move/from16 v21, v6

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_a
    invoke-virtual {v14, v15, v6, v6, v6}, Lp2/f;->a(IZZZ)F

    .line 264
    .line 265
    .line 266
    move-result v21

    .line 267
    add-int/lit8 v0, v15, 0x1

    .line 268
    .line 269
    invoke-virtual {v14, v0, v5, v5, v6}, Lp2/f;->a(IZZZ)F

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    :goto_a
    aput v21, v16, v7

    .line 274
    .line 275
    add-int/lit8 v21, v7, 0x1

    .line 276
    .line 277
    aput v17, v16, v21

    .line 278
    .line 279
    add-int/lit8 v21, v7, 0x2

    .line 280
    .line 281
    aput v0, v16, v21

    .line 282
    .line 283
    add-int/lit8 v0, v7, 0x3

    .line 284
    .line 285
    aput v18, v16, v0

    .line 286
    .line 287
    add-int/lit8 v7, v7, 0x4

    .line 288
    .line 289
    add-int/lit8 v15, v15, 0x1

    .line 290
    .line 291
    move/from16 v0, v22

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_b
    if-eq v12, v13, :cond_d

    .line 295
    .line 296
    add-int/lit8 v12, v12, 0x1

    .line 297
    .line 298
    move-object/from16 v6, p1

    .line 299
    .line 300
    move-object/from16 v0, v16

    .line 301
    .line 302
    move-wide/from16 v4, v19

    .line 303
    .line 304
    goto/16 :goto_7

    .line 305
    .line 306
    :cond_c
    move-object/from16 v16, v0

    .line 307
    .line 308
    move-wide/from16 v19, v4

    .line 309
    .line 310
    move-object/from16 p1, v6

    .line 311
    .line 312
    :cond_d
    iget v0, v2, Ljc/w;->a:I

    .line 313
    .line 314
    invoke-static/range {v19 .. v20}, Lt2/k0;->c(J)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    mul-int/lit8 v4, v4, 0x4

    .line 319
    .line 320
    add-int/2addr v4, v0

    .line 321
    iget v0, v2, Ljc/w;->a:I

    .line 322
    .line 323
    :goto_b
    if-ge v0, v4, :cond_e

    .line 324
    .line 325
    add-int/lit8 v5, v0, 0x1

    .line 326
    .line 327
    aget v6, v16, v5

    .line 328
    .line 329
    iget v7, v3, Ljc/v;->a:F

    .line 330
    .line 331
    add-float/2addr v6, v7

    .line 332
    aput v6, v16, v5

    .line 333
    .line 334
    add-int/lit8 v5, v0, 0x3

    .line 335
    .line 336
    aget v6, v16, v5

    .line 337
    .line 338
    add-float/2addr v6, v7

    .line 339
    aput v6, v16, v5

    .line 340
    .line 341
    add-int/lit8 v0, v0, 0x4

    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_e
    iput v4, v2, Ljc/w;->a:I

    .line 345
    .line 346
    iget v0, v3, Ljc/v;->a:F

    .line 347
    .line 348
    invoke-virtual/range {p1 .. p1}, Lt2/a;->b()F

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    add-float/2addr v2, v0

    .line 353
    iput v2, v3, Ljc/v;->a:F

    .line 354
    .line 355
    :goto_c
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_0
    iget-object v0, v1, Lt0/c;->c:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lt0/j;

    .line 361
    .line 362
    iget-object v2, v1, Lt0/c;->d:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v2, Lx0/n2;

    .line 365
    .line 366
    iget-wide v4, v1, Lt0/c;->b:J

    .line 367
    .line 368
    iget-object v3, v1, Lt0/c;->e:Ljava/lang/Object;

    .line 369
    .line 370
    move-object v15, v3

    .line 371
    check-cast v15, Lq1/e0;

    .line 372
    .line 373
    move-object/from16 v3, p1

    .line 374
    .line 375
    check-cast v3, Ls1/d;

    .line 376
    .line 377
    invoke-virtual {v0}, Lt0/j;->a()F

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    iget-object v0, v0, Lt0/j;->g:Lx0/a1;

    .line 382
    .line 383
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    div-float/2addr v6, v0

    .line 388
    const/high16 v0, 0x3f800000    # 1.0f

    .line 389
    .line 390
    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    const v8, 0x3ecccccd    # 0.4f

    .line 395
    .line 396
    .line 397
    sub-float/2addr v7, v8

    .line 398
    const/4 v9, 0x0

    .line 399
    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    const/4 v10, 0x5

    .line 404
    int-to-float v10, v10

    .line 405
    mul-float v7, v7, v10

    .line 406
    .line 407
    const/4 v10, 0x3

    .line 408
    int-to-float v10, v10

    .line 409
    div-float/2addr v7, v10

    .line 410
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    sub-float/2addr v6, v0

    .line 415
    cmpg-float v10, v6, v9

    .line 416
    .line 417
    if-gez v10, :cond_f

    .line 418
    .line 419
    goto :goto_d

    .line 420
    :cond_f
    move v9, v6

    .line 421
    :goto_d
    const/high16 v6, 0x40000000    # 2.0f

    .line 422
    .line 423
    cmpl-float v10, v9, v6

    .line 424
    .line 425
    if-lez v10, :cond_10

    .line 426
    .line 427
    const/high16 v9, 0x40000000    # 2.0f

    .line 428
    .line 429
    :cond_10
    float-to-double v10, v9

    .line 430
    const/4 v12, 0x2

    .line 431
    int-to-double v12, v12

    .line 432
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 433
    .line 434
    .line 435
    move-result-wide v10

    .line 436
    double-to-float v10, v10

    .line 437
    const/4 v11, 0x4

    .line 438
    int-to-float v11, v11

    .line 439
    div-float/2addr v10, v11

    .line 440
    sub-float/2addr v9, v10

    .line 441
    const v10, 0x3f4ccccd    # 0.8f

    .line 442
    .line 443
    .line 444
    mul-float v10, v10, v7

    .line 445
    .line 446
    const/high16 v11, -0x41800000    # -0.25f

    .line 447
    .line 448
    mul-float v8, v8, v7

    .line 449
    .line 450
    add-float/2addr v8, v11

    .line 451
    add-float/2addr v8, v9

    .line 452
    const/high16 v9, 0x3f000000    # 0.5f

    .line 453
    .line 454
    mul-float v8, v8, v9

    .line 455
    .line 456
    const/16 v9, 0x168

    .line 457
    .line 458
    int-to-float v9, v9

    .line 459
    const/high16 v11, 0x40000000    # 2.0f

    .line 460
    .line 461
    mul-float v6, v8, v9

    .line 462
    .line 463
    add-float/2addr v10, v8

    .line 464
    mul-float v10, v10, v9

    .line 465
    .line 466
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    new-instance v7, Lq/v0;

    .line 471
    .line 472
    invoke-direct {v7, v8, v6, v10, v0}, Lq/v0;-><init>(FFFF)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    check-cast v0, Ljava/lang/Number;

    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 482
    .line 483
    .line 484
    move-result v12

    .line 485
    invoke-interface {v3}, Ls1/d;->c0()J

    .line 486
    .line 487
    .line 488
    move-result-wide v13

    .line 489
    invoke-interface {v3}, Ls1/d;->S()Lc7/e1;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    move-wide/from16 v16, v4

    .line 494
    .line 495
    invoke-virtual {v2}, Lc7/e1;->D()J

    .line 496
    .line 497
    .line 498
    move-result-wide v4

    .line 499
    invoke-virtual {v2}, Lc7/e1;->z()Lq1/o;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-interface {v0}, Lq1/o;->f()V

    .line 504
    .line 505
    .line 506
    :try_start_0
    iget-object v0, v2, Lc7/e1;->b:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Lr/y1;

    .line 509
    .line 510
    invoke-virtual {v0, v8, v13, v14}, Lr/y1;->f0(FJ)V

    .line 511
    .line 512
    .line 513
    sget v0, Lt0/f;->c:F

    .line 514
    .line 515
    invoke-interface {v3, v0}, Lf3/c;->Q(F)F

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    sget v8, Lt0/f;->d:F

    .line 520
    .line 521
    invoke-interface {v3, v8}, Lf3/c;->Q(F)F

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    div-float/2addr v9, v11

    .line 526
    add-float/2addr v9, v0

    .line 527
    new-instance v0, Lp1/c;

    .line 528
    .line 529
    invoke-interface {v3}, Ls1/d;->e()J

    .line 530
    .line 531
    .line 532
    move-result-wide v13

    .line 533
    invoke-static {v13, v14}, Lnh/a;->l(J)J

    .line 534
    .line 535
    .line 536
    move-result-wide v13

    .line 537
    const/16 v11, 0x20

    .line 538
    .line 539
    shr-long/2addr v13, v11

    .line 540
    long-to-int v14, v13

    .line 541
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 542
    .line 543
    .line 544
    move-result v13

    .line 545
    sub-float/2addr v13, v9

    .line 546
    invoke-interface {v3}, Ls1/d;->e()J

    .line 547
    .line 548
    .line 549
    move-result-wide v18

    .line 550
    invoke-static/range {v18 .. v19}, Lnh/a;->l(J)J

    .line 551
    .line 552
    .line 553
    move-result-wide v18

    .line 554
    const-wide v20, 0xffffffffL

    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    move/from16 p1, v12

    .line 560
    .line 561
    const/16 v14, 0x20

    .line 562
    .line 563
    and-long v11, v18, v20

    .line 564
    .line 565
    long-to-int v12, v11

    .line 566
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 567
    .line 568
    .line 569
    move-result v11

    .line 570
    sub-float/2addr v11, v9

    .line 571
    invoke-interface {v3}, Ls1/d;->e()J

    .line 572
    .line 573
    .line 574
    move-result-wide v18

    .line 575
    invoke-static/range {v18 .. v19}, Lnh/a;->l(J)J

    .line 576
    .line 577
    .line 578
    move-result-wide v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 579
    move-wide/from16 v22, v4

    .line 580
    .line 581
    shr-long v4, v18, v14

    .line 582
    .line 583
    long-to-int v5, v4

    .line 584
    :try_start_1
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    add-float/2addr v4, v9

    .line 589
    invoke-interface {v3}, Ls1/d;->e()J

    .line 590
    .line 591
    .line 592
    move-result-wide v18

    .line 593
    invoke-static/range {v18 .. v19}, Lnh/a;->l(J)J

    .line 594
    .line 595
    .line 596
    move-result-wide v18

    .line 597
    move v12, v6

    .line 598
    and-long v5, v18, v20

    .line 599
    .line 600
    long-to-int v6, v5

    .line 601
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    add-float/2addr v5, v9

    .line 606
    invoke-direct {v0, v13, v11, v4, v5}, Lp1/c;-><init>(FFFF)V

    .line 607
    .line 608
    .line 609
    sub-float/2addr v10, v12

    .line 610
    invoke-virtual {v0}, Lp1/c;->d()J

    .line 611
    .line 612
    .line 613
    move-result-wide v4

    .line 614
    move-object v9, v7

    .line 615
    move v7, v10

    .line 616
    invoke-virtual {v0}, Lp1/c;->c()J

    .line 617
    .line 618
    .line 619
    move-result-wide v10

    .line 620
    new-instance v24, Ls1/h;

    .line 621
    .line 622
    invoke-interface {v3, v8}, Lf3/c;->Q(F)F

    .line 623
    .line 624
    .line 625
    move-result v25

    .line 626
    const/16 v28, 0x0

    .line 627
    .line 628
    const/16 v29, 0x1a

    .line 629
    .line 630
    const/16 v26, 0x0

    .line 631
    .line 632
    const/16 v27, 0x2

    .line 633
    .line 634
    invoke-direct/range {v24 .. v29}, Ls1/h;-><init>(FFIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 635
    .line 636
    .line 637
    const/16 v14, 0x300

    .line 638
    .line 639
    move-wide/from16 v30, v16

    .line 640
    .line 641
    move-object/from16 v16, v9

    .line 642
    .line 643
    move-wide v8, v4

    .line 644
    move-wide/from16 v4, v30

    .line 645
    .line 646
    move v6, v12

    .line 647
    move-wide/from16 v30, v22

    .line 648
    .line 649
    move-object/from16 v13, v24

    .line 650
    .line 651
    move/from16 v12, p1

    .line 652
    .line 653
    :try_start_2
    invoke-static/range {v3 .. v14}, Lq/t0;->h(Ls1/d;JFFJJFLs1/h;I)V

    .line 654
    .line 655
    .line 656
    move-wide v6, v4

    .line 657
    move v8, v12

    .line 658
    move-object v4, v15

    .line 659
    move-object/from16 v9, v16

    .line 660
    .line 661
    move-object v5, v0

    .line 662
    invoke-static/range {v3 .. v9}, Lt0/f;->c(Ls1/d;Lq1/e0;Lp1/c;JFLq/v0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 663
    .line 664
    .line 665
    move-wide/from16 v3, v30

    .line 666
    .line 667
    invoke-static {v2, v3, v4}, Lq/t0;->L(Lc7/e1;J)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_c

    .line 671
    .line 672
    :catchall_0
    move-exception v0

    .line 673
    move-wide/from16 v3, v30

    .line 674
    .line 675
    goto :goto_e

    .line 676
    :catchall_1
    move-exception v0

    .line 677
    move-wide/from16 v3, v22

    .line 678
    .line 679
    goto :goto_e

    .line 680
    :catchall_2
    move-exception v0

    .line 681
    move-wide v3, v4

    .line 682
    :goto_e
    invoke-static {v2, v3, v4}, Lq/t0;->L(Lc7/e1;J)V

    .line 683
    .line 684
    .line 685
    throw v0

    .line 686
    nop

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
