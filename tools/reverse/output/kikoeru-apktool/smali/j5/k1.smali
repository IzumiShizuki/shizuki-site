.class public final Lj5/k1;
.super Lj5/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final h:Ls4/m;

.field public final i:Ls4/g;

.field public final j:Lm4/q;

.field public final k:J

.field public final l:Lm3/l;

.field public final m:Z

.field public final n:Lj5/g1;

.field public final o:Lm4/i0;

.field public p:Ls4/f0;


# direct methods
.method public constructor <init>(Lm4/h0;Ls4/g;Lm3/l;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Lj5/a;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    iput-object v2, v0, Lj5/k1;->i:Ls4/g;

    .line 11
    .line 12
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v6, v0, Lj5/k1;->k:J

    .line 18
    .line 19
    move-object/from16 v2, p3

    .line 20
    .line 21
    iput-object v2, v0, Lj5/k1;->l:Lm3/l;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v0, Lj5/k1;->m:Z

    .line 25
    .line 26
    new-instance v3, Lm4/w;

    .line 27
    .line 28
    invoke-direct {v3}, Lm4/w;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lm4/z;

    .line 32
    .line 33
    invoke-direct {v4}, Lm4/z;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v13, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 37
    .line 38
    sget-object v5, Lya/a1;->e:Lya/a1;

    .line 39
    .line 40
    new-instance v5, Lm4/b0;

    .line 41
    .line 42
    invoke-direct {v5}, Lm4/b0;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v20, Lm4/e0;->d:Lm4/e0;

    .line 46
    .line 47
    sget-object v9, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 48
    .line 49
    iget-object v8, v1, Lm4/h0;->a:Landroid/net/Uri;

    .line 50
    .line 51
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v18

    .line 55
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-static {v8}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    iget-object v8, v4, Lm4/z;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, Landroid/net/Uri;

    .line 69
    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    iget-object v8, v4, Lm4/z;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, Ljava/util/UUID;

    .line 75
    .line 76
    if-eqz v8, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const/4 v2, 0x0

    .line 80
    :cond_1
    :goto_0
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    if-eqz v9, :cond_3

    .line 85
    .line 86
    new-instance v8, Lm4/d0;

    .line 87
    .line 88
    iget-object v10, v4, Lm4/z;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v10, Ljava/util/UUID;

    .line 91
    .line 92
    if-eqz v10, :cond_2

    .line 93
    .line 94
    new-instance v10, Lm4/a0;

    .line 95
    .line 96
    invoke-direct {v10, v4}, Lm4/a0;-><init>(Lm4/z;)V

    .line 97
    .line 98
    .line 99
    move-object v11, v10

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move-object v11, v2

    .line 102
    :goto_1
    const/4 v10, 0x0

    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-direct/range {v8 .. v17}, Lm4/d0;-><init>(Landroid/net/Uri;Ljava/lang/String;Lm4/a0;Lm4/v;Ljava/util/List;Ljava/lang/String;Lya/i0;J)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v17, v8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move-object/from16 v17, v2

    .line 117
    .line 118
    :goto_2
    new-instance v14, Lm4/i0;

    .line 119
    .line 120
    new-instance v4, Lm4/y;

    .line 121
    .line 122
    invoke-direct {v4, v3}, Lm4/x;-><init>(Lm4/w;)V

    .line 123
    .line 124
    .line 125
    new-instance v3, Lm4/c0;

    .line 126
    .line 127
    invoke-direct {v3, v5}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 128
    .line 129
    .line 130
    sget-object v19, Lm4/l0;->K:Lm4/l0;

    .line 131
    .line 132
    move-object/from16 v16, v4

    .line 133
    .line 134
    move-object/from16 v15, v18

    .line 135
    .line 136
    move-object/from16 v18, v3

    .line 137
    .line 138
    invoke-direct/range {v14 .. v20}, Lm4/i0;-><init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V

    .line 139
    .line 140
    .line 141
    iput-object v14, v0, Lj5/k1;->o:Lm4/i0;

    .line 142
    .line 143
    new-instance v3, Lm4/p;

    .line 144
    .line 145
    invoke-direct {v3}, Lm4/p;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v4, v1, Lm4/h0;->b:Ljava/lang/String;

    .line 149
    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_4
    const-string v4, "text/x-unknown"

    .line 154
    .line 155
    :goto_3
    invoke-static {v4}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    iput-object v4, v3, Lm4/p;->m:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v4, v1, Lm4/h0;->c:Ljava/lang/String;

    .line 162
    .line 163
    iput-object v4, v3, Lm4/p;->d:Ljava/lang/String;

    .line 164
    .line 165
    iget v4, v1, Lm4/h0;->d:I

    .line 166
    .line 167
    iput v4, v3, Lm4/p;->e:I

    .line 168
    .line 169
    iget v4, v1, Lm4/h0;->e:I

    .line 170
    .line 171
    iput v4, v3, Lm4/p;->f:I

    .line 172
    .line 173
    iget-object v4, v1, Lm4/h0;->f:Ljava/lang/String;

    .line 174
    .line 175
    iput-object v4, v3, Lm4/p;->b:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v4, v1, Lm4/h0;->g:Ljava/lang/String;

    .line 178
    .line 179
    if-eqz v4, :cond_5

    .line 180
    .line 181
    move-object v2, v4

    .line 182
    :cond_5
    iput-object v2, v3, Lm4/p;->a:Ljava/lang/String;

    .line 183
    .line 184
    new-instance v2, Lm4/q;

    .line 185
    .line 186
    invoke-direct {v2, v3}, Lm4/q;-><init>(Lm4/p;)V

    .line 187
    .line 188
    .line 189
    iput-object v2, v0, Lj5/k1;->j:Lm4/q;

    .line 190
    .line 191
    sget-object v21, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 192
    .line 193
    iget-object v1, v1, Lm4/h0;->a:Landroid/net/Uri;

    .line 194
    .line 195
    const-string v2, "The uri must be set."

    .line 196
    .line 197
    invoke-static {v1, v2}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    new-instance v15, Ls4/m;

    .line 201
    .line 202
    const-wide/16 v17, 0x0

    .line 203
    .line 204
    const/16 v19, 0x1

    .line 205
    .line 206
    const/16 v20, 0x0

    .line 207
    .line 208
    const-wide/16 v22, 0x0

    .line 209
    .line 210
    const-wide/16 v24, -0x1

    .line 211
    .line 212
    const/16 v26, 0x0

    .line 213
    .line 214
    const/16 v27, 0x1

    .line 215
    .line 216
    move-object/from16 v16, v1

    .line 217
    .line 218
    invoke-direct/range {v15 .. v27}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    iput-object v15, v0, Lj5/k1;->h:Ls4/m;

    .line 222
    .line 223
    new-instance v1, Lj5/g1;

    .line 224
    .line 225
    const/16 v16, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    const-wide/16 v10, 0x0

    .line 240
    .line 241
    const-wide/16 v12, 0x0

    .line 242
    .line 243
    move-object/from16 v18, v14

    .line 244
    .line 245
    const/4 v14, 0x1

    .line 246
    const/4 v15, 0x0

    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    move-wide v8, v6

    .line 250
    invoke-direct/range {v1 .. v19}, Lj5/g1;-><init>(JJJJJJZZZLpe/d;Lm4/i0;Lm4/c0;)V

    .line 251
    .line 252
    .line 253
    iput-object v1, v0, Lj5/k1;->n:Lj5/g1;

    .line 254
    .line 255
    return-void
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


# virtual methods
.method public final c(Lj5/d0;Ln5/f;J)Lj5/b0;
    .locals 11

    .line 1
    new-instance v0, Lj5/j1;

    .line 2
    .line 3
    iget-object v3, p0, Lj5/k1;->p:Ls4/f0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lj5/a;->b(Lj5/d0;)Lah/j;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    iget-boolean v9, p0, Lj5/k1;->m:Z

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    iget-object v1, p0, Lj5/k1;->h:Ls4/m;

    .line 13
    .line 14
    iget-object v2, p0, Lj5/k1;->i:Ls4/g;

    .line 15
    .line 16
    iget-object v4, p0, Lj5/k1;->j:Lm4/q;

    .line 17
    .line 18
    iget-wide v5, p0, Lj5/k1;->k:J

    .line 19
    .line 20
    iget-object v7, p0, Lj5/k1;->l:Lm3/l;

    .line 21
    .line 22
    invoke-direct/range {v0 .. v10}, Lj5/j1;-><init>(Ls4/m;Ls4/g;Ls4/f0;Lm4/q;JLm3/l;Lah/j;ZLo5/a;)V

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

.method public final i()Lm4/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/k1;->o:Lm4/i0;

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

.method public final k()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final m(Ls4/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj5/k1;->p:Ls4/f0;

    .line 2
    .line 3
    iget-object p1, p0, Lj5/k1;->n:Lj5/g1;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lj5/a;->n(Lm4/i1;)V

    .line 6
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final o(Lj5/b0;)V
    .locals 1

    .line 1
    check-cast p1, Lj5/j1;

    .line 2
    .line 3
    iget-object p1, p1, Lj5/j1;->i:Ln5/o;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Ln5/o;->e(Ln5/m;)V

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
.end method

.method public final q()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
