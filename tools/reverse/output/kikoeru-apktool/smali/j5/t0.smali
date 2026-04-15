.class public final Lj5/t0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lj5/b0;
.implements Lr5/q;
.implements Ln5/j;
.implements Ln5/m;
.implements Lj5/a1;


# static fields
.field public static final Q:Ljava/util/Map;

.field public static final R:Lm4/q;


# instance fields
.field public A:Lb0/w1;

.field public B:Lr5/b0;

.field public C:J

.field public D:Z

.field public E:I

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:I

.field public J:Z

.field public K:J

.field public L:J

.field public M:Z

.field public N:I

.field public O:Z

.field public P:Z

.field public final a:Landroid/net/Uri;

.field public final b:Ls4/h;

.field public final c:Lb5/t;

.field public final d:Lm3/l;

.field public final e:Lah/j;

.field public final f:Lb5/q;

.field public final g:Lj5/w0;

.field public final h:Ln5/f;

.field public final i:Ljava/lang/String;

.field public final j:J

.field public final k:Lm4/q;

.field public final l:J

.field public final m:Ln5/o;

.field public final n:Lc7/e1;

.field public final o:Lp4/f;

.field public final p:Lj5/o0;

.field public final q:Lj5/o0;

.field public final r:Landroid/os/Handler;

.field public s:Lj5/a0;

.field public t:Le6/b;

