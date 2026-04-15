.class public final Lc2/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg2/c0;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/d;->e:Ljava/lang/Object;

    .line 8
    new-instance p1, Lo/g0;

    invoke-direct {p1}, Lo/g0;-><init>()V

    iput-object p1, p0, Lc2/d;->f:Ljava/lang/Object;

    .line 9
    new-instance p1, Lc2/k;

    invoke-direct {p1}, Lc2/k;-><init>()V

    iput-object p1, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 10
    new-instance p1, Lo/c0;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lo/c0;-><init>(I)V

    iput-object p1, p0, Lc2/d;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lic/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    check-cast p1, Ljc/m;

    iput-object p1, p0, Lc2/d;->e:Ljava/lang/Object;

    .line 3
    invoke-static {}, Lq1/a0;->a()[F

    move-result-object p1

    iput-object p1, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 4
    invoke-static {}, Lq1/a0;->a()[F

    move-result-object p1

    iput-object p1, p0, Lc2/d;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lc2/d;->c:Z

    .line 6
    iput-boolean p1, p0, Lc2/d;->d:Z

    return-void
.end method


# virtual methods
.method public a(JLjava/util/List;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    iget-object v4, v0, Lc2/d;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, Lc2/k;

    .line 10
    .line 11
    iget-object v5, v0, Lc2/d;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, Lo/c0;

    .line 14
    .line 15
    invoke-virtual {v5}, Lo/c0;->a()V

    .line 16
    .line 17
    .line 18
    move-object v6, v3

    .line 19
    check-cast v6, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    move-object v11, v4

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x1

    .line 29
    :goto_0
    if-ge v9, v6, :cond_7

    .line 30
    .line 31
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v12

    .line 35
    check-cast v12, Lj1/p;

    .line 36
    .line 37
    iget-boolean v13, v12, Lj1/p;->n:Z

    .line 38
    .line 39
    if-eqz v13, :cond_6

    .line 40
    .line 41
    new-instance v13, Lb0/s1;

    .line 42
    .line 43
    const/4 v14, 0x2

    .line 44
    invoke-direct {v13, v14, v0, v12}, Lb0/s1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object v13, v12, Lj1/p;->m:Lb0/s1;

    .line 48
    .line 49
    if-eqz v10, :cond_4

    .line 50
    .line 51
    iget-object v13, v11, Lc2/k;->a:Lz0/e;

    .line 52
    .line 53
    iget-object v14, v13, Lz0/e;->a:[Ljava/lang/Object;

    .line 54
    .line 55
    iget v13, v13, Lz0/e;->c:I

    .line 56
    .line 57
    const/4 v15, 0x0

    .line 58
    :goto_1
    if-ge v15, v13, :cond_1

    .line 59
    .line 60
    aget-object v16, v14, v15

    .line 61
    .line 62
    move-object/from16 v8, v16

    .line 63
    .line 64
    check-cast v8, Lc2/j;

    .line 65
    .line 66
    iget-object v8, v8, Lc2/j;->c:Lj1/p;

    .line 67
    .line 68
    invoke-static {v8, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_0

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_0
    add-int/lit8 v15, v15, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const/16 v16, 0x0

    .line 79
    .line 80
    :goto_2
    move-object/from16 v8, v16

    .line 81
    .line 82
    check-cast v8, Lc2/j;

    .line 83
    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    iput-boolean v7, v8, Lc2/j;->i:Z

    .line 87
    .line 88
    iget-object v11, v8, Lc2/j;->d:Ld2/b;

    .line 89
    .line 90
    invoke-virtual {v11, v1, v2}, Ld2/b;->a(J)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v1, v2}, Lo/c0;->e(J)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    if-nez v11, :cond_2

    .line 98
    .line 99
    new-instance v11, Lo/g0;

    .line 100
    .line 101
    invoke-direct {v11}, Lo/g0;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v1, v2, v11}, Lo/c0;->h(JLjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    check-cast v11, Lo/g0;

    .line 108
    .line 109
    invoke-virtual {v11, v8}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :goto_3
    move-object v11, v8

    .line 113
    goto :goto_4

    .line 114
    :cond_3
    const/4 v10, 0x0

    .line 115
    :cond_4
    new-instance v8, Lc2/j;

    .line 116
    .line 117
    invoke-direct {v8, v12}, Lc2/j;-><init>(Lj1/p;)V

    .line 118
    .line 119
    .line 120
    iget-object v12, v8, Lc2/j;->d:Ld2/b;

    .line 121
    .line 122
    invoke-virtual {v12, v1, v2}, Ld2/b;->a(J)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v1, v2}, Lo/c0;->e(J)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    if-nez v12, :cond_5

    .line 130
    .line 131
    new-instance v12, Lo/g0;

    .line 132
    .line 133
    invoke-direct {v12}, Lo/g0;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v1, v2, v12}, Lo/c0;->h(JLjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    check-cast v12, Lo/g0;

    .line 140
    .line 141
    invoke-virtual {v12, v8}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object v11, v11, Lc2/k;->a:Lz0/e;

    .line 145
    .line 146
    invoke-virtual {v11, v8}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_7
    if-eqz p4, :cond_c

    .line 154
    .line 155
    iget-object v1, v5, Lo/c0;->b:[J

    .line 156
    .line 157
    iget-object v2, v5, Lo/c0;->c:[Ljava/lang/Object;

    .line 158
    .line 159
    iget-object v3, v5, Lo/c0;->a:[J

    .line 160
    .line 161
    array-length v5, v3

    .line 162
    add-int/lit8 v5, v5, -0x2

    .line 163
    .line 164
    if-ltz v5, :cond_c

    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    :goto_5
    aget-wide v7, v3, v6

    .line 168
    .line 169
    not-long v9, v7

    .line 170
    const/4 v11, 0x7

    .line 171
    shl-long/2addr v9, v11

    .line 172
    and-long/2addr v9, v7

    .line 173
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    and-long/2addr v9, v11

    .line 179
    cmp-long v13, v9, v11

    .line 180
    .line 181
    if-eqz v13, :cond_b

    .line 182
    .line 183
    sub-int v9, v6, v5

    .line 184
    .line 185
    not-int v9, v9

    .line 186
    ushr-int/lit8 v9, v9, 0x1f

    .line 187
    .line 188
    const/16 v10, 0x8

    .line 189
    .line 190
    rsub-int/lit8 v9, v9, 0x8

    .line 191
    .line 192
    const/4 v11, 0x0

    .line 193
    :goto_6
    if-ge v11, v9, :cond_a

    .line 194
    .line 195
    const-wide/16 v12, 0xff

    .line 196
    .line 197
    and-long/2addr v12, v7

    .line 198
    const-wide/16 v14, 0x80

    .line 199
    .line 200
    cmp-long v16, v12, v14

    .line 201
    .line 202
    if-gez v16, :cond_8

    .line 203
    .line 204
    shl-int/lit8 v12, v6, 0x3

    .line 205
    .line 206
    add-int/2addr v12, v11

    .line 207
    aget-wide v13, v1, v12

    .line 208
    .line 209
    aget-object v12, v2, v12

    .line 210
    .line 211
    check-cast v12, Lo/g0;

    .line 212
    .line 213
    iget-object v15, v4, Lc2/k;->a:Lz0/e;

    .line 214
    .line 215
    const/16 p1, 0x8

    .line 216
    .line 217
    iget-object v10, v15, Lz0/e;->a:[Ljava/lang/Object;

    .line 218
    .line 219
    iget v15, v15, Lz0/e;->c:I

    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    :goto_7
    if-ge v0, v15, :cond_9

    .line 223
    .line 224
    aget-object v16, v10, v0

    .line 225
    .line 226
    move/from16 p2, v0

    .line 227
    .line 228
    move-object/from16 v0, v16

    .line 229
    .line 230
    check-cast v0, Lc2/j;

    .line 231
    .line 232
    invoke-virtual {v0, v13, v14, v12}, Lc2/j;->f(JLo/g0;)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v0, p2, 0x1

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_8
    const/16 p1, 0x8

    .line 239
    .line 240
    :cond_9
    shr-long v7, v7, p1

    .line 241
    .line 242
    add-int/lit8 v11, v11, 0x1

    .line 243
    .line 244
    move-object/from16 v0, p0

    .line 245
    .line 246
    const/16 v10, 0x8

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_a
    const/16 v0, 0x8

    .line 250
    .line 251
    if-ne v9, v0, :cond_c

    .line 252
    .line 253
    :cond_b
    if-eq v6, v5, :cond_c

    .line 254
    .line 255
    add-int/lit8 v6, v6, 0x1

    .line 256
    .line 257
    move-object/from16 v0, p0

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_c
    return-void
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

.method public b(Ljava/lang/Object;)[F
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    iget-boolean v1, p0, Lc2/d;->b:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lc2/d;->c(Ljava/lang/Object;)[F

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1, v0}, Lj2/l0;->A([F[F)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput-boolean p1, p0, Lc2/d;->c:Z

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lc2/d;->b:Z

    .line 21
    .line 22
    :cond_0
    iget-boolean p1, p0, Lc2/d;->c:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public c(Ljava/lang/Object;)[F
    .locals 3

    .line 1
    iget-object v0, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    iget-boolean v1, p0, Lc2/d;->a:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v1, p0, Lc2/d;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Matrix;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v1, Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lc2/d;->f:Ljava/lang/Object;

    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, Lc2/d;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljc/m;

    .line 26
    .line 27
    invoke-interface {v2, p1, v1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lq1/h0;->v(Landroid/graphics/Matrix;[F)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-boolean p1, p0, Lc2/d;->a:Z

    .line 35
    .line 36
    invoke-static {v0}, Lq1/h0;->p([F)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput-boolean p1, p0, Lc2/d;->d:Z

    .line 41
    .line 42
    return-object v0
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

.method public d(Lb7/n;Z)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lc2/d;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo/g0;

    .line 4
    .line 5
    iget-object v1, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc2/k;

    .line 8
    .line 9
    iget-object v2, p1, Lb7/n;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lo/s;

    .line 12
    .line 13
    iget-object v3, p0, Lc2/d;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lg2/c0;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3, p1, p2}, Lc2/k;->a(Lo/s;Lg2/c0;Lb7/n;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, v1, Lc2/k;->a:Lz0/e;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    return v4

    .line 27
    :cond_0
    const/4 v2, 0x1

    .line 28
    iput-boolean v2, p0, Lc2/d;->a:Z

    .line 29
    .line 30
    iget-object v5, v3, Lz0/e;->a:[Ljava/lang/Object;

    .line 31
    .line 32
    iget v6, v3, Lz0/e;->c:I

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    :goto_0
    if-ge v7, v6, :cond_3

    .line 37
    .line 38
    aget-object v9, v5, v7

    .line 39
    .line 40
    check-cast v9, Lc2/j;

    .line 41
    .line 42
    invoke-virtual {v9, p1, p2}, Lc2/j;->e(Lb7/n;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-nez v9, :cond_2

    .line 47
    .line 48
    if-eqz v8, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v8, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    const/4 v8, 0x1

    .line 54
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    iget-object p2, v3, Lz0/e;->a:[Ljava/lang/Object;

    .line 58
    .line 59
    iget v3, v3, Lz0/e;->c:I

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    :goto_3
    if-ge v5, v3, :cond_6

    .line 64
    .line 65
    aget-object v7, p2, v5

    .line 66
    .line 67
    check-cast v7, Lc2/j;

    .line 68
    .line 69
    invoke-virtual {v7, p1}, Lc2/j;->d(Lb7/n;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_5

    .line 74
    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/4 v6, 0x0

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    :goto_4
    const/4 v6, 0x1

    .line 81
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_6
    invoke-virtual {v1, p1}, Lc2/k;->b(Lb7/n;)V

    .line 85
    .line 86
    .line 87
    if-nez v6, :cond_8

    .line 88
    .line 89
    if-eqz v8, :cond_7

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_7
    const/4 v2, 0x0

    .line 93
    :cond_8
    :goto_6
    iput-boolean v4, p0, Lc2/d;->a:Z

    .line 94
    .line 95
    iget-boolean p1, p0, Lc2/d;->d:Z

    .line 96
    .line 97
    if-eqz p1, :cond_a

    .line 98
    .line 99
    iput-boolean v4, p0, Lc2/d;->d:Z

    .line 100
    .line 101
    iget p1, v0, Lo/g0;->b:I

    .line 102
    .line 103
    const/4 p2, 0x0

    .line 104
    :goto_7
    if-ge p2, p1, :cond_9

    .line 105
    .line 106
    invoke-virtual {v0, p2}, Lo/g0;->e(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lj1/p;

    .line 111
    .line 112
    invoke-virtual {p0, v3}, Lc2/d;->g(Lj1/p;)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p2, p2, 0x1

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_9
    invoke-virtual {v0}, Lo/g0;->c()V

    .line 119
    .line 120
    .line 121
    :cond_a
    iget-boolean p1, p0, Lc2/d;->b:Z

    .line 122
    .line 123
    if-eqz p1, :cond_b

    .line 124
    .line 125
    iput-boolean v4, p0, Lc2/d;->b:Z

    .line 126
    .line 127
    invoke-virtual {p0}, Lc2/d;->f()V

    .line 128
    .line 129
    .line 130
    :cond_b
    iget-boolean p1, p0, Lc2/d;->c:Z

    .line 131
    .line 132
    if-eqz p1, :cond_c

    .line 133
    .line 134
    iput-boolean v4, p0, Lc2/d;->c:Z

    .line 135
    .line 136
    iget-object p1, v1, Lc2/k;->a:Lz0/e;

    .line 137
    .line 138
    invoke-virtual {p1}, Lz0/e;->g()V

    .line 139
    .line 140
    .line 141
    :cond_c
    return v2
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

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc2/d;->a:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lc2/d;->b:Z

    .line 5
    .line 6
    return-void
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

.method public f()V
    .locals 6

    .line 1
    iget-object v0, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc2/k;

    .line 4
    .line 5
    iget-boolean v1, p0, Lc2/d;->a:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iput-boolean v2, p0, Lc2/d;->b:Z

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v1, v0, Lc2/k;->a:Lz0/e;

    .line 14
    .line 15
    iget-object v3, v1, Lz0/e;->a:[Ljava/lang/Object;

    .line 16
    .line 17
    iget v1, v1, Lz0/e;->c:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v1, :cond_1

    .line 21
    .line 22
    aget-object v5, v3, v4

    .line 23
    .line 24
    check-cast v5, Lc2/j;

    .line 25
    .line 26
    invoke-virtual {v5}, Lc2/j;->c()V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-boolean v1, p0, Lc2/d;->c:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iput-boolean v2, p0, Lc2/d;->c:Z

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, v0, Lc2/k;->a:Lz0/e;

    .line 40
    .line 41
    invoke-virtual {v0}, Lz0/e;->g()V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public g(Lj1/p;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lc2/d;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lc2/d;->d:Z

    .line 7
    .line 8
    iget-object v0, p0, Lc2/d;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lo/g0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lc2/k;

    .line 19
    .line 20
    iget-object v2, v0, Lc2/k;->b:Lo/g0;

    .line 21
    .line 22
    invoke-virtual {v2}, Lo/g0;->c()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v2}, Lo/g0;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget v0, v2, Lo/g0;->b:I

    .line 35
    .line 36
    sub-int/2addr v0, v1

    .line 37
    invoke-virtual {v2, v0}, Lo/g0;->j(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lc2/k;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    iget-object v4, v0, Lc2/k;->a:Lz0/e;

    .line 45
    .line 46
    iget v5, v4, Lz0/e;->c:I

    .line 47
    .line 48
    if-ge v3, v5, :cond_1

    .line 49
    .line 50
    iget-object v4, v4, Lz0/e;->a:[Ljava/lang/Object;

    .line 51
    .line 52
    aget-object v4, v4, v3

    .line 53
    .line 54
    check-cast v4, Lc2/j;

    .line 55
    .line 56
    iget-object v5, v4, Lc2/j;->c:Lj1/p;

    .line 57
    .line 58
    invoke-static {v5, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    iget-object v5, v0, Lc2/k;->a:Lz0/e;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lz0/e;->j(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Lc2/j;->c()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {v2, v4}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    return-void
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
