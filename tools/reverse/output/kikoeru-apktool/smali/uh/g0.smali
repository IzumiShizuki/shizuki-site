.class public final Luh/g0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:La0/g0;

.field public final b:Lhf/y;

.field public final c:Lb0/s1;

.field public d:Lhf/r1;

.field public final e:Lkf/f;


# direct methods
.method public constructor <init>(La0/g0;Lhf/y;Lb0/s1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luh/g0;->a:La0/g0;

    .line 5
    .line 6
    iput-object p2, p0, Luh/g0;->b:Lhf/y;

    .line 7
    .line 8
    iput-object p3, p0, Luh/g0;->c:Lb0/s1;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 p2, 0x6

    .line 12
    const/4 p3, -0x1

    .line 13
    invoke-static {p3, p2, p1}, Lg8/a;->c(IILkf/a;)Lkf/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Luh/g0;->e:Lkf/f;

    .line 18
    .line 19
    return-void
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

.method public static final a(Luh/g0;Lac/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v1, v0, Luh/d0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Luh/d0;

    .line 12
    .line 13
    iget v2, v1, Luh/d0;->k:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    and-int v4, v2, v3

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iput v2, v1, Luh/d0;->k:I

    .line 23
    .line 24
    move-object/from16 v2, p0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Luh/d0;

    .line 28
    .line 29
    move-object/from16 v2, p0

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Luh/d0;-><init>(Luh/g0;Lac/c;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v0, v1, Luh/d0;->i:Ljava/lang/Object;

    .line 35
    .line 36
    iget v3, v1, Luh/d0;->k:I

    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x1

    .line 41
    const/4 v7, 0x0

    .line 42
    sget-object v8, Lzb/a;->a:Lzb/a;

    .line 43
    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    if-eq v3, v6, :cond_3

    .line 47
    .line 48
    if-eq v3, v5, :cond_2

    .line 49
    .line 50
    if-ne v3, v4, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    :goto_1
    iget-object v2, v1, Luh/d0;->e:Luh/c0;

    .line 62
    .line 63
    iget-object v3, v1, Luh/d0;->d:Luh/g0;

    .line 64
    .line 65
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v2

    .line 69
    move-object v2, v3

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    iget v2, v1, Luh/d0;->h:F

    .line 72
    .line 73
    iget-object v3, v1, Luh/d0;->g:Ljc/m;

    .line 74
    .line 75
    check-cast v3, Lic/a;

    .line 76
    .line 77
    iget-object v9, v1, Luh/d0;->f:Luh/a0;

    .line 78
    .line 79
    iget-object v10, v1, Luh/d0;->e:Luh/c0;

    .line 80
    .line 81
    iget-object v11, v1, Luh/d0;->d:Luh/g0;

    .line 82
    .line 83
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object v0, v10

    .line 87
    goto :goto_5

    .line 88
    :cond_4
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v7

    .line 92
    :goto_2
    iget-object v3, v2, Luh/g0;->e:Lkf/f;

    .line 93
    .line 94
    invoke-virtual {v3}, Lkf/f;->c()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    instance-of v9, v3, Lkf/l;

    .line 99
    .line 100
    if-nez v9, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    move-object v3, v7

    .line 104
    :goto_3
    check-cast v3, Luh/c0;

    .line 105
    .line 106
    if-nez v3, :cond_6

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    move-object v0, v3

    .line 110
    :goto_4
    if-eqz v0, :cond_f

    .line 111
    .line 112
    sget-object v3, Luh/c0;->e:Luh/c0;

    .line 113
    .line 114
    invoke-virtual {v0, v3}, Luh/c0;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_7

    .line 119
    .line 120
    goto/16 :goto_9

    .line 121
    .line 122
    :cond_7
    iget-object v9, v0, Luh/c0;->a:Luh/a0;

    .line 123
    .line 124
    iget v3, v0, Luh/c0;->b:F

    .line 125
    .line 126
    iget-object v10, v0, Luh/c0;->c:Ljc/m;

    .line 127
    .line 128
    iget-object v11, v0, Luh/c0;->d:Lac/i;

    .line 129
    .line 130
    iget-object v12, v2, Luh/g0;->c:Lb0/s1;

    .line 131
    .line 132
    invoke-virtual {v12}, Lb0/s1;->b()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    check-cast v12, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    mul-float v12, v12, v3

    .line 143
    .line 144
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 145
    .line 146
    div-float v3, v12, v3

    .line 147
    .line 148
    iput-object v2, v1, Luh/d0;->d:Luh/g0;

    .line 149
    .line 150
    iput-object v0, v1, Luh/d0;->e:Luh/c0;

    .line 151
    .line 152
    iput-object v9, v1, Luh/d0;->f:Luh/a0;

    .line 153
    .line 154
    iput-object v10, v1, Luh/d0;->g:Ljc/m;

    .line 155
    .line 156
    iput v3, v1, Luh/d0;->h:F

    .line 157
    .line 158
    iput v6, v1, Luh/d0;->k:I

    .line 159
    .line 160
    invoke-interface {v11, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    if-ne v11, v8, :cond_8

    .line 165
    .line 166
    goto/16 :goto_8

    .line 167
    .line 168
    :cond_8
    move-object v11, v2

    .line 169
    move v2, v3

    .line 170
    move-object v3, v10

    .line 171
    :goto_5
    iget-object v10, v11, Luh/g0;->a:La0/g0;

    .line 172
    .line 173
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-eqz v12, :cond_a

    .line 178
    .line 179
    if-ne v12, v6, :cond_9

    .line 180
    .line 181
    invoke-virtual {v10}, La0/g0;->d()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    goto :goto_6

    .line 186
    :cond_9
    new-instance v0, Lce/j0;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 189
    .line 190
    .line 191
    throw v0

    .line 192
    :cond_a
    invoke-virtual {v10}, La0/g0;->c()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    :goto_6
    if-eqz v10, :cond_f

    .line 197
    .line 198
    invoke-interface {v3}, Lic/a;->b()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Ljava/lang/Number;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    const/4 v10, 0x0

    .line 209
    cmpg-float v10, v3, v10

    .line 210
    .line 211
    if-gtz v10, :cond_c

    .line 212
    .line 213
    iput-object v11, v1, Luh/d0;->d:Luh/g0;

    .line 214
    .line 215
    iput-object v0, v1, Luh/d0;->e:Luh/c0;

    .line 216
    .line 217
    iput-object v7, v1, Luh/d0;->f:Luh/a0;

    .line 218
    .line 219
    iput-object v7, v1, Luh/d0;->g:Ljc/m;

    .line 220
    .line 221
    iput v5, v1, Luh/d0;->k:I

    .line 222
    .line 223
    const-wide/16 v2, 0x64

    .line 224
    .line 225
    invoke-static {v2, v3, v1}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    if-ne v2, v8, :cond_b

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_b
    move-object v2, v11

    .line 233
    goto/16 :goto_2

    .line 234
    .line 235
    :cond_c
    div-float v2, v3, v2

    .line 236
    .line 237
    float-to-long v12, v2

    .line 238
    const-wide/16 v14, 0x1

    .line 239
    .line 240
    const-wide/16 v16, 0x64

    .line 241
    .line 242
    invoke-static/range {v12 .. v17}, Lnh/b;->l(JJJ)J

    .line 243
    .line 244
    .line 245
    move-result-wide v12

    .line 246
    long-to-float v10, v12

    .line 247
    div-float/2addr v10, v2

    .line 248
    mul-float v10, v10, v3

    .line 249
    .line 250
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_e

    .line 255
    .line 256
    if-ne v2, v6, :cond_d

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_d
    new-instance v0, Lce/j0;

    .line 260
    .line 261
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 262
    .line 263
    .line 264
    throw v0

    .line 265
    :cond_e
    neg-float v10, v10

    .line 266
    :goto_7
    iget-object v2, v11, Luh/g0;->a:La0/g0;

    .line 267
    .line 268
    long-to-int v3, v12

    .line 269
    const/4 v9, 0x0

    .line 270
    sget-object v12, Lr/w;->d:Lm4/d1;

    .line 271
    .line 272
    invoke-static {v3, v9, v12, v5}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    iput-object v11, v1, Luh/d0;->d:Luh/g0;

    .line 277
    .line 278
    iput-object v0, v1, Luh/d0;->e:Luh/c0;

    .line 279
    .line 280
    iput-object v7, v1, Luh/d0;->f:Luh/a0;

    .line 281
    .line 282
    iput-object v7, v1, Luh/d0;->g:Ljc/m;

    .line 283
    .line 284
    iput v4, v1, Luh/d0;->k:I

    .line 285
    .line 286
    invoke-static {v2, v10, v3, v1}, Lu/w1;->c(Lu/v1;FLr/x;Lac/c;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    if-ne v2, v8, :cond_b

    .line 291
    .line 292
    :goto_8
    return-object v8

    .line 293
    :cond_f
    :goto_9
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 294
    .line 295
    return-object v0
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


# virtual methods
.method public final b(Luh/a0;FLic/a;Lic/k;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Luh/g0;->a:La0/g0;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, La0/g0;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Lce/j0;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    invoke-virtual {v2}, La0/g0;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return p1

    .line 31
    :cond_2
    iget-object v0, p0, Luh/g0;->d:Lhf/r1;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    new-instance v0, Luh/e0;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v0, p0, v3, v2}, Luh/e0;-><init>(Luh/g0;Lyb/c;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    iget-object v4, p0, Luh/g0;->b:Lhf/y;

    .line 44
    .line 45
    invoke-static {v4, v3, v3, v0, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Luh/g0;->d:Lhf/r1;

    .line 50
    .line 51
    :cond_3
    new-instance v0, Luh/c0;

    .line 52
    .line 53
    invoke-direct {v0, p1, p2, p3, p4}, Luh/c0;-><init>(Luh/a0;FLic/a;Lic/k;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Luh/g0;->e:Lkf/f;

    .line 57
    .line 58
    invoke-interface {p1, v0}, Lkf/u;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return v1
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
.end method

.method public final c(Lac/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Luh/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Luh/f0;

    .line 7
    .line 8
    iget v1, v0, Luh/f0;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luh/f0;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Luh/f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Luh/f0;-><init>(Luh/g0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Luh/f0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Luh/f0;->g:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Luh/f0;->d:Luh/g0;

    .line 40
    .line 41
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v1, v0, Luh/f0;->d:Luh/g0;

    .line 54
    .line 55
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Luh/c0;->e:Luh/c0;

    .line 63
    .line 64
    iput-object p0, v0, Luh/f0;->d:Luh/g0;

    .line 65
    .line 66
    iput v3, v0, Luh/f0;->g:I

    .line 67
    .line 68
    iget-object v1, p0, Luh/g0;->e:Lkf/f;

    .line 69
    .line 70
    invoke-interface {v1, p1, v0}, Lkf/u;->j(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v4, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move-object v1, p0

    .line 78
    :goto_1
    iget-object p1, v1, Luh/g0;->d:Lhf/r1;

    .line 79
    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    iput-object v1, v0, Luh/f0;->d:Luh/g0;

    .line 83
    .line 84
    iput v2, v0, Luh/f0;->g:I

    .line 85
    .line 86
    invoke-static {p1, v0}, Lhf/a0;->j(Lhf/d1;Lac/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v4, :cond_5

    .line 91
    .line 92
    :goto_2
    return-object v4

    .line 93
    :cond_5
    move-object v0, v1

    .line 94
    :goto_3
    move-object v1, v0

    .line 95
    :cond_6
    const/4 p1, 0x0

    .line 96
    iput-object p1, v1, Luh/g0;->d:Lhf/r1;

    .line 97
    .line 98
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 99
    .line 100
    return-object p1
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
