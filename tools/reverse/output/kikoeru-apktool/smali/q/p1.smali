.class public final Lq/p1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lq/q1;


# direct methods
.method public synthetic constructor <init>(Lq/q1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq/p1;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lq/p1;->c:Lq/q1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lq/p1;->b:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lx0/f0;

    .line 11
    .line 12
    new-instance v1, Lb0/h0;

    .line 13
    .line 14
    const/16 v2, 0xe

    .line 15
    .line 16
    iget-object v3, v0, Lq/p1;->c:Lq/q1;

    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lb0/h0;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Li2/l0;

    .line 25
    .line 26
    invoke-virtual {v1}, Li2/l0;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lq/p1;->c:Lq/q1;

    .line 30
    .line 31
    iget-object v2, v2, Lq/q1;->i:Lh1/s;

    .line 32
    .line 33
    invoke-virtual {v2}, Lh1/s;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x1

    .line 38
    if-le v3, v4, :cond_0

    .line 39
    .line 40
    new-instance v3, Lq/n1;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, Lvb/p;->M(Ljava/util/List;Ljava/util/Comparator;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {v2}, Lh1/s;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    :goto_0
    if-ge v4, v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Lh1/s;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Lq/x0;

    .line 60
    .line 61
    invoke-interface {v5, v1}, Lq/x0;->b(Li2/l0;)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 68
    .line 69
    return-object v1

    .line 70
    :pswitch_1
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Lq/m1;

    .line 73
    .line 74
    iget-object v1, v0, Lq/p1;->c:Lq/q1;

    .line 75
    .line 76
    iget-object v2, v1, Lq/q1;->j:Lo/k0;

    .line 77
    .line 78
    iget-object v3, v2, Lo/k0;->b:[Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v4, v2, Lo/k0;->c:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v5, v2, Lo/k0;->a:[J

    .line 83
    .line 84
    array-length v6, v5

    .line 85
    add-int/lit8 v6, v6, -0x2

    .line 86
    .line 87
    const/4 v14, 0x1

    .line 88
    const/16 v15, 0x8

    .line 89
    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    if-ltz v6, :cond_5

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    const-wide/16 v17, 0x80

    .line 96
    .line 97
    const-wide/16 v19, 0xff

    .line 98
    .line 99
    :goto_1
    aget-wide v9, v5, v7

    .line 100
    .line 101
    const/16 p1, 0x7

    .line 102
    .line 103
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    not-long v11, v9

    .line 109
    shl-long v11, v11, p1

    .line 110
    .line 111
    and-long/2addr v11, v9

    .line 112
    and-long v11, v11, v21

    .line 113
    .line 114
    cmp-long v8, v11, v21

    .line 115
    .line 116
    if-eqz v8, :cond_4

    .line 117
    .line 118
    sub-int v8, v7, v6

    .line 119
    .line 120
    not-int v8, v8

    .line 121
    ushr-int/lit8 v8, v8, 0x1f

    .line 122
    .line 123
    rsub-int/lit8 v8, v8, 0x8

    .line 124
    .line 125
    const/4 v11, 0x0

    .line 126
    :goto_2
    if-ge v11, v8, :cond_3

    .line 127
    .line 128
    and-long v12, v9, v19

    .line 129
    .line 130
    cmp-long v23, v12, v17

    .line 131
    .line 132
    if-gez v23, :cond_2

    .line 133
    .line 134
    shl-int/lit8 v12, v7, 0x3

    .line 135
    .line 136
    add-int/2addr v12, v11

    .line 137
    aget-object v13, v3, v12

    .line 138
    .line 139
    aget-object v12, v4, v12

    .line 140
    .line 141
    check-cast v12, Lq/g1;

    .line 142
    .line 143
    invoke-virtual {v12}, Lq/g1;->e()Z

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    if-eqz v12, :cond_2

    .line 148
    .line 149
    const/4 v3, 0x1

    .line 150
    goto :goto_3

    .line 151
    :cond_2
    shr-long/2addr v9, v15

    .line 152
    add-int/lit8 v11, v11, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_3
    if-ne v8, v15, :cond_6

    .line 156
    .line 157
    :cond_4
    if-eq v7, v6, :cond_6

    .line 158
    .line 159
    add-int/lit8 v7, v7, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    const/16 p1, 0x7

    .line 163
    .line 164
    const-wide/16 v17, 0x80

    .line 165
    .line 166
    const-wide/16 v19, 0xff

    .line 167
    .line 168
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :cond_6
    const/4 v3, 0x0

    .line 174
    :goto_3
    invoke-virtual {v1}, Lq/q1;->g()Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eq v3, v4, :cond_b

    .line 179
    .line 180
    iget-object v4, v1, Lq/q1;->d:Lx0/e1;

    .line 181
    .line 182
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v4, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    if-nez v3, :cond_b

    .line 190
    .line 191
    iget-object v3, v2, Lo/k0;->b:[Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v4, v2, Lo/k0;->c:[Ljava/lang/Object;

    .line 194
    .line 195
    iget-object v5, v2, Lo/k0;->a:[J

    .line 196
    .line 197
    array-length v6, v5

    .line 198
    add-int/lit8 v6, v6, -0x2

    .line 199
    .line 200
    if-ltz v6, :cond_b

    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    :goto_4
    aget-wide v8, v5, v7

    .line 204
    .line 205
    not-long v10, v8

    .line 206
    shl-long v10, v10, p1

    .line 207
    .line 208
    and-long/2addr v10, v8

    .line 209
    and-long v10, v10, v21

    .line 210
    .line 211
    cmp-long v12, v10, v21

    .line 212
    .line 213
    if-eqz v12, :cond_a

    .line 214
    .line 215
    sub-int v10, v7, v6

    .line 216
    .line 217
    not-int v10, v10

    .line 218
    ushr-int/lit8 v10, v10, 0x1f

    .line 219
    .line 220
    rsub-int/lit8 v10, v10, 0x8

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    :goto_5
    if-ge v11, v10, :cond_9

    .line 224
    .line 225
    and-long v12, v8, v19

    .line 226
    .line 227
    cmp-long v23, v12, v17

    .line 228
    .line 229
    if-gez v23, :cond_8

    .line 230
    .line 231
    shl-int/lit8 v12, v7, 0x3

    .line 232
    .line 233
    add-int/2addr v12, v11

    .line 234
    aget-object v13, v3, v12

    .line 235
    .line 236
    aget-object v12, v4, v12

    .line 237
    .line 238
    check-cast v12, Lq/g1;

    .line 239
    .line 240
    iget-object v13, v12, Lq/g1;->g:Lh1/s;

    .line 241
    .line 242
    invoke-virtual {v13}, Lh1/s;->size()I

    .line 243
    .line 244
    .line 245
    move-result v13

    .line 246
    if-le v13, v14, :cond_7

    .line 247
    .line 248
    invoke-virtual {v12}, Lq/g1;->d()Z

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    if-eqz v13, :cond_7

    .line 253
    .line 254
    const/4 v13, 0x1

    .line 255
    goto :goto_6

    .line 256
    :cond_7
    const/4 v13, 0x0

    .line 257
    :goto_6
    iget-object v14, v12, Lq/g1;->d:Lx0/e1;

    .line 258
    .line 259
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 260
    .line 261
    .line 262
    move-result-object v13

    .line 263
    invoke-virtual {v14, v13}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    iget-object v12, v12, Lq/g1;->c:Lx0/e1;

    .line 268
    .line 269
    invoke-virtual {v12, v13}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_8
    shr-long/2addr v8, v15

    .line 273
    add-int/lit8 v11, v11, 0x1

    .line 274
    .line 275
    const/4 v14, 0x1

    .line 276
    goto :goto_5

    .line 277
    :cond_9
    if-ne v10, v15, :cond_b

    .line 278
    .line 279
    :cond_a
    if-eq v7, v6, :cond_b

    .line 280
    .line 281
    add-int/lit8 v7, v7, 0x1

    .line 282
    .line 283
    const/4 v14, 0x1

    .line 284
    goto :goto_4

    .line 285
    :cond_b
    iget-object v3, v2, Lo/k0;->b:[Ljava/lang/Object;

    .line 286
    .line 287
    iget-object v4, v2, Lo/k0;->c:[Ljava/lang/Object;

    .line 288
    .line 289
    iget-object v2, v2, Lo/k0;->a:[J

    .line 290
    .line 291
    array-length v5, v2

    .line 292
    add-int/lit8 v5, v5, -0x2

    .line 293
    .line 294
    if-ltz v5, :cond_f

    .line 295
    .line 296
    const/4 v6, 0x0

    .line 297
    :goto_7
    aget-wide v7, v2, v6

    .line 298
    .line 299
    not-long v9, v7

    .line 300
    shl-long v9, v9, p1

    .line 301
    .line 302
    and-long/2addr v9, v7

    .line 303
    and-long v9, v9, v21

    .line 304
    .line 305
    cmp-long v11, v9, v21

    .line 306
    .line 307
    if-eqz v11, :cond_e

    .line 308
    .line 309
    sub-int v9, v6, v5

    .line 310
    .line 311
    not-int v9, v9

    .line 312
    ushr-int/lit8 v9, v9, 0x1f

    .line 313
    .line 314
    rsub-int/lit8 v9, v9, 0x8

    .line 315
    .line 316
    const/4 v10, 0x0

    .line 317
    :goto_8
    if-ge v10, v9, :cond_d

    .line 318
    .line 319
    and-long v11, v7, v19

    .line 320
    .line 321
    cmp-long v13, v11, v17

    .line 322
    .line 323
    if-gez v13, :cond_c

    .line 324
    .line 325
    shl-int/lit8 v11, v6, 0x3

    .line 326
    .line 327
    add-int/2addr v11, v10

    .line 328
    aget-object v12, v3, v11

    .line 329
    .line 330
    aget-object v11, v4, v11

    .line 331
    .line 332
    check-cast v11, Lq/g1;

    .line 333
    .line 334
    invoke-virtual {v11}, Lq/g1;->f()V

    .line 335
    .line 336
    .line 337
    :cond_c
    shr-long/2addr v7, v15

    .line 338
    add-int/lit8 v10, v10, 0x1

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_d
    if-ne v9, v15, :cond_f

    .line 342
    .line 343
    :cond_e
    if-eq v6, v5, :cond_f

    .line 344
    .line 345
    add-int/lit8 v6, v6, 0x1

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_f
    invoke-virtual {v1}, Lq/q1;->a()V

    .line 349
    .line 350
    .line 351
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 352
    .line 353
    return-object v1

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