.field public u:[Lj5/b1;

.field public v:[Lj5/s0;

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lj5/t0;->Q:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, Lm4/p;

    .line 20
    .line 21
    invoke-direct {v0}, Lm4/p;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "icy"

    .line 25
    .line 26
    iput-object v1, v0, Lm4/p;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "application/x-icy"

    .line 29
    .line 30
    invoke-static {v1}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, Lm4/p;->m:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v1, Lm4/q;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lm4/q;-><init>(Lm4/p;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lj5/t0;->R:Lm4/q;

    .line 42
    .line 43
    return-void
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

.method public constructor <init>(Landroid/net/Uri;Ls4/h;Lc7/e1;Lb5/t;Lb5/q;Lm3/l;Lah/j;Lj5/w0;Ln5/f;Ljava/lang/String;ILm4/q;JLo5/a;)V
    .locals 1

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lj5/t0;->a:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object p2, p0, Lj5/t0;->b:Ls4/h;

    .line 9
    .line 10
    iput-object p4, p0, Lj5/t0;->c:Lb5/t;

    .line 11
    .line 12
    iput-object p5, p0, Lj5/t0;->f:Lb5/q;

    .line 13
    .line 14
    iput-object p6, p0, Lj5/t0;->d:Lm3/l;

    .line 15
    .line 16
    iput-object p7, p0, Lj5/t0;->e:Lah/j;

    .line 17
    .line 18
    iput-object p8, p0, Lj5/t0;->g:Lj5/w0;

    .line 19
    .line 20
    iput-object p9, p0, Lj5/t0;->h:Ln5/f;

    .line 21
    .line 22
    iput-object p10, p0, Lj5/t0;->i:Ljava/lang/String;

    .line 23
    .line 24
    int-to-long p1, p11

    .line 25
    iput-wide p1, p0, Lj5/t0;->j:J

    .line 26
    .line 27
    iput-object p12, p0, Lj5/t0;->k:Lm4/q;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance p1, Ln5/o;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ln5/o;-><init>(Lo5/a;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Ln5/o;

    .line 38
    .line 39
    const-string p2, "ProgressiveMediaPeriod"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ln5/o;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iput-object p1, p0, Lj5/t0;->m:Ln5/o;

    .line 45
    .line 46
    iput-object p3, p0, Lj5/t0;->n:Lc7/e1;

    .line 47
    .line 48
    iput-wide p13, p0, Lj5/t0;->l:J

    .line 49
    .line 50
    new-instance p1, Lp4/f;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lj5/t0;->o:Lp4/f;

    .line 56
    .line 57
    new-instance p1, Lj5/o0;

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-direct {p1, p0, p2}, Lj5/o0;-><init>(Lj5/t0;I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lj5/t0;->p:Lj5/o0;

    .line 64
    .line 65
    new-instance p1, Lj5/o0;

    .line 66
    .line 67
    const/4 p2, 0x2

    .line 68
    invoke-direct {p1, p0, p2}, Lj5/o0;-><init>(Lj5/t0;I)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lj5/t0;->q:Lj5/o0;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-static {p1}, Lp4/c0;->n(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lj5/t0;->r:Landroid/os/Handler;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    new-array p2, p1, [Lj5/s0;

    .line 82
    .line 83
    iput-object p2, p0, Lj5/t0;->v:[Lj5/s0;

    .line 84
    .line 85
    new-array p1, p1, [Lj5/b1;

    .line 86
    .line 87
    iput-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 88
    .line 89
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    iput-wide p1, p0, Lj5/t0;->L:J

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    iput p1, p0, Lj5/t0;->E:I

    .line 98
    .line 99
    return-void
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
.method public final A()V
    .locals 15

    .line 1
    iget-wide v0, p0, Lj5/t0;->l:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lj5/t0;->P:Z

    .line 4
    .line 5
    if-nez v2, :cond_c

    .line 6
    .line 7
    iget-boolean v2, p0, Lj5/t0;->x:Z

    .line 8
    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    iget-boolean v2, p0, Lj5/t0;->w:Z

    .line 12
    .line 13
    if-eqz v2, :cond_c

    .line 14
    .line 15
    iget-object v2, p0, Lj5/t0;->B:Lr5/b0;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Lj5/t0;->u:[Lj5/b1;

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    :goto_0
    if-ge v5, v3, :cond_2

    .line 27
    .line 28
    aget-object v6, v2, v5

    .line 29
    .line 30
    invoke-virtual {v6}, Lj5/b1;->w()Lm4/q;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-nez v6, :cond_1

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object v2, p0, Lj5/t0;->o:Lp4/f;

    .line 42
    .line 43
    monitor-enter v2

    .line 44
    :try_start_0
    iput-boolean v4, v2, Lp4/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v2

    .line 47
    iget-object v2, p0, Lj5/t0;->u:[Lj5/b1;

    .line 48
    .line 49
    array-length v2, v2

    .line 50
    new-array v3, v2, [Lm4/j1;

    .line 51
    .line 52
    new-array v5, v2, [Z

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    :goto_1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    const/4 v9, 0x1

    .line 61
    if-ge v6, v2, :cond_a

    .line 62
    .line 63
    iget-object v10, p0, Lj5/t0;->u:[Lj5/b1;

    .line 64
    .line 65
    aget-object v10, v10, v6

    .line 66
    .line 67
    invoke-virtual {v10}, Lj5/b1;->w()Lm4/q;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v11, v10, Lm4/q;->n:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v11}, Lm4/o0;->k(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    if-nez v12, :cond_4

    .line 81
    .line 82
    invoke-static {v11}, Lm4/o0;->o(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-eqz v13, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    const/4 v13, 0x0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    const/4 v13, 0x1

    .line 92
    :goto_3
    aput-boolean v13, v5, v6

    .line 93
    .line 94
    iget-boolean v14, p0, Lj5/t0;->y:Z

    .line 95
    .line 96
    or-int/2addr v13, v14

    .line 97
    iput-boolean v13, p0, Lj5/t0;->y:Z

    .line 98
    .line 99
    invoke-static {v11}, Lm4/o0;->m(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    cmp-long v13, v0, v7

    .line 104
    .line 105
    if-eqz v13, :cond_5

    .line 106
    .line 107
    if-ne v2, v9, :cond_5

    .line 108
    .line 109
    if-eqz v11, :cond_5

    .line 110
    .line 111
    const/4 v7, 0x1

    .line 112
    goto :goto_4

    .line 113
    :cond_5
    const/4 v7, 0x0

    .line 114
    :goto_4
    iput-boolean v7, p0, Lj5/t0;->z:Z

    .line 115
    .line 116
    iget-object v7, p0, Lj5/t0;->t:Le6/b;

    .line 117
    .line 118
    if-eqz v7, :cond_9

    .line 119
    .line 120
    iget v8, v7, Le6/b;->a:I

    .line 121
    .line 122
    if-nez v12, :cond_6

    .line 123
    .line 124
    iget-object v11, p0, Lj5/t0;->v:[Lj5/s0;

    .line 125
    .line 126
    aget-object v11, v11, v6

    .line 127
    .line 128
    iget-boolean v11, v11, Lj5/s0;->b:Z

    .line 129
    .line 130
    if-eqz v11, :cond_8

    .line 131
    .line 132
    :cond_6
    iget-object v11, v10, Lm4/q;->l:Lm4/n0;

    .line 133
    .line 134
    if-nez v11, :cond_7

    .line 135
    .line 136
    new-instance v11, Lm4/n0;

    .line 137
    .line 138
    new-array v13, v9, [Lm4/m0;

    .line 139
    .line 140
    aput-object v7, v13, v4

    .line 141
    .line 142
    invoke-direct {v11, v13}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    new-array v13, v9, [Lm4/m0;

    .line 147
    .line 148
    aput-object v7, v13, v4

    .line 149
    .line 150
    invoke-virtual {v11, v13}, Lm4/n0;->a([Lm4/m0;)Lm4/n0;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    :goto_5
    invoke-virtual {v10}, Lm4/q;->a()Lm4/p;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    iput-object v11, v7, Lm4/p;->k:Lm4/n0;

    .line 159
    .line 160
    new-instance v10, Lm4/q;

    .line 161
    .line 162
    invoke-direct {v10, v7}, Lm4/q;-><init>(Lm4/p;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    if-eqz v12, :cond_9

    .line 166
    .line 167
    iget v7, v10, Lm4/q;->h:I

    .line 168
    .line 169
    const/4 v11, -0x1

    .line 170
    if-ne v7, v11, :cond_9

    .line 171
    .line 172
    iget v7, v10, Lm4/q;->i:I

    .line 173
    .line 174
    if-ne v7, v11, :cond_9

    .line 175
    .line 176
    if-eq v8, v11, :cond_9

    .line 177
    .line 178
    invoke-virtual {v10}, Lm4/q;->a()Lm4/p;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    iput v8, v7, Lm4/p;->h:I

    .line 183
    .line 184
    new-instance v10, Lm4/q;

    .line 185
    .line 186
    invoke-direct {v10, v7}, Lm4/q;-><init>(Lm4/p;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    iget-object v7, p0, Lj5/t0;->c:Lb5/t;

    .line 190
    .line 191
    invoke-interface {v7, v10}, Lb5/t;->k(Lm4/q;)I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    invoke-virtual {v10}, Lm4/q;->a()Lm4/p;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    iput v7, v8, Lm4/p;->L:I

    .line 200
    .line 201
    new-instance v7, Lm4/q;

    .line 202
    .line 203
    invoke-direct {v7, v8}, Lm4/q;-><init>(Lm4/p;)V

    .line 204
    .line 205
    .line 206
    new-instance v8, Lm4/j1;

    .line 207
    .line 208
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    new-array v9, v9, [Lm4/q;

    .line 213
    .line 214
    aput-object v7, v9, v4

    .line 215
    .line 216
    invoke-direct {v8, v10, v9}, Lm4/j1;-><init>(Ljava/lang/String;[Lm4/q;)V

    .line 217
    .line 218
    .line 219
    aput-object v8, v3, v6

    .line 220
    .line 221
    iget-boolean v8, p0, Lj5/t0;->H:Z

    .line 222
    .line 223
    iget-boolean v7, v7, Lm4/q;->t:Z

    .line 224
    .line 225
    or-int/2addr v7, v8

    .line 226
    iput-boolean v7, p0, Lj5/t0;->H:Z

    .line 227
    .line 228
    add-int/lit8 v6, v6, 0x1

    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_a
    new-instance v2, Lb0/w1;

    .line 233
    .line 234
    new-instance v4, Lj5/o1;

    .line 235
    .line 236
    invoke-direct {v4, v3}, Lj5/o1;-><init>([Lm4/j1;)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v2, v4, v5}, Lb0/w1;-><init>(Lj5/o1;[Z)V

    .line 240
    .line 241
    .line 242
    iput-object v2, p0, Lj5/t0;->A:Lb0/w1;

    .line 243
    .line 244
    iget-boolean v2, p0, Lj5/t0;->z:Z

    .line 245
    .line 246
    if-eqz v2, :cond_b

    .line 247
    .line 248
    iget-wide v2, p0, Lj5/t0;->C:J

    .line 249
    .line 250
    cmp-long v4, v2, v7

    .line 251
    .line 252
    if-nez v4, :cond_b

    .line 253
    .line 254
    iput-wide v0, p0, Lj5/t0;->C:J

    .line 255
    .line 256
    new-instance v0, Lj5/p0;

    .line 257
    .line 258
    iget-object v1, p0, Lj5/t0;->B:Lr5/b0;

    .line 259
    .line 260
    invoke-direct {v0, p0, v1}, Lj5/p0;-><init>(Lj5/t0;Lr5/b0;)V

    .line 261
    .line 262
    .line 263
    iput-object v0, p0, Lj5/t0;->B:Lr5/b0;

    .line 264
    .line 265
    :cond_b
    iget-object v0, p0, Lj5/t0;->g:Lj5/w0;

    .line 266
    .line 267
    iget-wide v1, p0, Lj5/t0;->C:J

    .line 268
    .line 269
    iget-object v3, p0, Lj5/t0;->B:Lr5/b0;

    .line 270
    .line 271
    invoke-interface {v3}, Lr5/b0;->e()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    iget-boolean v4, p0, Lj5/t0;->D:Z

    .line 276
    .line 277
    invoke-virtual {v0, v1, v2, v3, v4}, Lj5/w0;->v(JZZ)V

    .line 278
    .line 279
    .line 280
    iput-boolean v9, p0, Lj5/t0;->x:Z

    .line 281
    .line 282
    iget-object v0, p0, Lj5/t0;->s:Lj5/a0;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-interface {v0, p0}, Lj5/a0;->a(Lj5/b0;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :catchall_0
    move-exception v0

    .line 292
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 293
    throw v0

    .line 294
    :cond_c
    :goto_6
    return-void
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
.end method

.method public final B(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 5
    .line 6
    iget-object v1, v0, Lb0/w1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, [Z

    .line 9
    .line 10
    aget-boolean v2, v1, p1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lj5/o1;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lj5/o1;->a(I)Lm4/j1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v0, v0, Lm4/j1;->d:[Lm4/q;

    .line 24
    .line 25
    aget-object v5, v0, v2

    .line 26
    .line 27
    iget-object v0, v5, Lm4/q;->n:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lm4/o0;->i(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v7, 0x0

    .line 34
    iget-wide v8, p0, Lj5/t0;->K:J

    .line 35
    .line 36
    iget-object v3, p0, Lj5/t0;->e:Lah/j;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-virtual/range {v3 .. v9}, Lah/j;->j(ILm4/q;ILjava/lang/Object;J)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    aput-boolean v0, v1, p1

    .line 44
    .line 45
    :cond_0
    return-void
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

.method public final C(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lj5/t0;->M:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, Lj5/t0;->y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 13
    .line 14
    iget-object v0, v0, Lb0/w1;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, [Z

    .line 17
    .line 18
    aget-boolean v0, v0, p1

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 23
    .line 24
    aget-object p1, v0, p1

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Lj5/b1;->x(Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, Lj5/t0;->L:J

    .line 37
    .line 38
    iput-boolean v0, p0, Lj5/t0;->M:Z

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lj5/t0;->G:Z

    .line 42
    .line 43
    iput-wide v1, p0, Lj5/t0;->K:J

    .line 44
    .line 45
    iput v0, p0, Lj5/t0;->N:I

    .line 46
    .line 47
    iget-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 48
    .line 49
    array-length v1, p1

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-ge v2, v1, :cond_2

    .line 52
    .line 53
    aget-object v3, p1, v2

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Lj5/b1;->D(Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object p1, p0, Lj5/t0;->s:Lj5/a0;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, Lj5/d1;->c(Lj5/e1;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void
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

.method public final D(Lj5/s0;)Lr5/h0;
    .locals 5

    .line 1
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lj5/t0;->v:[Lj5/s0;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lj5/s0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, Lj5/t0;->w:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Extractor added new track (id="

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget p1, p1, Lj5/s0;->a:I

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ") after finishing tracks."

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v0, "ProgressiveMediaPeriod"

    .line 51
    .line 52
    invoke-static {v0, p1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lr5/m;

    .line 56
    .line 57
    invoke-direct {p1}, Lr5/m;-><init>()V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    new-instance v1, Lj5/b1;

    .line 62
    .line 63
    iget-object v2, p0, Lj5/t0;->c:Lb5/t;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Lj5/t0;->h:Ln5/f;

    .line 69
    .line 70
    iget-object v4, p0, Lj5/t0;->f:Lb5/q;

    .line 71
    .line 72
    invoke-direct {v1, v3, v2, v4}, Lj5/b1;-><init>(Ln5/f;Lb5/t;Lb5/q;)V

    .line 73
    .line 74
    .line 75
    iput-object p0, v1, Lj5/b1;->f:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v2, p0, Lj5/t0;->v:[Lj5/s0;

    .line 78
    .line 79
    add-int/lit8 v3, v0, 0x1

    .line 80
    .line 81
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, [Lj5/s0;

    .line 86
    .line 87
    aput-object p1, v2, v0

    .line 88
    .line 89
    sget p1, Lp4/c0;->a:I

    .line 90
    .line 91
    iput-object v2, p0, Lj5/t0;->v:[Lj5/s0;

    .line 92
    .line 93
    iget-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 94
    .line 95
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, [Lj5/b1;

    .line 100
    .line 101
    aput-object v1, p1, v0

    .line 102
    .line 103
    iput-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 104
    .line 105
    return-object v1
.end method

.method public final E(Lr5/b0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj5/t0;->t:Le6/b;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lr5/s;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lr5/s;-><init>(J)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iput-object v0, p0, Lj5/t0;->B:Lr5/b0;

    .line 18
    .line 19
    invoke-interface {p1}, Lr5/b0;->m()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iput-wide v3, p0, Lj5/t0;->C:J

    .line 24
    .line 25
    iget-boolean v0, p0, Lj5/t0;->J:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, Lr5/b0;->m()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long v0, v4, v1

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    iput-boolean v0, p0, Lj5/t0;->D:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x7

    .line 46
    :cond_2
    iput v3, p0, Lj5/t0;->E:I

    .line 47
    .line 48
    iget-boolean v0, p0, Lj5/t0;->x:Z

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-wide v0, p0, Lj5/t0;->C:J

    .line 53
    .line 54
    invoke-interface {p1}, Lr5/b0;->e()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget-boolean v2, p0, Lj5/t0;->D:Z

    .line 59
    .line 60
    iget-object v3, p0, Lj5/t0;->g:Lj5/w0;

    .line 61
    .line 62
    invoke-virtual {v3, v0, v1, p1, v2}, Lj5/w0;->v(JZZ)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    invoke-virtual {p0}, Lj5/t0;->A()V

    .line 67
    .line 68
    .line 69
    return-void
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

.method public final F()V
    .locals 10

    .line 1
    new-instance v0, Lj5/q0;

    .line 2
    .line 3
    iget-object v4, p0, Lj5/t0;->n:Lc7/e1;

    .line 4
    .line 5
    iget-object v6, p0, Lj5/t0;->o:Lp4/f;

    .line 6
    .line 7
    iget-object v2, p0, Lj5/t0;->a:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v3, p0, Lj5/t0;->b:Ls4/h;

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v0 .. v6}, Lj5/q0;-><init>(Lj5/t0;Landroid/net/Uri;Ls4/h;Lc7/e1;Lj5/t0;Lp4/f;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v2, v1, Lj5/t0;->x:Z

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lj5/t0;->z()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 25
    .line 26
    .line 27
    iget-wide v2, v1, Lj5/t0;->C:J

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long v7, v2, v5

    .line 36
    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    iget-wide v7, v1, Lj5/t0;->L:J

    .line 40
    .line 41
    cmp-long v9, v7, v2

    .line 42
    .line 43
    if-lez v9, :cond_0

    .line 44
    .line 45
    iput-boolean v4, v1, Lj5/t0;->O:Z

    .line 46
    .line 47
    iput-wide v5, v1, Lj5/t0;->L:J

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object v2, v1, Lj5/t0;->B:Lr5/b0;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-wide v7, v1, Lj5/t0;->L:J

    .line 56
    .line 57
    invoke-interface {v2, v7, v8}, Lr5/b0;->k(J)Lr5/a0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v2, v2, Lr5/a0;->a:Lr5/c0;

    .line 62
    .line 63
    iget-wide v2, v2, Lr5/c0;->b:J

    .line 64
    .line 65
    iget-wide v7, v1, Lj5/t0;->L:J

    .line 66
    .line 67
    iget-object v9, v0, Lj5/q0;->f:Lb0/a;

    .line 68
    .line 69
    iput-wide v2, v9, Lb0/a;->a:J

    .line 70
    .line 71
    iput-wide v7, v0, Lj5/q0;->i:J

    .line 72
    .line 73
    iput-boolean v4, v0, Lj5/q0;->h:Z

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    iput-boolean v2, v0, Lj5/q0;->l:Z

    .line 77
    .line 78
    iget-object v3, v1, Lj5/t0;->u:[Lj5/b1;

    .line 79
    .line 80
    array-length v4, v3

    .line 81
    :goto_0
    if-ge v2, v4, :cond_1

    .line 82
    .line 83
    aget-object v7, v3, v2

    .line 84
    .line 85
    iget-wide v8, v1, Lj5/t0;->L:J

    .line 86
    .line 87
    iput-wide v8, v7, Lj5/b1;->t:J

    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iput-wide v5, v1, Lj5/t0;->L:J

    .line 93
    .line 94
    :cond_2
    invoke-virtual {p0}, Lj5/t0;->x()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    iput v2, v1, Lj5/t0;->N:I

    .line 99
    .line 100
    iget-object v2, v1, Lj5/t0;->d:Lm3/l;

    .line 101
    .line 102
    iget v3, v1, Lj5/t0;->E:I

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lm3/l;->u(I)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    iget-object v3, v1, Lj5/t0;->m:Ln5/o;

    .line 109
    .line 110
    invoke-virtual {v3, v0, p0, v2}, Ln5/o;->f(Ln5/l;Ln5/j;I)V

    .line 111
    .line 112
    .line 113
    return-void
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
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj5/t0;->G:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lj5/t0;->z()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
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

.method public final a(Lr5/b0;)V
    .locals 2

    .line 1
    new-instance v0, Lb5/h;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lj5/t0;->r:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj5/t0;->r:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lj5/t0;->p:Lj5/o0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x0

    .line 6
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    invoke-virtual {v4, v5}, Lj5/b1;->D(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, Lj5/b1;->h:Lb5/l;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    iget-object v6, v4, Lj5/b1;->e:Lb5/q;

    .line 19
    .line 20
    invoke-interface {v5, v6}, Lb5/l;->c(Lb5/q;)V

    .line 21
    .line 22
    .line 23
    iput-object v3, v4, Lj5/b1;->h:Lb5/l;

    .line 24
    .line 25
    iput-object v3, v4, Lj5/b1;->g:Lm4/q;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lj5/t0;->n:Lc7/e1;

    .line 31
    .line 32
    iget-object v1, v0, Lc7/e1;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lr5/n;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Lr5/n;->a()V

    .line 39
    .line 40
    .line 41
    iput-object v3, v0, Lc7/e1;->c:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_2
    iput-object v3, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    return-void
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

.method public final d()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj5/t0;->t()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method public final e(Lv4/f0;)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, Lj5/t0;->O:Z

    .line 2
    .line 3
    if-nez p1, :cond_3

    .line 4
    .line 5
    iget-object p1, p0, Lj5/t0;->m:Ln5/o;

    .line 6
    .line 7
    invoke-virtual {p1}, Ln5/o;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    iget-boolean v0, p0, Lj5/t0;->M:Z

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    iget-boolean v0, p0, Lj5/t0;->x:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lj5/t0;->k:Lm4/q;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget v0, p0, Lj5/t0;->I:I

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lj5/t0;->o:Lp4/f;

    .line 31
    .line 32
    invoke-virtual {v0}, Lp4/f;->f()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Ln5/o;->d()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lj5/t0;->F()V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_2
    return v0

    .line 48
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 49
    return p1
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

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj5/t0;->d:Lm3/l;

    .line 2
    .line 3
    iget v1, p0, Lj5/t0;->E:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lm3/l;->u(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lj5/t0;->m:Ln5/o;

    .line 10
    .line 11
    iget-object v2, v1, Ln5/o;->c:Ljava/io/IOException;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    iget-object v1, v1, Ln5/o;->b:Ln5/k;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    const/high16 v2, -0x80000000

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget v0, v1, Ln5/k;->a:I

    .line 24
    .line 25
    :cond_0
    iget-object v2, v1, Ln5/k;->e:Ljava/io/IOException;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget v1, v1, Ln5/k;->f:I

    .line 30
    .line 31
    if-gt v1, v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    throw v2

    .line 35
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lj5/t0;->O:Z

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-boolean v0, p0, Lj5/t0;->x:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const-string v0, "Loading finished before preparation is complete."

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    throw v0

    .line 52
    :cond_4
    :goto_1
    return-void

    .line 53
    :cond_5
    throw v2
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

.method public final g(Lj5/a0;J)V
    .locals 5

    .line 1
    iput-object p1, p0, Lj5/t0;->s:Lj5/a0;

    .line 2
    .line 3
    iget-object p1, p0, Lj5/t0;->k:Lm4/q;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, Lj5/t0;->u(II)Lr5/h0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1}, Lr5/h0;->b(Lm4/q;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lr5/y;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    new-array v2, v0, [J

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    aput-wide v3, v2, v1

    .line 24
    .line 25
    new-array v0, v0, [J

    .line 26
    .line 27
    aput-wide v3, v0, v1

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v3, v4, v2, v0}, Lr5/y;-><init>(J[J[J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lj5/t0;->E(Lr5/b0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lj5/t0;->n()V

    .line 41
    .line 42
    .line 43
    iput-wide p2, p0, Lj5/t0;->L:J

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object p1, p0, Lj5/t0;->o:Lp4/f;

    .line 47
    .line 48
    invoke-virtual {p1}, Lp4/f;->f()Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lj5/t0;->F()V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final h(J)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 5
    .line 6
    iget-object v0, v0, Lb0/w1;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Z

    .line 9
    .line 10
    iget-object v1, p0, Lj5/t0;->B:Lr5/b0;

    .line 11
    .line 12
    invoke-interface {v1}, Lr5/b0;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 p1, 0x0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lj5/t0;->G:Z

    .line 23
    .line 24
    iget-wide v2, p0, Lj5/t0;->K:J

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    cmp-long v5, v2, p1

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v2, 0x0

    .line 34
    :goto_1
    iput-wide p1, p0, Lj5/t0;->K:J

    .line 35
    .line 36
    invoke-virtual {p0}, Lj5/t0;->z()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iput-wide p1, p0, Lj5/t0;->L:J

    .line 43
    .line 44
    return-wide p1

    .line 45
    :cond_2
    iget v3, p0, Lj5/t0;->E:I

    .line 46
    .line 47
    const/4 v5, 0x7

    .line 48
    iget-object v6, p0, Lj5/t0;->m:Ln5/o;

    .line 49
    .line 50
    if-eq v3, v5, :cond_9

    .line 51
    .line 52
    iget-boolean v3, p0, Lj5/t0;->O:Z

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    invoke-virtual {v6}, Ln5/o;->d()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_9

    .line 61
    .line 62
    :cond_3
    iget-object v3, p0, Lj5/t0;->u:[Lj5/b1;

    .line 63
    .line 64
    array-length v3, v3

    .line 65
    const/4 v5, 0x0

    .line 66
    :goto_2
    if-ge v5, v3, :cond_8

    .line 67
    .line 68
    iget-object v7, p0, Lj5/t0;->u:[Lj5/b1;

    .line 69
    .line 70
    aget-object v7, v7, v5

    .line 71
    .line 72
    invoke-virtual {v7}, Lj5/b1;->t()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-nez v8, :cond_4

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    iget-boolean v8, p0, Lj5/t0;->z:Z

    .line 82
    .line 83
    if-eqz v8, :cond_5

    .line 84
    .line 85
    iget v8, v7, Lj5/b1;->q:I

    .line 86
    .line 87
    invoke-virtual {v7, v8}, Lj5/b1;->F(I)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    goto :goto_3

    .line 92
    :cond_5
    invoke-virtual {v7, p1, p2, v1}, Lj5/b1;->G(JZ)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    :goto_3
    if-nez v7, :cond_7

    .line 97
    .line 98
    aget-boolean v7, v0, v5

    .line 99
    .line 100
    if-nez v7, :cond_6

    .line 101
    .line 102
    iget-boolean v7, p0, Lj5/t0;->y:Z

    .line 103
    .line 104
    if-nez v7, :cond_7

    .line 105
    .line 106
    :cond_6
    const/4 v4, 0x0

    .line 107
    goto :goto_5

    .line 108
    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_9
    iput-boolean v1, p0, Lj5/t0;->M:Z

    .line 115
    .line 116
    iput-wide p1, p0, Lj5/t0;->L:J

    .line 117
    .line 118
    iput-boolean v1, p0, Lj5/t0;->O:Z

    .line 119
    .line 120
    iput-boolean v1, p0, Lj5/t0;->H:Z

    .line 121
    .line 122
    invoke-virtual {v6}, Ln5/o;->d()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 129
    .line 130
    array-length v2, v0

    .line 131
    :goto_6
    if-ge v1, v2, :cond_a

    .line 132
    .line 133
    aget-object v3, v0, v1

    .line 134
    .line 135
    invoke-virtual {v3}, Lj5/b1;->k()V

    .line 136
    .line 137
    .line 138
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_a
    invoke-virtual {v6}, Ln5/o;->a()V

    .line 142
    .line 143
    .line 144
    return-wide p1

    .line 145
    :cond_b
    const/4 v0, 0x0

    .line 146
    iput-object v0, v6, Ln5/o;->c:Ljava/io/IOException;

    .line 147
    .line 148
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 149
    .line 150
    array-length v2, v0

    .line 151
    const/4 v3, 0x0

    .line 152
    :goto_7
    if-ge v3, v2, :cond_c

    .line 153
    .line 154
    aget-object v4, v0, v3

    .line 155
    .line 156
    invoke-virtual {v4, v1}, Lj5/b1;->D(Z)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_c
    :goto_8
    return-wide p1
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
.end method

.method public final i(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lj5/t0;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lj5/t0;->z()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 17
    .line 18
    iget-object v0, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, [Z

    .line 21
    .line 22
    iget-object v1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 23
    .line 24
    array-length v1, v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    iget-object v3, p0, Lj5/t0;->u:[Lj5/b1;

    .line 29
    .line 30
    aget-object v3, v3, v2

    .line 31
    .line 32
    aget-boolean v4, v0, v2

    .line 33
    .line 34
    invoke-virtual {v3, p1, p2, v4}, Lj5/b1;->j(JZ)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return-void
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

.method public final j()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj5/t0;->x:Z

    .line 2
    .line 3
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lj5/t0;->B:Lr5/b0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
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
.end method

.method public final k(Ln5/l;JJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lj5/q0;

    .line 6
    .line 7
    iget-wide v2, v0, Lj5/t0;->C:J

    .line 8
    .line 9
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    cmp-long v7, v2, v4

    .line 16
    .line 17
    if-nez v7, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, Lj5/t0;->B:Lr5/b0;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v2}, Lr5/b0;->e()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0, v6}, Lj5/t0;->y(Z)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    const-wide/high16 v7, -0x8000000000000000L

    .line 32
    .line 33
    cmp-long v5, v3, v7

    .line 34
    .line 35
    if-nez v5, :cond_0

    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-wide/16 v7, 0x2710

    .line 41
    .line 42
    add-long/2addr v3, v7

    .line 43
    :goto_0
    iput-wide v3, v0, Lj5/t0;->C:J

    .line 44
    .line 45
    iget-object v5, v0, Lj5/t0;->g:Lj5/w0;

    .line 46
    .line 47
    iget-boolean v7, v0, Lj5/t0;->D:Z

    .line 48
    .line 49
    invoke-virtual {v5, v3, v4, v2, v7}, Lj5/w0;->v(JZZ)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v2, v1, Lj5/q0;->b:Ls4/d0;

    .line 53
    .line 54
    new-instance v8, Lj5/u;

    .line 55
    .line 56
    iget-object v2, v2, Ls4/d0;->c:Landroid/net/Uri;

    .line 57
    .line 58
    move-wide/from16 v2, p4

    .line 59
    .line 60
    invoke-direct {v8, v2, v3}, Lj5/u;-><init>(J)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lj5/t0;->d:Lm3/l;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-wide v14, v1, Lj5/q0;->i:J

    .line 69
    .line 70
    iget-wide v1, v0, Lj5/t0;->C:J

    .line 71
    .line 72
    iget-object v7, v0, Lj5/t0;->e:Lah/j;

    .line 73
    .line 74
    const/4 v9, 0x1

    .line 75
    const/4 v10, -0x1

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    move-wide/from16 v16, v1

    .line 80
    .line 81
    invoke-virtual/range {v7 .. v17}, Lah/j;->B(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 82
    .line 83
    .line 84
    iput-boolean v6, v0, Lj5/t0;->O:Z

    .line 85
    .line 86
    iget-object v1, v0, Lj5/t0;->s:Lj5/a0;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v0}, Lj5/d1;->c(Lj5/e1;)V

    .line 92
    .line 93
    .line 94
    return-void
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

.method public final l([Lm5/r;[Z[Lj5/c1;[ZJ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 5
    .line 6
    iget-object v1, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lj5/o1;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [Z

    .line 13
    .line 14
    iget v2, p0, Lj5/t0;->I:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    array-length v5, p1

    .line 19
    const/4 v6, 0x1

    .line 20
    if-ge v4, v5, :cond_2

    .line 21
    .line 22
    aget-object v5, p3, v4

    .line 23
    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    aget-object v7, p1, v4

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    aget-boolean v7, p2, v4

    .line 31
    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    :cond_0
    check-cast v5, Lj5/r0;

    .line 35
    .line 36
    iget v5, v5, Lj5/r0;->a:I

    .line 37
    .line 38
    aget-boolean v7, v0, v5

    .line 39
    .line 40
    invoke-static {v7}, Lp4/c;->i(Z)V

    .line 41
    .line 42
    .line 43
    iget v7, p0, Lj5/t0;->I:I

    .line 44
    .line 45
    sub-int/2addr v7, v6

    .line 46
    iput v7, p0, Lj5/t0;->I:I

    .line 47
    .line 48
    aput-boolean v3, v0, v5

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    aput-object v5, p3, v4

    .line 52
    .line 53
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-boolean p2, p0, Lj5/t0;->F:Z

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    :goto_1
    const/4 p2, 0x1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/4 p2, 0x0

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    cmp-long p2, p5, v4

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    iget-boolean p2, p0, Lj5/t0;->z:Z

    .line 73
    .line 74
    if-nez p2, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    const/4 v2, 0x0

    .line 78
    :goto_3
    array-length v4, p1

    .line 79
    if-ge v2, v4, :cond_9

    .line 80
    .line 81
    aget-object v4, p3, v2

    .line 82
    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    aget-object v4, p1, v2

    .line 86
    .line 87
    if-eqz v4, :cond_8

    .line 88
    .line 89
    invoke-interface {v4}, Lm5/r;->length()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-ne v5, v6, :cond_5

    .line 94
    .line 95
    const/4 v5, 0x1

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    const/4 v5, 0x0

    .line 98
    :goto_4
    invoke-static {v5}, Lp4/c;->i(Z)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4, v3}, Lm5/r;->i(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_6

    .line 106
    .line 107
    const/4 v5, 0x1

    .line 108
    goto :goto_5

    .line 109
    :cond_6
    const/4 v5, 0x0

    .line 110
    :goto_5
    invoke-static {v5}, Lp4/c;->i(Z)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v4}, Lm5/r;->b()Lm4/j1;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v1, v5}, Lj5/o1;->b(Lm4/j1;)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    aget-boolean v7, v0, v5

    .line 122
    .line 123
    xor-int/2addr v7, v6

    .line 124
    invoke-static {v7}, Lp4/c;->i(Z)V

    .line 125
    .line 126
    .line 127
    iget v7, p0, Lj5/t0;->I:I

    .line 128
    .line 129
    add-int/2addr v7, v6

    .line 130
    iput v7, p0, Lj5/t0;->I:I

    .line 131
    .line 132
    aput-boolean v6, v0, v5

    .line 133
    .line 134
    iget-boolean v7, p0, Lj5/t0;->H:Z

    .line 135
    .line 136
    invoke-interface {v4}, Lm5/r;->m()Lm4/q;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    iget-boolean v4, v4, Lm4/q;->t:Z

    .line 141
    .line 142
    or-int/2addr v4, v7

    .line 143
    iput-boolean v4, p0, Lj5/t0;->H:Z

    .line 144
    .line 145
    new-instance v4, Lj5/r0;

    .line 146
    .line 147
    invoke-direct {v4, p0, v5}, Lj5/r0;-><init>(Lj5/t0;I)V

    .line 148
    .line 149
    .line 150
    aput-object v4, p3, v2

    .line 151
    .line 152
    aput-boolean v6, p4, v2

    .line 153
    .line 154
    if-nez p2, :cond_8

    .line 155
    .line 156
    iget-object p2, p0, Lj5/t0;->u:[Lj5/b1;

    .line 157
    .line 158
    aget-object p2, p2, v5

    .line 159
    .line 160
    invoke-virtual {p2}, Lj5/b1;->t()I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_7

    .line 165
    .line 166
    invoke-virtual {p2, p5, p6, v6}, Lj5/b1;->G(JZ)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-nez p2, :cond_7

    .line 171
    .line 172
    const/4 p2, 0x1

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    const/4 p2, 0x0

    .line 175
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_9
    iget p1, p0, Lj5/t0;->I:I

    .line 179
    .line 180
    if-nez p1, :cond_c

    .line 181
    .line 182
    iput-boolean v3, p0, Lj5/t0;->M:Z

    .line 183
    .line 184
    iput-boolean v3, p0, Lj5/t0;->G:Z

    .line 185
    .line 186
    iput-boolean v3, p0, Lj5/t0;->H:Z

    .line 187
    .line 188
    iget-object p1, p0, Lj5/t0;->m:Ln5/o;

    .line 189
    .line 190
    invoke-virtual {p1}, Ln5/o;->d()Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-eqz p2, :cond_b

    .line 195
    .line 196
    iget-object p2, p0, Lj5/t0;->u:[Lj5/b1;

    .line 197
    .line 198
    array-length p3, p2

    .line 199
    :goto_7
    if-ge v3, p3, :cond_a

    .line 200
    .line 201
    aget-object p4, p2, v3

    .line 202
    .line 203
    invoke-virtual {p4}, Lj5/b1;->k()V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v3, v3, 0x1

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_a
    invoke-virtual {p1}, Ln5/o;->a()V

    .line 210
    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_b
    iput-boolean v3, p0, Lj5/t0;->O:Z

    .line 214
    .line 215
    iget-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 216
    .line 217
    array-length p2, p1

    .line 218
    const/4 p3, 0x0

    .line 219
    :goto_8
    if-ge p3, p2, :cond_e

    .line 220
    .line 221
    aget-object p4, p1, p3

    .line 222
    .line 223
    invoke-virtual {p4, v3}, Lj5/b1;->D(Z)V

    .line 224
    .line 225
    .line 226
    add-int/lit8 p3, p3, 0x1

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_c
    if-eqz p2, :cond_e

    .line 230
    .line 231
    invoke-virtual {p0, p5, p6}, Lj5/t0;->h(J)J

    .line 232
    .line 233
    .line 234
    move-result-wide p5

    .line 235
    :goto_9
    array-length p1, p3

    .line 236
    if-ge v3, p1, :cond_e

    .line 237
    .line 238
    aget-object p1, p3, v3

    .line 239
    .line 240
    if-eqz p1, :cond_d

    .line 241
    .line 242
    aput-boolean v6, p4, v3

    .line 243
    .line 244
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_e
    :goto_a
    iput-boolean v6, p0, Lj5/t0;->F:Z

    .line 248
    .line 249
    return-wide p5
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

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/t0;->m:Ln5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/o;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj5/t0;->o:Lp4/f;

    .line 10
    .line 11
    invoke-virtual {v0}, Lp4/f;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
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

.method public final n()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj5/t0;->w:Z

    .line 3
    .line 4
    iget-object v0, p0, Lj5/t0;->r:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lj5/t0;->p:Lj5/o0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final o(JLv4/b1;)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj5/t0;->B:Lr5/b0;

    .line 5
    .line 6
    invoke-interface {v0}, Lr5/b0;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 p1, 0x0

    .line 13
    .line 14
    return-wide p1

    .line 15
    :cond_0
    iget-object v0, p0, Lj5/t0;->B:Lr5/b0;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, Lr5/b0;->k(J)Lr5/a0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, v0, Lr5/a0;->a:Lr5/c0;

    .line 22
    .line 23
    iget-wide v5, v1, Lr5/c0;->a:J

    .line 24
    .line 25
    iget-object v0, v0, Lr5/a0;->b:Lr5/c0;

    .line 26
    .line 27
    iget-wide v7, v0, Lr5/c0;->a:J

    .line 28
    .line 29
    move-wide v3, p1

    .line 30
    move-object v2, p3

    .line 31
    invoke-virtual/range {v2 .. v8}, Lv4/b1;->a(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    return-wide p1
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

.method public final p()J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lj5/t0;->H:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lj5/t0;->H:Z

    .line 7
    .line 8
    iget-wide v0, p0, Lj5/t0;->K:J

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lj5/t0;->G:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lj5/t0;->O:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lj5/t0;->x()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v2, p0, Lj5/t0;->N:I

    .line 24
    .line 25
    if-le v0, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iput-boolean v1, p0, Lj5/t0;->G:Z

    .line 28
    .line 29
    iget-wide v0, p0, Lj5/t0;->K:J

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    return-wide v0
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
.end method

.method public final q()Lj5/o1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj5/t0;->A:Lb0/w1;

    .line 5
    .line 6
    iget-object v0, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj5/o1;

    .line 9
    .line 10
    return-object v0
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

.method public final r(Ln5/l;JJI)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lj5/q0;

    .line 6
    .line 7
    iget-object v2, v1, Lj5/q0;->b:Ls4/d0;

    .line 8
    .line 9
    if-nez p6, :cond_0

    .line 10
    .line 11
    new-instance v2, Lj5/u;

    .line 12
    .line 13
    iget-object v3, v1, Lj5/q0;->j:Ls4/m;

    .line 14
    .line 15
    invoke-direct {v2, v3}, Lj5/u;-><init>(Ls4/m;)V

    .line 16
    .line 17
    .line 18
    move-object v5, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, Lj5/u;

    .line 21
    .line 22
    iget-object v2, v2, Ls4/d0;->c:Landroid/net/Uri;

    .line 23
    .line 24
    move-wide/from16 v4, p4

    .line 25
    .line 26
    invoke-direct {v3, v4, v5}, Lj5/u;-><init>(J)V

    .line 27
    .line 28
    .line 29
    move-object v5, v3

    .line 30
    :goto_0
    iget-wide v11, v1, Lj5/q0;->i:J

    .line 31
    .line 32
    iget-wide v13, v0, Lj5/t0;->C:J

    .line 33
    .line 34
    iget-object v4, v0, Lj5/t0;->e:Lah/j;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, -0x1

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    move/from16 v15, p6

    .line 42
    .line 43
    invoke-virtual/range {v4 .. v15}, Lah/j;->E(Lj5/u;IILm4/q;ILjava/lang/Object;JJI)V

    .line 44
    .line 45
    .line 46
    return-void
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
.end method

.method public final s(Ln5/l;JJZ)V
    .locals 12

    .line 1
    check-cast p1, Lj5/q0;

    .line 2
    .line 3
    iget-object v0, p1, Lj5/q0;->b:Ls4/d0;

    .line 4
    .line 5
    new-instance v2, Lj5/u;

    .line 6
    .line 7
    iget-object v0, v0, Ls4/d0;->c:Landroid/net/Uri;

    .line 8
    .line 9
    move-wide/from16 v0, p4

    .line 10
    .line 11
    invoke-direct {v2, v0, v1}, Lj5/u;-><init>(J)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lj5/t0;->d:Lm3/l;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-wide v8, p1, Lj5/q0;->i:J

    .line 20
    .line 21
    iget-wide v10, p0, Lj5/t0;->C:J

    .line 22
    .line 23
    iget-object v1, p0, Lj5/t0;->e:Lah/j;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, -0x1

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-virtual/range {v1 .. v11}, Lah/j;->A(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 31
    .line 32
    .line 33
    if-nez p6, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lj5/t0;->u:[Lj5/b1;

    .line 36
    .line 37
    array-length v0, p1

    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_0
    if-ge v2, v0, :cond_0

    .line 41
    .line 42
    aget-object v3, p1, v2

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Lj5/b1;->D(Z)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget p1, p0, Lj5/t0;->I:I

    .line 51
    .line 52
    if-lez p1, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, Lj5/t0;->s:Lj5/a0;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p0}, Lj5/d1;->c(Lj5/e1;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
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

.method public final t()J
    .locals 11

    .line 1
    invoke-virtual {p0}, Lj5/t0;->j()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lj5/t0;->O:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lj5/t0;->I:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lj5/t0;->z()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lj5/t0;->L:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lj5/t0;->y:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move-wide v7, v4

    .line 38
    const/4 v6, 0x0

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, Lj5/t0;->A:Lb0/w1;

    .line 42
    .line 43
    iget-object v10, v9, Lb0/w1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v10, [Z

    .line 46
    .line 47
    aget-boolean v10, v10, v6

    .line 48
    .line 49
    if-eqz v10, :cond_2

    .line 50
    .line 51
    iget-object v9, v9, Lb0/w1;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, [Z

    .line 54
    .line 55
    aget-boolean v9, v9, v6

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    iget-object v9, p0, Lj5/t0;->u:[Lj5/b1;

    .line 60
    .line 61
    aget-object v9, v9, v6

    .line 62
    .line 63
    monitor-enter v9

    .line 64
    :try_start_0
    iget-boolean v10, v9, Lj5/b1;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    monitor-exit v9

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    iget-object v9, p0, Lj5/t0;->u:[Lj5/b1;

    .line 70
    .line 71
    aget-object v9, v9, v6

    .line 72
    .line 73
    invoke-virtual {v9}, Lj5/b1;->q()J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw v0

    .line 85
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    move-wide v7, v4

    .line 89
    :cond_4
    cmp-long v0, v7, v4

    .line 90
    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Lj5/t0;->y(Z)J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    :cond_5
    cmp-long v0, v7, v1

    .line 98
    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    iget-wide v0, p0, Lj5/t0;->K:J

    .line 102
    .line 103
    return-wide v0

    .line 104
    :cond_6
    return-wide v7

    .line 105
    :cond_7
    :goto_2
    return-wide v1
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
.end method

.method public final u(II)Lr5/h0;
    .locals 1

    .line 1
    new-instance p2, Lj5/s0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, Lj5/s0;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lj5/t0;->D(Lj5/s0;)Lr5/h0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public final v(Ln5/l;JJLjava/io/IOException;I)Lb7/q0;
    .locals 14

    .line 1
    move-object/from16 v11, p6

    .line 2
    .line 3
    check-cast p1, Lj5/q0;

    .line 4
    .line 5
    iget-object v0, p1, Lj5/q0;->b:Ls4/d0;

    .line 6
    .line 7
    new-instance v1, Lj5/u;

    .line 8
    .line 9
    iget-object v0, v0, Ls4/d0;->c:Landroid/net/Uri;

    .line 10
    .line 11
    move-wide/from16 v2, p4

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Lj5/u;-><init>(J)V

    .line 14
    .line 15
    .line 16
    sget v0, Lp4/c0;->a:I

    .line 17
    .line 18
    iget-object v0, p0, Lj5/t0;->d:Lm3/l;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    instance-of v0, v11, Lm4/p0;

    .line 24
    .line 25
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    instance-of v0, v11, Ljava/io/FileNotFoundException;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    instance-of v0, v11, Ls4/v;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    instance-of v0, v11, Ln5/n;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    sget v0, Ls4/j;->b:I

    .line 46
    .line 47
    move-object v0, v11

    .line 48
    :goto_0
    if-eqz v0, :cond_1

    .line 49
    .line 50
    instance-of v5, v0, Ls4/j;

    .line 51
    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    move-object v5, v0

    .line 55
    check-cast v5, Ls4/j;

    .line 56
    .line 57
    iget v5, v5, Ls4/j;->a:I

    .line 58
    .line 59
    const/16 v6, 0x7d8

    .line 60
    .line 61
    if-ne v5, v6, :cond_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    add-int/lit8 v0, p7, -0x1

    .line 70
    .line 71
    mul-int/lit16 v0, v0, 0x3e8

    .line 72
    .line 73
    const/16 v5, 0x1388

    .line 74
    .line 75
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    int-to-long v5, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    :goto_1
    move-wide v5, v2

    .line 82
    :goto_2
    cmp-long v0, v5, v2

    .line 83
    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    sget-object v0, Ln5/o;->f:Lb7/q0;

    .line 87
    .line 88
    :goto_3
    move-object v13, v0

    .line 89
    goto :goto_8

    .line 90
    :cond_3
    invoke-virtual {p0}, Lj5/t0;->x()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v7, p0, Lj5/t0;->N:I

    .line 95
    .line 96
    const/4 v8, 0x0

    .line 97
    if-le v0, v7, :cond_4

    .line 98
    .line 99
    const/4 v7, 0x1

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    const/4 v7, 0x0

    .line 102
    :goto_4
    iget-boolean v9, p0, Lj5/t0;->J:Z

    .line 103
    .line 104
    if-nez v9, :cond_8

    .line 105
    .line 106
    iget-object v9, p0, Lj5/t0;->B:Lr5/b0;

    .line 107
    .line 108
    if-eqz v9, :cond_5

    .line 109
    .line 110
    invoke-interface {v9}, Lr5/b0;->m()J

    .line 111
    .line 112
    .line 113
    move-result-wide v9

    .line 114
    cmp-long v12, v9, v2

    .line 115
    .line 116
    if-eqz v12, :cond_5

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_5
    iget-boolean v0, p0, Lj5/t0;->x:Z

    .line 120
    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {p0}, Lj5/t0;->G()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_6

    .line 128
    .line 129
    iput-boolean v4, p0, Lj5/t0;->M:Z

    .line 130
    .line 131
    sget-object v0, Ln5/o;->e:Lb7/q0;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    iget-boolean v0, p0, Lj5/t0;->x:Z

    .line 135
    .line 136
    iput-boolean v0, p0, Lj5/t0;->G:Z

    .line 137
    .line 138
    const-wide/16 v2, 0x0

    .line 139
    .line 140
    iput-wide v2, p0, Lj5/t0;->K:J

    .line 141
    .line 142
    iput v8, p0, Lj5/t0;->N:I

    .line 143
    .line 144
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 145
    .line 146
    array-length v9, v0

    .line 147
    const/4 v10, 0x0

    .line 148
    :goto_5
    if-ge v10, v9, :cond_7

    .line 149
    .line 150
    aget-object v12, v0, v10

    .line 151
    .line 152
    invoke-virtual {v12, v8}, Lj5/b1;->D(Z)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v10, v10, 0x1

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    iget-object v0, p1, Lj5/q0;->f:Lb0/a;

    .line 159
    .line 160
    iput-wide v2, v0, Lb0/a;->a:J

    .line 161
    .line 162
    iput-wide v2, p1, Lj5/q0;->i:J

    .line 163
    .line 164
    iput-boolean v4, p1, Lj5/q0;->h:Z

    .line 165
    .line 166
    iput-boolean v8, p1, Lj5/q0;->l:Z

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_8
    :goto_6
    iput v0, p0, Lj5/t0;->N:I

    .line 170
    .line 171
    :goto_7
    new-instance v0, Lb7/q0;

    .line 172
    .line 173
    invoke-direct {v0, v7, v8, v5, v6}, Lb7/q0;-><init>(IZJ)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :goto_8
    invoke-virtual {v13}, Lb7/q0;->a()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    xor-int/lit8 v12, v0, 0x1

    .line 182
    .line 183
    iget-wide v7, p1, Lj5/q0;->i:J

    .line 184
    .line 185
    iget-wide v9, p0, Lj5/t0;->C:J

    .line 186
    .line 187
    iget-object v0, p0, Lj5/t0;->e:Lah/j;

    .line 188
    .line 189
    const/4 v2, 0x1

    .line 190
    const/4 v3, -0x1

    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v5, 0x0

    .line 193
    const/4 v6, 0x0

    .line 194
    invoke-virtual/range {v0 .. v12}, Lah/j;->C(Lj5/u;IILm4/q;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 195
    .line 196
    .line 197
    return-object v13
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

.method public final w(J)V
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final x()I
    .locals 6

    .line 1
    iget-object v0, p0, Lj5/t0;->u:[Lj5/b1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    iget v5, v4, Lj5/b1;->q:I

    .line 11
    .line 12
    iget v4, v4, Lj5/b1;->p:I

    .line 13
    .line 14
    add-int/2addr v5, v4

    .line 15
    add-int/2addr v3, v5

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v3
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

.method public final y(Z)J
    .locals 5

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lj5/t0;->u:[Lj5/b1;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lj5/t0;->A:Lb0/w1;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v3, Lb0/w1;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, [Z

    .line 19
    .line 20
    aget-boolean v3, v3, v2

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v3, p0, Lj5/t0;->u:[Lj5/b1;

    .line 25
    .line 26
    aget-object v3, v3, v2

    .line 27
    .line 28
    invoke-virtual {v3}, Lj5/b1;->q()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-wide v0
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

.method public final z()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lj5/t0;->L:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
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
