.class public final Lm4/i0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final g:Lm4/i0;

.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lm4/d0;

.field public final c:Lm4/c0;

.field public final d:Lm4/l0;

.field public final e:Lm4/y;

.field public final f:Lm4/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lm4/w;

    .line 2
    .line 3
    invoke-direct {v0}, Lm4/w;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lya/i0;->b:Lya/g0;

    .line 7
    .line 8
    sget-object v1, Lya/a1;->e:Lya/a1;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, Lya/a1;->e:Lya/a1;

    .line 13
    .line 14
    new-instance v1, Lm4/b0;

    .line 15
    .line 16
    invoke-direct {v1}, Lm4/b0;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v8, Lm4/e0;->d:Lm4/e0;

    .line 20
    .line 21
    new-instance v2, Lm4/i0;

    .line 22
    .line 23
    new-instance v4, Lm4/y;

    .line 24
    .line 25
    invoke-direct {v4, v0}, Lm4/x;-><init>(Lm4/w;)V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lm4/c0;

    .line 29
    .line 30
    invoke-direct {v6, v1}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 31
    .line 32
    .line 33
    sget-object v7, Lm4/l0;->K:Lm4/l0;

    .line 34
    .line 35
    const-string v3, ""

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-direct/range {v2 .. v8}, Lm4/i0;-><init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Lm4/i0;->g:Lm4/i0;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    const/16 v1, 0x24

    .line 45
    .line 46
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lm4/i0;->h:Ljava/lang/String;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lm4/i0;->i:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v0, 0x2

    .line 60
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lm4/i0;->j:Ljava/lang/String;

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lm4/i0;->k:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v0, 0x4

    .line 74
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Lm4/i0;->l:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lm4/i0;->m:Ljava/lang/String;

    .line 86
    .line 87
    return-void
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

.method public constructor <init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm4/i0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lm4/i0;->b:Lm4/d0;

    .line 7
    .line 8
    iput-object p4, p0, Lm4/i0;->c:Lm4/c0;

    .line 9
    .line 10
    iput-object p5, p0, Lm4/i0;->d:Lm4/l0;

    .line 11
    .line 12
    iput-object p2, p0, Lm4/i0;->e:Lm4/y;

    .line 13
    .line 14
    iput-object p6, p0, Lm4/i0;->f:Lm4/e0;

    .line 15
    .line 16
    return-void
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
.end method

