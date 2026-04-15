.class public final La5/b;
.super Landroidx/media3/exoplayer/offline/b0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final k:Lb0/w1;


# direct methods
.method public constructor <init>(Lm4/i0;Lt4/e;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    new-instance v0, Lz4/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lz4/e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/media3/exoplayer/offline/b0;-><init>(Lm4/i0;Ln5/q;Lt4/e;Ljava/util/concurrent/Executor;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lb0/w1;

    .line 10
    .line 11
    const/16 p2, 0x19

    .line 12
    .line 13
    invoke-direct {p1, p2}, Lb0/w1;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La5/b;->k:Lb0/w1;

    .line 17
    .line 18
    return-void
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
.method public final e(Lt4/f;Landroidx/media3/exoplayer/offline/t;Z)Ljava/util/ArrayList;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    check-cast v3, Lz4/c;

    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    iget-object v0, v3, Lz4/c;->m:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge v6, v0, :cond_a

    .line 22
    .line 23
    invoke-virtual {v3, v6}, Lz4/c;->b(I)Lz4/h;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-wide v7, v0, Lz4/h;->b:J

    .line 28
    .line 29
    invoke-static {v7, v8}, Lp4/c0;->N(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    invoke-virtual {v3, v6}, Lz4/c;->d(I)J

    .line 34
    .line 35
    .line 36
    move-result-wide v9

    .line 37
    iget-object v11, v0, Lz4/h;->c:Ljava/util/List;

    .line 38
    .line 39
    const/4 v12, 0x0

    .line 40
    :goto_1
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-ge v12, v0, :cond_9

    .line 45
    .line 46
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v13, v0

    .line 51
    check-cast v13, Lz4/a;

    .line 52
    .line 53
    const/4 v14, 0x0

    .line 54
    :goto_2
    iget-object v0, v13, Lz4/a;->c:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-ge v14, v0, :cond_8

    .line 61
    .line 62
    iget-object v0, v13, Lz4/a;->c:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lz4/m;

    .line 69
    .line 70
    :try_start_0
    iget v15, v13, Lz4/a;->b:I

    .line 71
    .line 72
    invoke-virtual {v0}, Lz4/m;->d()Ly4/h;

    .line 73
    .line 74
    .line 75
    move-result-object v16

    .line 76
    if-eqz v16, :cond_0

    .line 77
    .line 78
    move/from16 v17, v6

    .line 79
    .line 80
    move-object/from16 v15, v16

    .line 81
    .line 82
    move-object/from16 v16, v3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_0
    new-instance v5, La5/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 86
    .line 87
    move-object/from16 v16, v3

    .line 88
    .line 89
    move-object/from16 v3, p1

    .line 90
    .line 91
    :try_start_1
    invoke-direct {v5, v3, v15, v0}, La5/a;-><init>(Lt4/f;ILz4/m;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v5, v2}, Landroidx/media3/exoplayer/offline/b0;->c(Lp4/t;Z)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lr5/j;

    .line 99
    .line 100
    if-nez v5, :cond_1

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    move-object v15, v5

    .line 104
    move/from16 v17, v6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_1
    new-instance v15, Lbh/a;

    .line 108
    .line 109
    iget-wide v2, v0, Lz4/m;->c:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 110
    .line 111
    move/from16 v17, v6

    .line 112
    .line 113
    const/4 v6, 0x3

    .line 114
    :try_start_2
    invoke-direct {v15, v5, v2, v3, v6}, Lbh/a;-><init>(Ljava/lang/Object;JI)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 115
    .line 116
    .line 117
    :goto_3
    if-eqz v15, :cond_6

    .line 118
    .line 119
    invoke-interface {v15, v9, v10}, Ly4/h;->x(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    const-wide/16 v5, -0x1

    .line 124
    .line 125
    cmp-long v18, v2, v5

    .line 126
    .line 127
    if-eqz v18, :cond_5

    .line 128
    .line 129
    iget-object v5, v1, La5/b;->k:Lb0/w1;

    .line 130
    .line 131
    iget-object v6, v0, Lz4/m;->b:Lya/i0;

    .line 132
    .line 133
    invoke-virtual {v5, v6}, Lb0/w1;->e0(Ljava/util/List;)Lz4/b;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    sget v6, Lp4/c0;->a:I

    .line 138
    .line 139
    iget-object v5, v5, Lz4/b;->a:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v6, v0, Lz4/m;->e:Lz4/j;

    .line 142
    .line 143
    if-eqz v6, :cond_2

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    invoke-static {v0, v5, v6, v1}, Lud/s;->e(Lz4/m;Ljava/lang/String;Lz4/j;I)Ls4/m;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    new-instance v1, Landroidx/media3/exoplayer/offline/z;

    .line 151
    .line 152
    invoke-direct {v1, v7, v8, v6}, Landroidx/media3/exoplayer/offline/z;-><init>(JLs4/m;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_2
    invoke-virtual {v0}, Lz4/m;->f()Lz4/j;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-eqz v1, :cond_3

    .line 163
    .line 164
    const/4 v6, 0x0

    .line 165
    invoke-static {v0, v5, v1, v6}, Lud/s;->e(Lz4/m;Ljava/lang/String;Lz4/j;I)Ls4/m;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v6, Landroidx/media3/exoplayer/offline/z;

    .line 170
    .line 171
    invoke-direct {v6, v7, v8, v1}, Landroidx/media3/exoplayer/offline/z;-><init>(JLs4/m;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_3
    invoke-interface {v15}, Ly4/h;->v()J

    .line 178
    .line 179
    .line 180
    move-result-wide v18

    .line 181
    add-long v2, v18, v2

    .line 182
    .line 183
    const-wide/16 v20, 0x1

    .line 184
    .line 185
    sub-long v2, v2, v20

    .line 186
    .line 187
    move-wide/from16 v22, v2

    .line 188
    .line 189
    move-wide/from16 v1, v18

    .line 190
    .line 191
    :goto_4
    cmp-long v3, v1, v22

    .line 192
    .line 193
    if-gtz v3, :cond_4

    .line 194
    .line 195
    invoke-interface {v15, v1, v2}, Ly4/h;->b(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v18

    .line 199
    move-wide/from16 v24, v7

    .line 200
    .line 201
    add-long v7, v18, v24

    .line 202
    .line 203
    invoke-interface {v15, v1, v2}, Ly4/h;->h(J)Lz4/j;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    const/4 v6, 0x0

    .line 208
    invoke-static {v0, v5, v3, v6}, Lud/s;->e(Lz4/m;Ljava/lang/String;Lz4/j;I)Ls4/m;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v6, Landroidx/media3/exoplayer/offline/z;

    .line 213
    .line 214
    invoke-direct {v6, v7, v8, v3}, Landroidx/media3/exoplayer/offline/z;-><init>(JLs4/m;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    add-long v1, v1, v20

    .line 221
    .line 222
    move-wide/from16 v7, v24

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_4
    move-wide/from16 v24, v7

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_5
    new-instance v0, Landroidx/media3/exoplayer/offline/e;

    .line 229
    .line 230
    const-string v1, "Unbounded segment index"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_6
    move-wide/from16 v24, v7

    .line 237
    .line 238
    :try_start_3
    new-instance v0, Landroidx/media3/exoplayer/offline/e;

    .line 239
    .line 240
    const-string v1, "Missing segment index"

    .line 241
    .line 242
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 246
    :catch_0
    move-exception v0

    .line 247
    goto :goto_7

    .line 248
    :catch_1
    move-exception v0

    .line 249
    goto :goto_6

    .line 250
    :catch_2
    move-exception v0

    .line 251
    goto :goto_5

    .line 252
    :catch_3
    move-exception v0

    .line 253
    move-object/from16 v16, v3

    .line 254
    .line 255
    :goto_5
    move/from16 v17, v6

    .line 256
    .line 257
    :goto_6
    move-wide/from16 v24, v7

    .line 258
    .line 259
    :goto_7
    if-eqz p3, :cond_7

    .line 260
    .line 261
    :goto_8
    add-int/lit8 v14, v14, 0x1

    .line 262
    .line 263
    move-object/from16 v1, p0

    .line 264
    .line 265
    move/from16 v2, p3

    .line 266
    .line 267
    move-object/from16 v3, v16

    .line 268
    .line 269
    move/from16 v6, v17

    .line 270
    .line 271
    move-wide/from16 v7, v24

    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    :cond_7
    throw v0

    .line 276
    :cond_8
    move-object/from16 v16, v3

    .line 277
    .line 278
    move/from16 v17, v6

    .line 279
    .line 280
    move-wide/from16 v24, v7

    .line 281
    .line 282
    add-int/lit8 v12, v12, 0x1

    .line 283
    .line 284
    move-object/from16 v1, p0

    .line 285
    .line 286
    move/from16 v2, p3

    .line 287
    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :cond_9
    move-object/from16 v16, v3

    .line 291
    .line 292
    move/from16 v17, v6

    .line 293
    .line 294
    add-int/lit8 v6, v17, 0x1

    .line 295
    .line 296
    move-object/from16 v1, p0

    .line 297
    .line 298
    move/from16 v2, p3

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_a
    return-object v4
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
