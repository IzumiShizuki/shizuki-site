.class public final Ly4/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ln5/p;

.field public final b:Lb0/w1;

.field public final c:[I

.field public final d:I

.field public final e:Ls4/h;

.field public final f:J

.field public final g:I

.field public final h:Ly4/n;

.field public final i:[Ly4/i;

.field public j:Lm5/r;

.field public k:Lz4/c;

.field public l:I

.field public m:Lj5/b;

.field public n:Z


# direct methods
.method public constructor <init>(Lk5/d;Ln5/p;Lz4/c;Lb0/w1;I[ILm5/r;ILs4/h;JIZLjava/util/ArrayList;Ly4/n;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p7

    .line 12
    .line 13
    move/from16 v6, p8

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    iput-object v7, v0, Ly4/k;->a:Ln5/p;

    .line 21
    .line 22
    iput-object v2, v0, Ly4/k;->k:Lz4/c;

    .line 23
    .line 24
    iput-object v3, v0, Ly4/k;->b:Lb0/w1;

    .line 25
    .line 26
    move-object/from16 v7, p6

    .line 27
    .line 28
    iput-object v7, v0, Ly4/k;->c:[I

    .line 29
    .line 30
    iput-object v5, v0, Ly4/k;->j:Lm5/r;

    .line 31
    .line 32
    iput v6, v0, Ly4/k;->d:I

    .line 33
    .line 34
    move-object/from16 v7, p9

    .line 35
    .line 36
    iput-object v7, v0, Ly4/k;->e:Ls4/h;

    .line 37
    .line 38
    iput v4, v0, Ly4/k;->l:I

    .line 39
    .line 40
    move-wide/from16 v7, p10

    .line 41
    .line 42
    iput-wide v7, v0, Ly4/k;->f:J

    .line 43
    .line 44
    move/from16 v7, p12

    .line 45
    .line 46
    iput v7, v0, Ly4/k;->g:I

    .line 47
    .line 48
    move-object/from16 v12, p15

    .line 49
    .line 50
    iput-object v12, v0, Ly4/k;->h:Ly4/n;

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Lz4/c;->d(I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v13

    .line 56
    invoke-virtual {v0}, Ly4/k;->a()Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v5}, Lm5/r;->length()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    new-array v4, v4, [Ly4/i;

    .line 65
    .line 66
    iput-object v4, v0, Ly4/k;->i:[Ly4/i;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v15, 0x0

    .line 70
    :goto_0
    iget-object v7, v0, Ly4/k;->i:[Ly4/i;

    .line 71
    .line 72
    array-length v7, v7

    .line 73
    if-ge v15, v7, :cond_b

    .line 74
    .line 75
    invoke-interface {v5, v15}, Lm5/r;->i(I)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Lz4/m;

    .line 84
    .line 85
    iget-object v8, v7, Lz4/m;->b:Lya/i0;

    .line 86
    .line 87
    invoke-virtual {v3, v8}, Lb0/w1;->e0(Ljava/util/List;)Lz4/b;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    iget-object v9, v0, Ly4/k;->i:[Ly4/i;

    .line 92
    .line 93
    new-instance v16, Ly4/i;

    .line 94
    .line 95
    if-eqz v8, :cond_0

    .line 96
    .line 97
    :goto_1
    move-object/from16 v17, v8

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_0
    iget-object v8, v7, Lz4/m;->b:Lya/i0;

    .line 101
    .line 102
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Lz4/b;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :goto_2
    iget-object v8, v7, Lz4/m;->a:Lm4/q;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v10, v8, Lm4/q;->m:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v10}, Lm4/o0;->n(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_2

    .line 121
    .line 122
    iget-boolean v10, v1, Lk5/d;->b:Z

    .line 123
    .line 124
    if-nez v10, :cond_1

    .line 125
    .line 126
    const/4 v8, 0x0

    .line 127
    move-object/from16 v18, v7

    .line 128
    .line 129
    move-object v4, v9

    .line 130
    :goto_3
    move-object v12, v8

    .line 131
    move-wide v8, v13

    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_1
    new-instance v10, Lo6/h;

    .line 135
    .line 136
    iget-object v11, v1, Lk5/d;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v11, Lm3/l;

    .line 139
    .line 140
    invoke-virtual {v11, v8}, Lm3/l;->h(Lm4/q;)Lo6/l;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    invoke-direct {v10, v11, v8}, Lo6/h;-><init>(Lo6/l;Lm4/q;)V

    .line 145
    .line 146
    .line 147
    :goto_4
    move-object/from16 v18, v7

    .line 148
    .line 149
    move-object v0, v8

    .line 150
    move-object v4, v9

    .line 151
    goto/16 :goto_8

    .line 152
    .line 153
    :cond_2
    const/4 v11, 0x1

    .line 154
    if-nez v10, :cond_3

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_3
    const-string v4, "video/webm"

    .line 158
    .line 159
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_4

    .line 164
    .line 165
    const-string v4, "audio/webm"

    .line 166
    .line 167
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_4

    .line 172
    .line 173
    const-string v4, "application/webm"

    .line 174
    .line 175
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-nez v4, :cond_4

    .line 180
    .line 181
    const-string v4, "video/x-matroska"

    .line 182
    .line 183
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-nez v4, :cond_4

    .line 188
    .line 189
    const-string v4, "audio/x-matroska"

    .line 190
    .line 191
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_4

    .line 196
    .line 197
    const-string v4, "application/x-matroska"

    .line 198
    .line 199
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-eqz v4, :cond_5

    .line 204
    .line 205
    :cond_4
    move-object/from16 v18, v7

    .line 206
    .line 207
    move-object v0, v8

    .line 208
    move-object v4, v9

    .line 209
    goto :goto_7

    .line 210
    :cond_5
    :goto_5
    const-string v4, "image/jpeg"

    .line 211
    .line 212
    invoke-static {v10, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_6

    .line 217
    .line 218
    new-instance v10, Lj5/p;

    .line 219
    .line 220
    invoke-direct {v10, v11}, Lj5/p;-><init>(I)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_6
    const-string v4, "image/png"

    .line 225
    .line 226
    invoke-static {v10, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eqz v4, :cond_7

    .line 231
    .line 232
    new-instance v10, Ln6/a;

    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    invoke-direct {v10, v4}, Ln6/a;-><init>(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_7
    if-eqz p13, :cond_8

    .line 240
    .line 241
    const/4 v4, 0x4

    .line 242
    goto :goto_6

    .line 243
    :cond_8
    const/4 v4, 0x0

    .line 244
    :goto_6
    iget-boolean v10, v1, Lk5/d;->b:Z

    .line 245
    .line 246
    if-nez v10, :cond_9

    .line 247
    .line 248
    or-int/lit8 v4, v4, 0x20

    .line 249
    .line 250
    :cond_9
    move-object v10, v7

    .line 251
    new-instance v7, Ll6/j;

    .line 252
    .line 253
    iget-object v11, v1, Lk5/d;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v11, Lm3/l;

    .line 256
    .line 257
    move-object/from16 v18, v10

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    move-object v0, v9

    .line 261
    move v9, v4

    .line 262
    move-object v4, v0

    .line 263
    move-object v0, v8

    .line 264
    move-object v8, v11

    .line 265
    move-object/from16 v11, p14

    .line 266
    .line 267
    invoke-direct/range {v7 .. v12}, Ll6/j;-><init>(Lo6/j;ILp4/y;Ljava/util/List;Ly4/n;)V

    .line 268
    .line 269
    .line 270
    move-object v10, v7

    .line 271
    goto :goto_8

    .line 272
    :goto_7
    iget-boolean v7, v1, Lk5/d;->b:Z

    .line 273
    .line 274
    if-nez v7, :cond_a

    .line 275
    .line 276
    const/4 v11, 0x3

    .line 277
    :cond_a
    new-instance v10, Lj6/d;

    .line 278
    .line 279
    iget-object v7, v1, Lk5/d;->c:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v7, Lm3/l;

    .line 282
    .line 283
    invoke-direct {v10, v7, v11}, Lj6/d;-><init>(Lo6/j;I)V

    .line 284
    .line 285
    .line 286
    :goto_8
    new-instance v8, Lk5/e;

    .line 287
    .line 288
    invoke-direct {v8, v10, v6, v0}, Lk5/e;-><init>(Lr5/n;ILm4/q;)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_3

    .line 292
    .line 293
    :goto_9
    const-wide/16 v13, 0x0

    .line 294
    .line 295
    move v0, v15

    .line 296
    invoke-virtual/range {v18 .. v18}, Lz4/m;->d()Ly4/h;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    move-object/from16 v7, v16

    .line 301
    .line 302
    move-object/from16 v11, v17

    .line 303
    .line 304
    move-object/from16 v10, v18

    .line 305
    .line 306
    invoke-direct/range {v7 .. v15}, Ly4/i;-><init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V

    .line 307
    .line 308
    .line 309
    aput-object v7, v4, v0

    .line 310
    .line 311
    add-int/lit8 v15, v0, 0x1

    .line 312
    .line 313
    move-object/from16 v0, p0

    .line 314
    .line 315
    move-object/from16 v12, p15

    .line 316
    .line 317
    move-wide v13, v8

    .line 318
    const/4 v4, 0x0

    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_b
    return-void
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
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object v0, p0, Ly4/k;->k:Lz4/c;

    .line 2
    .line 3
    iget v1, p0, Ly4/k;->l:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lz4/c;->b(I)Lz4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lz4/h;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Ly4/k;->c:[I

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_0

    .line 21
    .line 22
    aget v5, v2, v4

    .line 23
    .line 24
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lz4/a;

    .line 29
    .line 30
    iget-object v5, v5, Lz4/a;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
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

.method public final b(I)Ly4/i;
    .locals 13

    .line 1
    iget-object v0, p0, Ly4/k;->i:[Ly4/i;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ly4/i;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lz4/m;

    .line 8
    .line 9
    iget-object v2, v2, Lz4/m;->b:Lya/i0;

    .line 10
    .line 11
    iget-object v3, p0, Ly4/k;->b:Lb0/w1;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lb0/w1;->e0(Ljava/util/List;)Lz4/b;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    if-eqz v8, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, Ly4/i;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lz4/b;

    .line 22
    .line 23
    invoke-virtual {v8, v2}, Lz4/b;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    new-instance v4, Ly4/i;

    .line 30
    .line 31
    iget-wide v5, v1, Ly4/i;->a:J

    .line 32
    .line 33
    iget-object v2, v1, Ly4/i;->d:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v7, v2

    .line 36
    check-cast v7, Lz4/m;

    .line 37
    .line 38
    iget-object v2, v1, Ly4/i;->c:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v9, v2

    .line 41
    check-cast v9, Lk5/e;

    .line 42
    .line 43
    iget-wide v10, v1, Ly4/i;->b:J

    .line 44
    .line 45
    iget-object v1, v1, Ly4/i;->f:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v12, v1

    .line 48
    check-cast v12, Ly4/h;

    .line 49
    .line 50
    invoke-direct/range {v4 .. v12}, Ly4/i;-><init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V

    .line 51
    .line 52
    .line 53
    aput-object v4, v0, p1

    .line 54
    .line 55
    return-object v4

    .line 56
    :cond_0
    return-object v1
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