.method public static a(Landroid/os/Bundle;)Lm4/i0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lm4/i0;->h:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lm4/i0;->i:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Lm4/c0;->f:Lm4/c0;

    .line 23
    .line 24
    :goto_0
    move-object v7, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v1}, Lm4/c0;->b(Landroid/os/Bundle;)Lm4/c0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    sget-object v1, Lm4/i0;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    sget-object v1, Lm4/l0;->K:Lm4/l0;

    .line 40
    .line 41
    :goto_2
    move-object v8, v1

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-static {v1}, Lm4/l0;->b(Landroid/os/Bundle;)Lm4/l0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_2

    .line 48
    :goto_3
    sget-object v1, Lm4/i0;->k:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    sget-object v1, Lm4/y;->p:Lm4/y;

    .line 57
    .line 58
    :goto_4
    move-object v5, v1

    .line 59
    goto/16 :goto_a

    .line 60
    .line 61
    :cond_2
    new-instance v3, Lm4/w;

    .line 62
    .line 63
    invoke-direct {v3}, Lm4/w;-><init>()V

    .line 64
    .line 65
    .line 66
    sget-object v5, Lm4/x;->i:Ljava/lang/String;

    .line 67
    .line 68
    sget-object v6, Lm4/x;->h:Lm4/x;

    .line 69
    .line 70
    iget-wide v9, v6, Lm4/x;->a:J

    .line 71
    .line 72
    iget-wide v11, v6, Lm4/x;->d:J

    .line 73
    .line 74
    iget-wide v13, v6, Lm4/x;->b:J

    .line 75
    .line 76
    invoke-virtual {v1, v5, v9, v10}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v9

    .line 80
    invoke-static {v9, v10}, Lp4/c0;->N(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    const-wide/16 v15, 0x0

    .line 85
    .line 86
    const/4 v5, 0x1

    .line 87
    cmp-long v17, v9, v15

    .line 88
    .line 89
    if-ltz v17, :cond_3

    .line 90
    .line 91
    const/16 v17, 0x1

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_3
    const/16 v17, 0x0

    .line 95
    .line 96
    :goto_5
    invoke-static/range {v17 .. v17}, Lp4/c;->c(Z)V

    .line 97
    .line 98
    .line 99
    iput-wide v9, v3, Lm4/w;->a:J

    .line 100
    .line 101
    sget-object v9, Lm4/x;->j:Ljava/lang/String;

    .line 102
    .line 103
    move-object/from16 v17, v3

    .line 104
    .line 105
    iget-wide v2, v6, Lm4/x;->c:J

    .line 106
    .line 107
    invoke-virtual {v1, v9, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    invoke-static {v2, v3}, Lp4/c0;->N(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    const-wide/high16 v18, -0x8000000000000000L

    .line 116
    .line 117
    cmp-long v9, v2, v18

    .line 118
    .line 119
    if-eqz v9, :cond_5

    .line 120
    .line 121
    cmp-long v9, v2, v15

    .line 122
    .line 123
    if-ltz v9, :cond_4

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_4
    const/4 v9, 0x0

    .line 127
    goto :goto_7

    .line 128
    :cond_5
    :goto_6
    const/4 v9, 0x1

    .line 129
    :goto_7
    invoke-static {v9}, Lp4/c;->c(Z)V

    .line 130
    .line 131
    .line 132
    move-object/from16 v9, v17

    .line 133
    .line 134
    iput-wide v2, v9, Lm4/w;->b:J

    .line 135
    .line 136
    sget-object v2, Lm4/x;->k:Ljava/lang/String;

    .line 137
    .line 138
    iget-boolean v3, v6, Lm4/x;->e:Z

    .line 139
    .line 140
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    iput-boolean v2, v9, Lm4/w;->c:Z

    .line 145
    .line 146
    sget-object v2, Lm4/x;->l:Ljava/lang/String;

    .line 147
    .line 148
    iget-boolean v3, v6, Lm4/x;->f:Z

    .line 149
    .line 150
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iput-boolean v2, v9, Lm4/w;->d:Z

    .line 155
    .line 156
    sget-object v2, Lm4/x;->m:Ljava/lang/String;

    .line 157
    .line 158
    iget-boolean v3, v6, Lm4/x;->g:Z

    .line 159
    .line 160
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    iput-boolean v2, v9, Lm4/w;->e:Z

    .line 165
    .line 166
    sget-object v2, Lm4/x;->n:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v1, v2, v13, v14}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    cmp-long v6, v2, v13

    .line 173
    .line 174
    if-eqz v6, :cond_7

    .line 175
    .line 176
    cmp-long v6, v2, v15

    .line 177
    .line 178
    if-ltz v6, :cond_6

    .line 179
    .line 180
    const/4 v6, 0x1

    .line 181
    goto :goto_8

    .line 182
    :cond_6
    const/4 v6, 0x0

    .line 183
    :goto_8
    invoke-static {v6}, Lp4/c;->c(Z)V

    .line 184
    .line 185
    .line 186
    iput-wide v2, v9, Lm4/w;->a:J

    .line 187
    .line 188
    :cond_7
    sget-object v2, Lm4/x;->o:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v1, v2, v11, v12}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 191
    .line 192
    .line 193
    move-result-wide v1

    .line 194
    cmp-long v3, v1, v11

    .line 195
    .line 196
    if-eqz v3, :cond_a

    .line 197
    .line 198
    cmp-long v3, v1, v18

    .line 199
    .line 200
    if-eqz v3, :cond_9

    .line 201
    .line 202
    cmp-long v3, v1, v15

    .line 203
    .line 204
    if-ltz v3, :cond_8

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_8
    const/4 v5, 0x0

    .line 208
    :cond_9
    :goto_9
    invoke-static {v5}, Lp4/c;->c(Z)V

    .line 209
    .line 210
    .line 211
    iput-wide v1, v9, Lm4/w;->b:J

    .line 212
    .line 213
    :cond_a
    new-instance v1, Lm4/y;

    .line 214
    .line 215
    invoke-direct {v1, v9}, Lm4/x;-><init>(Lm4/w;)V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_4

    .line 219
    .line 220
    :goto_a
    sget-object v1, Lm4/i0;->l:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    if-nez v1, :cond_b

    .line 227
    .line 228
    sget-object v1, Lm4/e0;->d:Lm4/e0;

    .line 229
    .line 230
    :goto_b
    move-object v9, v1

    .line 231
    goto :goto_c

    .line 232
    :cond_b
    new-instance v2, Lc7/e1;

    .line 233
    .line 234
    const/16 v3, 0x17

    .line 235
    .line 236
    invoke-direct {v2, v3}, Lc7/e1;-><init>(I)V

    .line 237
    .line 238
    .line 239
    sget-object v3, Lm4/e0;->e:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Landroid/net/Uri;

    .line 246
    .line 247
    iput-object v3, v2, Lc7/e1;->b:Ljava/lang/Object;

    .line 248
    .line 249
    sget-object v3, Lm4/e0;->f:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iput-object v3, v2, Lc7/e1;->c:Ljava/lang/Object;

    .line 256
    .line 257
    sget-object v3, Lm4/e0;->g:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    iput-object v1, v2, Lc7/e1;->d:Ljava/lang/Object;

    .line 264
    .line 265
    new-instance v1, Lm4/e0;

    .line 266
    .line 267
    invoke-direct {v1, v2}, Lm4/e0;-><init>(Lc7/e1;)V

    .line 268
    .line 269
    .line 270
    goto :goto_b

    .line 271
    :goto_c
    sget-object v1, Lm4/i0;->m:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-nez v0, :cond_c

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    goto/16 :goto_19

    .line 281
    .line 282
    :cond_c
    sget-object v2, Lm4/d0;->k:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    if-nez v2, :cond_d

    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    goto/16 :goto_12

    .line 292
    .line 293
    :cond_d
    sget-object v3, Lm4/a0;->i:Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    sget-object v6, Lm4/a0;->j:Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    check-cast v6, Landroid/net/Uri;

    .line 313
    .line 314
    sget-object v11, Lm4/a0;->k:Ljava/lang/String;

    .line 315
    .line 316
    sget-object v12, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 317
    .line 318
    invoke-virtual {v2, v11}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 319
    .line 320
    .line 321
    move-result-object v11

    .line 322
    if-eqz v11, :cond_e

    .line 323
    .line 324
    goto :goto_d

    .line 325
    :cond_e
    move-object v11, v12

    .line 326
    :goto_d
    if-ne v11, v12, :cond_f

    .line 327
    .line 328
    sget-object v11, Lya/f1;->g:Lya/f1;

    .line 329
    .line 330
    goto :goto_10

    .line 331
    :cond_f
    new-instance v13, Ljava/util/HashMap;

    .line 332
    .line 333
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 334
    .line 335
    .line 336
    if-ne v11, v12, :cond_10

    .line 337
    .line 338
    goto :goto_f

    .line 339
    :cond_10
    invoke-virtual {v11}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v12

    .line 347
    :cond_11
    :goto_e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v14

    .line 351
    if-eqz v14, :cond_12

    .line 352
    .line 353
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v14

    .line 357
    check-cast v14, Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v11, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    if-eqz v15, :cond_11

    .line 364
    .line 365
    invoke-virtual {v13, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    goto :goto_e

    .line 369
    :cond_12
    :goto_f
    invoke-static {v13}, Lya/k0;->a(Ljava/util/Map;)Lya/k0;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    :goto_10
    sget-object v12, Lm4/a0;->l:Ljava/lang/String;

    .line 374
    .line 375
    const/4 v10, 0x0

    .line 376
    invoke-virtual {v2, v12, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    sget-object v13, Lm4/a0;->m:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v2, v13, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 383
    .line 384
    .line 385
    move-result v13

    .line 386
    sget-object v14, Lm4/a0;->n:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v2, v14, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v14

    .line 392
    sget-object v15, Lm4/a0;->o:Ljava/lang/String;

    .line 393
    .line 394
    new-instance v16, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v15}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 400
    .line 401
    .line 402
    move-result-object v15

    .line 403
    if-eqz v15, :cond_13

    .line 404
    .line 405
    move-object/from16 v16, v15

    .line 406
    .line 407
    :cond_13
    invoke-static/range {v16 .. v16}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 408
    .line 409
    .line 410
    move-result-object v15

    .line 411
    sget-object v1, Lm4/a0;->p:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    new-instance v2, Lm4/z;

    .line 418
    .line 419
    invoke-direct {v2}, Lm4/z;-><init>()V

    .line 420
    .line 421
    .line 422
    iput-object v3, v2, Lm4/z;->d:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v6, v2, Lm4/z;->e:Ljava/lang/Object;

    .line 425
    .line 426
    invoke-static {v11}, Lya/k0;->a(Ljava/util/Map;)Lya/k0;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    iput-object v3, v2, Lm4/z;->f:Ljava/lang/Object;

    .line 431
    .line 432
    iput-boolean v12, v2, Lm4/z;->a:Z

    .line 433
    .line 434
    iput-boolean v14, v2, Lm4/z;->c:Z

    .line 435
    .line 436
    iput-boolean v13, v2, Lm4/z;->b:Z

    .line 437
    .line 438
    invoke-static {v15}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    iput-object v3, v2, Lm4/z;->g:Ljava/io/Serializable;

    .line 443
    .line 444
    if-eqz v1, :cond_14

    .line 445
    .line 446
    array-length v3, v1

    .line 447
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    goto :goto_11

    .line 452
    :cond_14
    const/4 v1, 0x0

    .line 453
    :goto_11
    iput-object v1, v2, Lm4/z;->h:Ljava/lang/Cloneable;

    .line 454
    .line 455
    new-instance v1, Lm4/a0;

    .line 456
    .line 457
    invoke-direct {v1, v2}, Lm4/a0;-><init>(Lm4/z;)V

    .line 458
    .line 459
    .line 460
    move-object v14, v1

    .line 461
    :goto_12
    sget-object v1, Lm4/d0;->l:Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    if-nez v1, :cond_15

    .line 468
    .line 469
    const/4 v15, 0x0

    .line 470
    goto :goto_13

    .line 471
    :cond_15
    sget-object v2, Lm4/v;->b:Ljava/lang/String;

    .line 472
    .line 473
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    check-cast v1, Landroid/net/Uri;

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    new-instance v2, Lm4/t0;

    .line 483
    .line 484
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 485
    .line 486
    .line 487
    iput-object v1, v2, Lm4/t0;->a:Ljava/lang/Object;

    .line 488
    .line 489
    new-instance v1, Lm4/v;

    .line 490
    .line 491
    invoke-direct {v1, v2}, Lm4/v;-><init>(Lm4/t0;)V

    .line 492
    .line 493
    .line 494
    move-object v15, v1

    .line 495
    :goto_13
    sget-object v1, Lm4/d0;->m:Ljava/lang/String;

    .line 496
    .line 497
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    if-nez v1, :cond_16

    .line 502
    .line 503
    sget-object v1, Lya/i0;->b:Lya/g0;

    .line 504
    .line 505
    sget-object v1, Lya/a1;->e:Lya/a1;

    .line 506
    .line 507
    :goto_14
    move-object/from16 v16, v1

    .line 508
    .line 509
    goto :goto_16

    .line 510
    :cond_16
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    const/4 v3, 0x0

    .line 515
    :goto_15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    if-ge v3, v6, :cond_17

    .line 520
    .line 521
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    check-cast v6, Landroid/os/Bundle;

    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance v11, Lm4/b1;

    .line 531
    .line 532
    sget-object v12, Lm4/b1;->d:Ljava/lang/String;

    .line 533
    .line 534
    const/4 v10, 0x0

    .line 535
    invoke-virtual {v6, v12, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 536
    .line 537
    .line 538
    move-result v12

    .line 539
    sget-object v13, Lm4/b1;->e:Ljava/lang/String;

    .line 540
    .line 541
    invoke-virtual {v6, v13, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 542
    .line 543
    .line 544
    move-result v13

    .line 545
    move-object/from16 p0, v1

    .line 546
    .line 547
    sget-object v1, Lm4/b1;->f:Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {v6, v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    invoke-direct {v11, v12, v13, v1}, Lm4/b1;-><init>(III)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v2, v11}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    add-int/lit8 v3, v3, 0x1

    .line 560
    .line 561
    move-object/from16 v1, p0

    .line 562
    .line 563
    goto :goto_15

    .line 564
    :cond_17
    invoke-virtual {v2}, Lya/f0;->f()Lya/a1;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    goto :goto_14

    .line 569
    :goto_16
    sget-object v1, Lm4/d0;->o:Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    if-nez v1, :cond_18

    .line 576
    .line 577
    sget-object v1, Lya/i0;->b:Lya/g0;

    .line 578
    .line 579
    sget-object v1, Lya/a1;->e:Lya/a1;

    .line 580
    .line 581
    :goto_17
    move-object/from16 v18, v1

    .line 582
    .line 583
    goto :goto_18

    .line 584
    :cond_18
    new-instance v2, Lb7/c3;

    .line 585
    .line 586
    const/16 v3, 0x1c

    .line 587
    .line 588
    invoke-direct {v2, v3}, Lb7/c3;-><init>(I)V

    .line 589
    .line 590
    .line 591
    invoke-static {v1, v2}, Lp4/c;->p(Ljava/util/List;Lxa/d;)Lya/a1;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    goto :goto_17

    .line 596
    :goto_18
    sget-object v1, Lm4/d0;->p:Ljava/lang/String;

    .line 597
    .line 598
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 604
    .line 605
    .line 606
    move-result-wide v19

    .line 607
    new-instance v11, Lm4/d0;

    .line 608
    .line 609
    sget-object v1, Lm4/d0;->i:Ljava/lang/String;

    .line 610
    .line 611
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    move-object v12, v1

    .line 616
    check-cast v12, Landroid/net/Uri;

    .line 617
    .line 618
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    sget-object v1, Lm4/d0;->j:Ljava/lang/String;

    .line 622
    .line 623
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v13

    .line 627
    sget-object v1, Lm4/d0;->n:Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v17

    .line 633
    invoke-direct/range {v11 .. v20}, Lm4/d0;-><init>(Landroid/net/Uri;Ljava/lang/String;Lm4/a0;Lm4/v;Ljava/util/List;Ljava/lang/String;Lya/i0;J)V

    .line 634
    .line 635
    .line 636
    move-object v6, v11

    .line 637
    :goto_19
    new-instance v3, Lm4/i0;

    .line 638
    .line 639
    invoke-direct/range {v3 .. v9}, Lm4/i0;-><init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V

    .line 640
    .line 641
    .line 642
    return-object v3
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

.method public static b(Ljava/lang/String;)Lm4/i0;
    .locals 20

    .line 1
    new-instance v0, Lm4/w;

    .line 2
    .line 3
    invoke-direct {v0}, Lm4/w;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lm4/z;

    .line 7
    .line 8
    invoke-direct {v1}, Lm4/z;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    sget-object v9, Lya/a1;->e:Lya/a1;

    .line 14
    .line 15
    new-instance v12, Lm4/b0;

    .line 16
    .line 17
    invoke-direct {v12}, Lm4/b0;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v19, Lm4/e0;->d:Lm4/e0;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static/range {p0 .. p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :goto_0
    iget-object v4, v1, Lm4/z;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Landroid/net/Uri;

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iget-object v4, v1, Lm4/z;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Ljava/util/UUID;

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    const/4 v4, 0x1

    .line 47
    :goto_2
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 48
    .line 49
    .line 50
    move-object v4, v2

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    new-instance v2, Lm4/d0;

    .line 54
    .line 55
    iget-object v5, v1, Lm4/z;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Ljava/util/UUID;

    .line 58
    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    new-instance v4, Lm4/a0;

    .line 62
    .line 63
    invoke-direct {v4, v1}, Lm4/a0;-><init>(Lm4/z;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    move-object v5, v4

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-direct/range {v2 .. v11}, Lm4/d0;-><init>(Landroid/net/Uri;Ljava/lang/String;Lm4/a0;Lm4/v;Ljava/util/List;Ljava/lang/String;Lya/i0;J)V

    .line 76
    .line 77
    .line 78
    move-object/from16 v16, v2

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move-object/from16 v16, v4

    .line 82
    .line 83
    :goto_3
    new-instance v13, Lm4/i0;

    .line 84
    .line 85
    new-instance v15, Lm4/y;

    .line 86
    .line 87
    invoke-direct {v15, v0}, Lm4/x;-><init>(Lm4/w;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Lm4/c0;

    .line 91
    .line 92
    invoke-direct {v0, v12}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 93
    .line 94
    .line 95
    sget-object v18, Lm4/l0;->K:Lm4/l0;

    .line 96
    .line 97
    const-string v14, ""

    .line 98
    .line 99
    move-object/from16 v17, v0

    .line 100
    .line 101
    invoke-direct/range {v13 .. v19}, Lm4/i0;-><init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V

    .line 102
    .line 103
    .line 104
    return-object v13
    .line 105
.end method


# virtual methods
.method public final c(Z)Landroid/os/Bundle;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    iget-object v2, p0, Lm4/i0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-object v1, Lm4/i0;->h:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v1, Lm4/c0;->f:Lm4/c0;

    .line 22
    .line 23
    iget-object v2, p0, Lm4/i0;->c:Lm4/c0;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lm4/c0;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    sget-object v1, Lm4/i0;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2}, Lm4/c0;->c()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object v1, Lm4/l0;->K:Lm4/l0;

    .line 41
    .line 42
    iget-object v2, p0, Lm4/i0;->d:Lm4/l0;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lm4/l0;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    sget-object v1, Lm4/i0;->j:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2}, Lm4/l0;->c()Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    sget-object v1, Lm4/x;->h:Lm4/x;

    .line 60
    .line 61
    iget-object v2, p0, Lm4/i0;->e:Lm4/y;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lm4/x;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_a

    .line 68
    .line 69
    new-instance v3, Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-wide v4, v2, Lm4/x;->a:J

    .line 75
    .line 76
    iget-wide v6, v1, Lm4/x;->a:J

    .line 77
    .line 78
    cmp-long v8, v4, v6

    .line 79
    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    sget-object v6, Lm4/x;->i:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-wide v4, v2, Lm4/x;->c:J

    .line 88
    .line 89
    iget-wide v6, v1, Lm4/x;->c:J

    .line 90
    .line 91
    cmp-long v8, v4, v6

    .line 92
    .line 93
    if-eqz v8, :cond_4

    .line 94
    .line 95
    sget-object v6, Lm4/x;->j:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-wide v4, v2, Lm4/x;->b:J

    .line 101
    .line 102
    iget-wide v6, v1, Lm4/x;->b:J

    .line 103
    .line 104
    cmp-long v8, v4, v6

    .line 105
    .line 106
    if-eqz v8, :cond_5

    .line 107
    .line 108
    sget-object v6, Lm4/x;->n:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-wide v4, v2, Lm4/x;->d:J

    .line 114
    .line 115
    iget-wide v6, v1, Lm4/x;->d:J

    .line 116
    .line 117
    cmp-long v8, v4, v6

    .line 118
    .line 119
    if-eqz v8, :cond_6

    .line 120
    .line 121
    sget-object v6, Lm4/x;->o:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 124
    .line 125
    .line 126
    :cond_6
    iget-boolean v4, v2, Lm4/x;->e:Z

    .line 127
    .line 128
    iget-boolean v5, v1, Lm4/x;->e:Z

    .line 129
    .line 130
    if-eq v4, v5, :cond_7

    .line 131
    .line 132
    sget-object v5, Lm4/x;->k:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    :cond_7
    iget-boolean v4, v2, Lm4/x;->f:Z

    .line 138
    .line 139
    iget-boolean v5, v1, Lm4/x;->f:Z

    .line 140
    .line 141
    if-eq v4, v5, :cond_8

    .line 142
    .line 143
    sget-object v5, Lm4/x;->l:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    :cond_8
    iget-boolean v2, v2, Lm4/x;->g:Z

    .line 149
    .line 150
    iget-boolean v1, v1, Lm4/x;->g:Z

    .line 151
    .line 152
    if-eq v2, v1, :cond_9

    .line 153
    .line 154
    sget-object v1, Lm4/x;->m:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v3, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    :cond_9
    sget-object v1, Lm4/i0;->k:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 162
    .line 163
    .line 164
    :cond_a
    sget-object v1, Lm4/e0;->d:Lm4/e0;

    .line 165
    .line 166
    iget-object v2, p0, Lm4/i0;->f:Lm4/e0;

    .line 167
    .line 168
    invoke-virtual {v2, v1}, Lm4/e0;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-nez v1, :cond_e

    .line 173
    .line 174
    new-instance v1, Landroid/os/Bundle;

    .line 175
    .line 176
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 177
    .line 178
    .line 179
    iget-object v3, v2, Lm4/e0;->a:Landroid/net/Uri;

    .line 180
    .line 181
    if-eqz v3, :cond_b

    .line 182
    .line 183
    sget-object v4, Lm4/e0;->e:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 186
    .line 187
    .line 188
    :cond_b
    iget-object v3, v2, Lm4/e0;->b:Ljava/lang/String;

    .line 189
    .line 190
    if-eqz v3, :cond_c

    .line 191
    .line 192
    sget-object v4, Lm4/e0;->f:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_c
    iget-object v2, v2, Lm4/e0;->c:Landroid/os/Bundle;

    .line 198
    .line 199
    if-eqz v2, :cond_d

    .line 200
    .line 201
    sget-object v3, Lm4/e0;->g:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 204
    .line 205
    .line 206
    :cond_d
    sget-object v2, Lm4/i0;->l:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 209
    .line 210
    .line 211
    :cond_e
    if-eqz p1, :cond_1e

    .line 212
    .line 213
    iget-object p1, p0, Lm4/i0;->b:Lm4/d0;

    .line 214
    .line 215
    if-eqz p1, :cond_1e

    .line 216
    .line 217
    iget-object v1, p1, Lm4/d0;->g:Lya/i0;

    .line 218
    .line 219
    iget-object v2, p1, Lm4/d0;->e:Ljava/util/List;

    .line 220
    .line 221
    new-instance v3, Landroid/os/Bundle;

    .line 222
    .line 223
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 224
    .line 225
    .line 226
    sget-object v4, Lm4/d0;->i:Ljava/lang/String;

    .line 227
    .line 228
    iget-object v5, p1, Lm4/d0;->a:Landroid/net/Uri;

    .line 229
    .line 230
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 231
    .line 232
    .line 233
    iget-object v4, p1, Lm4/d0;->b:Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v4, :cond_f

    .line 236
    .line 237
    sget-object v5, Lm4/d0;->j:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_f
    iget-object v4, p1, Lm4/d0;->c:Lm4/a0;

    .line 243
    .line 244
    if-eqz v4, :cond_18

    .line 245
    .line 246
    sget-object v5, Lm4/d0;->k:Ljava/lang/String;

    .line 247
    .line 248
    iget-object v6, v4, Lm4/a0;->g:Lya/i0;

    .line 249
    .line 250
    iget-object v7, v4, Lm4/a0;->c:Lya/k0;

    .line 251
    .line 252
    new-instance v8, Landroid/os/Bundle;

    .line 253
    .line 254
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 255
    .line 256
    .line 257
    sget-object v9, Lm4/a0;->i:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v10, v4, Lm4/a0;->a:Ljava/util/UUID;

    .line 260
    .line 261
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    invoke-virtual {v8, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-object v9, v4, Lm4/a0;->b:Landroid/net/Uri;

    .line 269
    .line 270
    if-eqz v9, :cond_10

    .line 271
    .line 272
    sget-object v10, Lm4/a0;->j:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 275
    .line 276
    .line 277
    :cond_10
    invoke-virtual {v7}, Lya/k0;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    if-nez v9, :cond_12

    .line 282
    .line 283
    sget-object v9, Lm4/a0;->k:Ljava/lang/String;

    .line 284
    .line 285
    new-instance v10, Landroid/os/Bundle;

    .line 286
    .line 287
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Lya/k0;->entrySet()Ljava/util/Set;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-eqz v11, :cond_11

    .line 303
    .line 304
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    check-cast v11, Ljava/util/Map$Entry;

    .line 309
    .line 310
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    check-cast v12, Ljava/lang/String;

    .line 315
    .line 316
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    check-cast v11, Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v10, v12, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    goto :goto_0

    .line 326
    :cond_11
    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 327
    .line 328
    .line 329
    :cond_12
    iget-boolean v7, v4, Lm4/a0;->d:Z

    .line 330
    .line 331
    if-eqz v7, :cond_13

    .line 332
    .line 333
    sget-object v9, Lm4/a0;->l:Ljava/lang/String;

    .line 334
    .line 335
    invoke-virtual {v8, v9, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 336
    .line 337
    .line 338
    :cond_13
    iget-boolean v7, v4, Lm4/a0;->e:Z

    .line 339
    .line 340
    if-eqz v7, :cond_14

    .line 341
    .line 342
    sget-object v9, Lm4/a0;->m:Ljava/lang/String;

    .line 343
    .line 344
    invoke-virtual {v8, v9, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 345
    .line 346
    .line 347
    :cond_14
    iget-boolean v7, v4, Lm4/a0;->f:Z

    .line 348
    .line 349
    if-eqz v7, :cond_15

    .line 350
    .line 351
    sget-object v9, Lm4/a0;->n:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v8, v9, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 354
    .line 355
    .line 356
    :cond_15
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-nez v7, :cond_16

    .line 361
    .line 362
    sget-object v7, Lm4/a0;->o:Ljava/lang/String;

    .line 363
    .line 364
    new-instance v9, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8, v7, v9}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 370
    .line 371
    .line 372
    :cond_16
    iget-object v4, v4, Lm4/a0;->h:[B

    .line 373
    .line 374
    if-eqz v4, :cond_17

    .line 375
    .line 376
    sget-object v6, Lm4/a0;->p:Ljava/lang/String;

    .line 377
    .line 378
    invoke-virtual {v8, v6, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 379
    .line 380
    .line 381
    :cond_17
    invoke-virtual {v3, v5, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 382
    .line 383
    .line 384
    :cond_18
    iget-object v4, p1, Lm4/d0;->d:Lm4/v;

    .line 385
    .line 386
    if-eqz v4, :cond_19

    .line 387
    .line 388
    sget-object v5, Lm4/d0;->l:Ljava/lang/String;

    .line 389
    .line 390
    new-instance v6, Landroid/os/Bundle;

    .line 391
    .line 392
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 393
    .line 394
    .line 395
    sget-object v7, Lm4/v;->b:Ljava/lang/String;

    .line 396
    .line 397
    iget-object v4, v4, Lm4/v;->a:Landroid/net/Uri;

    .line 398
    .line 399
    invoke-virtual {v6, v7, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v3, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 403
    .line 404
    .line 405
    :cond_19
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-nez v4, :cond_1a

    .line 410
    .line 411
    sget-object v4, Lm4/d0;->m:Ljava/lang/String;

    .line 412
    .line 413
    new-instance v5, Lb7/c3;

    .line 414
    .line 415
    const/16 v6, 0x1a

    .line 416
    .line 417
    invoke-direct {v5, v6}, Lb7/c3;-><init>(I)V

    .line 418
    .line 419
    .line 420
    invoke-static {v2, v5}, Lp4/c;->A(Ljava/util/Collection;Lxa/d;)Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 425
    .line 426
    .line 427
    :cond_1a
    iget-object v2, p1, Lm4/d0;->f:Ljava/lang/String;

    .line 428
    .line 429
    if-eqz v2, :cond_1b

    .line 430
    .line 431
    sget-object v4, Lm4/d0;->n:Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    :cond_1b
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-nez v2, :cond_1c

    .line 441
    .line 442
    sget-object v2, Lm4/d0;->o:Ljava/lang/String;

    .line 443
    .line 444
    new-instance v4, Lb7/c3;

    .line 445
    .line 446
    const/16 v5, 0x1b

    .line 447
    .line 448
    invoke-direct {v4, v5}, Lb7/c3;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-static {v1, v4}, Lp4/c;->A(Ljava/util/Collection;Lxa/d;)Ljava/util/ArrayList;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 456
    .line 457
    .line 458
    :cond_1c
    iget-wide v1, p1, Lm4/d0;->h:J

    .line 459
    .line 460
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    cmp-long p1, v1, v4

    .line 466
    .line 467
    if-eqz p1, :cond_1d

    .line 468
    .line 469
    sget-object p1, Lm4/d0;->p:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {v3, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 472
    .line 473
    .line 474
    :cond_1d
    sget-object p1, Lm4/i0;->m:Ljava/lang/String;

    .line 475
    .line 476
    invoke-virtual {v0, p1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 477
    .line 478
    .line 479
    :cond_1e
    return-object v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lm4/i0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lm4/i0;

    .line 10
    .line 11
    iget-object v0, p1, Lm4/i0;->a:Ljava/lang/String;

    .line 12
    .line 13
    sget v1, Lp4/c0;->a:I

    .line 14
    .line 15
    iget-object v1, p0, Lm4/i0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lm4/i0;->e:Lm4/y;

    .line 24
    .line 25
    iget-object v1, p1, Lm4/i0;->e:Lm4/y;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lm4/x;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lm4/i0;->b:Lm4/d0;

    .line 34
    .line 35
    iget-object v1, p1, Lm4/i0;->b:Lm4/d0;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lm4/i0;->c:Lm4/c0;

    .line 44
    .line 45
    iget-object v1, p1, Lm4/i0;->c:Lm4/c0;

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Lm4/i0;->d:Lm4/l0;

    .line 54
    .line 55
    iget-object v1, p1, Lm4/i0;->d:Lm4/l0;

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object v0, p0, Lm4/i0;->f:Lm4/e0;

    .line 64
    .line 65
    iget-object p1, p1, Lm4/i0;->f:Lm4/e0;

    .line 66
    .line 67
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    :goto_0
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 76
    return p1
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

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lm4/i0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lm4/i0;->b:Lm4/d0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lm4/d0;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lm4/i0;->c:Lm4/c0;

    .line 23
    .line 24
    invoke-virtual {v1}, Lm4/c0;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, Lm4/i0;->e:Lm4/y;

    .line 32
    .line 33
    invoke-virtual {v0}, Lm4/x;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Lm4/i0;->d:Lm4/l0;

    .line 41
    .line 42
    invoke-virtual {v1}, Lm4/l0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-object v0, p0, Lm4/i0;->f:Lm4/e0;

    .line 50
    .line 51
    invoke-virtual {v0}, Lm4/e0;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v1

    .line 56
    return v0
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
