.class public final Lc5/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ln5/j;
.implements Ln5/m;
.implements Lj5/e1;
.implements Lr5/q;
.implements Lj5/a1;


# static fields
.field public static final Y:Ljava/util/Set;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Z

.field public E:I

.field public F:Lm4/q;

.field public G:Lm4/q;

.field public H:Z

.field public I:Lj5/o1;

.field public J:Ljava/util/Set;

.field public K:[I

.field public L:I

.field public M:Z

.field public N:[Z

.field public O:[Z

.field public P:J

.field public Q:J

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:J

.field public W:Lm4/n;

.field public X:Lc5/j;

.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lb0/c1;

.field public final d:Lc5/i;

.field public final e:Ln5/f;

.field public final f:Lm4/q;

.field public final g:Lb5/t;

.field public final h:Lb5/q;

.field public final i:Lm3/l;

.field public final j:Ln5/o;

.field public final k:Lah/j;

.field public final l:I

.field public final m:Lb7/n;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/List;

.field public final p:Lc5/n;

.field public final q:Lc5/n;

.field public final r:Landroid/os/Handler;

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/Map;

.field public u:Lk5/f;

.field public v:[Lc5/p;

.field public w:[I

.field public final x:Ljava/util/HashSet;

.field public final y:Landroid/util/SparseIntArray;

.field public z:Lc5/o;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x5

    .line 14
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    const/4 v6, 0x3

    .line 19
    new-array v6, v6, [Ljava/lang/Integer;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    aput-object v2, v6, v7

    .line 23
    .line 24
    aput-object v4, v6, v1

    .line 25
    .line 26
    aput-object v5, v6, v3

    .line 27
    .line 28
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lc5/q;->Y:Ljava/util/Set;

    .line 40
    .line 41
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILb0/c1;Lc5/i;Ljava/util/Map;Ln5/f;JLm4/q;Lb5/t;Lb5/q;Lm3/l;Lah/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/q;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lc5/q;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lc5/q;->c:Lb0/c1;

    .line 9
    .line 10
    iput-object p4, p0, Lc5/q;->d:Lc5/i;

    .line 11
    .line 12
    iput-object p5, p0, Lc5/q;->t:Ljava/util/Map;

    .line 13
    .line 14
    iput-object p6, p0, Lc5/q;->e:Ln5/f;

    .line 15
    .line 16
    iput-object p9, p0, Lc5/q;->f:Lm4/q;

    .line 17
    .line 18
    iput-object p10, p0, Lc5/q;->g:Lb5/t;

    .line 19
    .line 20
    iput-object p11, p0, Lc5/q;->h:Lb5/q;

    .line 21
    .line 22
    iput-object p12, p0, Lc5/q;->i:Lm3/l;

    .line 23
    .line 24
    iput-object p13, p0, Lc5/q;->k:Lah/j;

    .line 25
    .line 26
    iput p14, p0, Lc5/q;->l:I

    .line 27
    .line 28
    new-instance p1, Ln5/o;

    .line 29
    .line 30
    const-string p2, "Loader:HlsSampleStreamWrapper"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ln5/o;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lc5/q;->j:Ln5/o;

    .line 36
    .line 37
    new-instance p1, Lb7/n;

    .line 38
    .line 39
    const/4 p2, 0x4

    .line 40
    invoke-direct {p1, p2}, Lb7/n;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    iput-object p2, p1, Lb7/n;->c:Ljava/lang/Object;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    iput-boolean p3, p1, Lb7/n;->b:Z

    .line 48
    .line 49
    iput-object p2, p1, Lb7/n;->d:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p1, p0, Lc5/q;->m:Lb7/n;

    .line 52
    .line 53
    new-array p1, p3, [I

    .line 54
    .line 55
    iput-object p1, p0, Lc5/q;->w:[I

    .line 56
    .line 57
    new-instance p1, Ljava/util/HashSet;

    .line 58
    .line 59
    sget-object p4, Lc5/q;->Y:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 62
    .line 63
    .line 64
    move-result p5

    .line 65
    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lc5/q;->x:Ljava/util/HashSet;

    .line 69
    .line 70
    new-instance p1, Landroid/util/SparseIntArray;

    .line 71
    .line 72
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 73
    .line 74
    .line 75
    move-result p4

    .line 76
    invoke-direct {p1, p4}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lc5/q;->y:Landroid/util/SparseIntArray;

    .line 80
    .line 81
    new-array p1, p3, [Lc5/p;

    .line 82
    .line 83
    iput-object p1, p0, Lc5/q;->v:[Lc5/p;

    .line 84
    .line 85
    new-array p1, p3, [Z

    .line 86
    .line 87
    iput-object p1, p0, Lc5/q;->O:[Z

    .line 88
    .line 89
    new-array p1, p3, [Z

    .line 90
    .line 91
    iput-object p1, p0, Lc5/q;->N:[Z

    .line 92
    .line 93
    new-instance p1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lc5/q;->o:Ljava/util/List;

    .line 105
    .line 106
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lc5/q;->s:Ljava/util/ArrayList;

    .line 112
    .line 113
    new-instance p1, Lc5/n;

    .line 114
    .line 115
    invoke-direct {p1, p0, p3}, Lc5/n;-><init>(Lc5/q;I)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lc5/q;->p:Lc5/n;

    .line 119
    .line 120
    new-instance p1, Lc5/n;

    .line 121
    .line 122
    const/4 p3, 0x1

    .line 123
    invoke-direct {p1, p0, p3}, Lc5/n;-><init>(Lc5/q;I)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Lc5/q;->q:Lc5/n;

    .line 127
    .line 128
    invoke-static {p2}, Lp4/c0;->n(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object p1, p0, Lc5/q;->r:Landroid/os/Handler;

    .line 133
    .line 134
    iput-wide p7, p0, Lc5/q;->P:J

    .line 135
    .line 136
    iput-wide p7, p0, Lc5/q;->Q:J

    .line 137
    .line 138
    return-void
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
.end method

.method public static C(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v1

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
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

.method public static x(II)Lr5/m;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Unmapped track with id "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " of type "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "HlsSampleStreamWrapper"

    .line 24
    .line 25
    invoke-static {p1, p0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lr5/m;

    .line 29
    .line 30
    invoke-direct {p0}, Lr5/m;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p0
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

.method public static z(Lm4/q;Lm4/q;Z)Lm4/q;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Lm4/q;->k:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p1, Lm4/q;->n:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Lm4/o0;->i(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2, v0}, Lp4/c0;->t(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-static {v2, v0}, Lp4/c0;->u(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lm4/o0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v0, v1}, Lm4/o0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-virtual {p1}, Lm4/q;->a()Lm4/p;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v5, p0, Lm4/q;->a:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v5, v3, Lm4/p;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v5, p0, Lm4/q;->b:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v5, v3, Lm4/p;->b:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, p0, Lm4/q;->c:Lya/i0;

    .line 45
    .line 46
    invoke-static {v5}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iput-object v5, v3, Lm4/p;->c:Lya/i0;

    .line 51
    .line 52
    iget-object v5, p0, Lm4/q;->d:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v5, v3, Lm4/p;->d:Ljava/lang/String;

    .line 55
    .line 56
    iget v5, p0, Lm4/q;->e:I

    .line 57
    .line 58
    iput v5, v3, Lm4/p;->e:I

    .line 59
    .line 60
    iget v5, p0, Lm4/q;->f:I

    .line 61
    .line 62
    iput v5, v3, Lm4/p;->f:I

    .line 63
    .line 64
    const/4 v5, -0x1

    .line 65
    if-eqz p2, :cond_2

    .line 66
    .line 67
    iget v6, p0, Lm4/q;->h:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v6, -0x1

    .line 71
    :goto_1
    iput v6, v3, Lm4/p;->h:I

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    iget p2, p0, Lm4/q;->i:I

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    const/4 p2, -0x1

    .line 79
    :goto_2
    iput p2, v3, Lm4/p;->i:I

    .line 80
    .line 81
    iput-object v0, v3, Lm4/p;->j:Ljava/lang/String;

    .line 82
    .line 83
    const/4 p2, 0x2

    .line 84
    if-ne v2, p2, :cond_4

    .line 85
    .line 86
    iget p2, p0, Lm4/q;->u:I

    .line 87
    .line 88
    iput p2, v3, Lm4/p;->t:I

    .line 89
    .line 90
    iget p2, p0, Lm4/q;->v:I

    .line 91
    .line 92
    iput p2, v3, Lm4/p;->u:I

    .line 93
    .line 94
    iget p2, p0, Lm4/q;->w:F

    .line 95
    .line 96
    iput p2, v3, Lm4/p;->v:F

    .line 97
    .line 98
    :cond_4
    if-eqz v1, :cond_5

    .line 99
    .line 100
    invoke-static {v1}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    iput-object p2, v3, Lm4/p;->m:Ljava/lang/String;

    .line 105
    .line 106
    :cond_5
    iget p2, p0, Lm4/q;->D:I

    .line 107
    .line 108
    if-eq p2, v5, :cond_6

    .line 109
    .line 110
    if-ne v2, v4, :cond_6

    .line 111
    .line 112
    iput p2, v3, Lm4/p;->C:I

    .line 113
    .line 114
    :cond_6
    iget-object p0, p0, Lm4/q;->l:Lm4/n0;

    .line 115
    .line 116
    if-eqz p0, :cond_8

    .line 117
    .line 118
    iget-object p1, p1, Lm4/q;->l:Lm4/n0;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Lm4/n0;->b(Lm4/n0;)Lm4/n0;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :cond_7
    iput-object p0, v3, Lm4/p;->k:Lm4/n0;

    .line 127
    .line 128
    :cond_8
    new-instance p0, Lm4/q;

    .line 129
    .line 130
    invoke-direct {p0, v3}, Lm4/q;-><init>(Lm4/p;)V

    .line 131
    .line 132
    .line 133
    return-object p0
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
.end method


# virtual methods
.method public final A(I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc5/q;->j:Ln5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/o;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-object v0, p0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, -0x1

    .line 20
    if-ge p1, v2, :cond_3

    .line 21
    .line 22
    move v2, p1

    .line 23
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-ge v2, v5, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Lc5/j;

    .line 34
    .line 35
    iget-boolean v5, v5, Lc5/j;->n:Z

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lc5/j;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    :goto_2
    iget-object v6, p0, Lc5/q;->v:[Lc5/p;

    .line 51
    .line 52
    array-length v6, v6

    .line 53
    if-ge v5, v6, :cond_4

    .line 54
    .line 55
    invoke-virtual {v2, v5}, Lc5/j;->e(I)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    iget-object v7, p0, Lc5/q;->v:[Lc5/p;

    .line 60
    .line 61
    aget-object v7, v7, v5

    .line 62
    .line 63
    invoke-virtual {v7}, Lj5/b1;->t()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-le v7, v6, :cond_2

    .line 68
    .line 69
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const/4 p1, -0x1

    .line 76
    :cond_4
    if-ne p1, v4, :cond_5

    .line 77
    .line 78
    return-void

    .line 79
    :cond_5
    invoke-virtual {p0}, Lc5/q;->B()Lc5/j;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-wide v8, v2, Lk5/f;->h:J

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lc5/j;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-static {p1, v4, v0}, Lp4/c0;->S(IILjava/util/List;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    :goto_4
    iget-object v4, p0, Lc5/q;->v:[Lc5/p;

    .line 100
    .line 101
    array-length v4, v4

    .line 102
    if-ge p1, v4, :cond_6

    .line 103
    .line 104
    invoke-virtual {v2, p1}, Lc5/j;->e(I)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    iget-object v5, p0, Lc5/q;->v:[Lc5/p;

    .line 109
    .line 110
    aget-object v5, v5, p1

    .line 111
    .line 112
    invoke-virtual {v5, v4}, Lj5/b1;->n(I)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    iget-wide v0, p0, Lc5/q;->P:J

    .line 125
    .line 126
    iput-wide v0, p0, Lc5/q;->Q:J

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_7
    invoke-static {v0}, Lya/q;->k(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lc5/j;

    .line 134
    .line 135
    iput-boolean v1, p1, Lc5/j;->J:Z

    .line 136
    .line 137
    :goto_5
    iput-boolean v3, p0, Lc5/q;->T:Z

    .line 138
    .line 139
    iget v5, p0, Lc5/q;->A:I

    .line 140
    .line 141
    iget-wide v6, v2, Lk5/f;->g:J

    .line 142
    .line 143
    iget-object v4, p0, Lc5/q;->k:Lah/j;

    .line 144
    .line 145
    invoke-virtual/range {v4 .. v9}, Lah/j;->M(IJJ)V

    .line 146
    .line 147
    .line 148
    return-void
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
.end method

.method public final B()Lc5/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lc5/j;

    .line 14
    .line 15
    return-object v0
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

.method public final D()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lc5/q;->Q:J

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

.method public final E()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lc5/q;->H:Z

    .line 4
    .line 5
    if-nez v1, :cond_1a

    .line 6
    .line 7
    iget-object v1, v0, Lc5/q;->K:[I

    .line 8
    .line 9
    if-nez v1, :cond_1a

    .line 10
    .line 11
    iget-boolean v1, v0, Lc5/q;->C:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_12

    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, Lc5/q;->v:[Lc5/p;

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_0
    if-ge v4, v2, :cond_2

    .line 23
    .line 24
    aget-object v5, v1, v4

    .line 25
    .line 26
    invoke-virtual {v5}, Lj5/b1;->w()Lm4/q;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    goto/16 :goto_12

    .line 33
    .line 34
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v1, v0, Lc5/q;->I:Lj5/o1;

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    const/4 v4, -0x1

    .line 41
    if-eqz v1, :cond_a

    .line 42
    .line 43
    iget v1, v1, Lj5/o1;->a:I

    .line 44
    .line 45
    new-array v5, v1, [I

    .line 46
    .line 47
    iput-object v5, v0, Lc5/q;->K:[I

    .line 48
    .line 49
    invoke-static {v5, v4}, Ljava/util/Arrays;->fill([II)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    :goto_1
    if-ge v4, v1, :cond_9

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    :goto_2
    iget-object v6, v0, Lc5/q;->v:[Lc5/p;

    .line 57
    .line 58
    array-length v7, v6

    .line 59
    if-ge v5, v7, :cond_8

    .line 60
    .line 61
    aget-object v6, v6, v5

    .line 62
    .line 63
    invoke-virtual {v6}, Lj5/b1;->w()Lm4/q;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v6}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v7, v0, Lc5/q;->I:Lj5/o1;

    .line 71
    .line 72
    invoke-virtual {v7, v4}, Lj5/o1;->a(I)Lm4/j1;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget-object v7, v7, Lm4/j1;->d:[Lm4/q;

    .line 77
    .line 78
    aget-object v7, v7, v3

    .line 79
    .line 80
    iget-object v8, v6, Lm4/q;->n:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v9, v7, Lm4/q;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v8}, Lm4/o0;->i(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eq v10, v2, :cond_3

    .line 89
    .line 90
    invoke-static {v9}, Lm4/o0;->i(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-ne v10, v6, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    sget v10, Lp4/c0;->a:I

    .line 98
    .line 99
    invoke-static {v8, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-nez v9, :cond_4

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    const-string v9, "application/cea-608"

    .line 107
    .line 108
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-nez v9, :cond_5

    .line 113
    .line 114
    const-string v9, "application/cea-708"

    .line 115
    .line 116
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_6

    .line 121
    .line 122
    :cond_5
    iget v6, v6, Lm4/q;->I:I

    .line 123
    .line 124
    iget v7, v7, Lm4/q;->I:I

    .line 125
    .line 126
    if-ne v6, v7, :cond_7

    .line 127
    .line 128
    :cond_6
    :goto_3
    iget-object v6, v0, Lc5/q;->K:[I

    .line 129
    .line 130
    aput v5, v6, v4

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_9
    iget-object v1, v0, Lc5/q;->s:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_1a

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Lc5/m;

    .line 156
    .line 157
    invoke-virtual {v2}, Lc5/m;->c()V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_a
    iget-object v1, v0, Lc5/q;->v:[Lc5/p;

    .line 162
    .line 163
    array-length v1, v1

    .line 164
    const/4 v5, -0x2

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, -0x2

    .line 167
    const/4 v8, -0x1

    .line 168
    :goto_7
    const/4 v9, 0x1

    .line 169
    const/4 v10, 0x2

    .line 170
    if-ge v6, v1, :cond_10

    .line 171
    .line 172
    iget-object v11, v0, Lc5/q;->v:[Lc5/p;

    .line 173
    .line 174
    aget-object v11, v11, v6

    .line 175
    .line 176
    invoke-virtual {v11}, Lj5/b1;->w()Lm4/q;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-static {v11}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object v11, v11, Lm4/q;->n:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v11}, Lm4/o0;->o(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    if-eqz v12, :cond_b

    .line 190
    .line 191
    const/4 v9, 0x2

    .line 192
    goto :goto_8

    .line 193
    :cond_b
    invoke-static {v11}, Lm4/o0;->k(Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-eqz v10, :cond_c

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_c
    invoke-static {v11}, Lm4/o0;->n(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_d

    .line 205
    .line 206
    const/4 v9, 0x3

    .line 207
    goto :goto_8

    .line 208
    :cond_d
    const/4 v9, -0x2

    .line 209
    :goto_8
    invoke-static {v9}, Lc5/q;->C(I)I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-static {v7}, Lc5/q;->C(I)I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-le v10, v11, :cond_e

    .line 218
    .line 219
    move v8, v6

    .line 220
    move v7, v9

    .line 221
    goto :goto_9

    .line 222
    :cond_e
    if-ne v9, v7, :cond_f

    .line 223
    .line 224
    if-eq v8, v4, :cond_f

    .line 225
    .line 226
    const/4 v8, -0x1

    .line 227
    :cond_f
    :goto_9
    add-int/lit8 v6, v6, 0x1

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_10
    iget-object v2, v0, Lc5/q;->d:Lc5/i;

    .line 231
    .line 232
    iget-object v2, v2, Lc5/i;->h:Lm4/j1;

    .line 233
    .line 234
    iget v5, v2, Lm4/j1;->a:I

    .line 235
    .line 236
    iput v4, v0, Lc5/q;->L:I

    .line 237
    .line 238
    new-array v4, v1, [I

    .line 239
    .line 240
    iput-object v4, v0, Lc5/q;->K:[I

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    :goto_a
    if-ge v4, v1, :cond_11

    .line 244
    .line 245
    iget-object v6, v0, Lc5/q;->K:[I

    .line 246
    .line 247
    aput v4, v6, v4

    .line 248
    .line 249
    add-int/lit8 v4, v4, 0x1

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :cond_11
    new-array v4, v1, [Lm4/j1;

    .line 253
    .line 254
    const/4 v6, 0x0

    .line 255
    :goto_b
    if-ge v6, v1, :cond_18

    .line 256
    .line 257
    iget-object v11, v0, Lc5/q;->v:[Lc5/p;

    .line 258
    .line 259
    aget-object v11, v11, v6

    .line 260
    .line 261
    invoke-virtual {v11}, Lj5/b1;->w()Lm4/q;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-static {v11}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    iget-object v12, v0, Lc5/q;->a:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v13, v0, Lc5/q;->f:Lm4/q;

    .line 271
    .line 272
    if-ne v6, v8, :cond_15

    .line 273
    .line 274
    new-array v14, v5, [Lm4/q;

    .line 275
    .line 276
    const/4 v15, 0x0

    .line 277
    :goto_c
    if-ge v15, v5, :cond_14

    .line 278
    .line 279
    iget-object v3, v2, Lm4/j1;->d:[Lm4/q;

    .line 280
    .line 281
    aget-object v3, v3, v15

    .line 282
    .line 283
    if-ne v7, v9, :cond_12

    .line 284
    .line 285
    if-eqz v13, :cond_12

    .line 286
    .line 287
    invoke-virtual {v3, v13}, Lm4/q;->d(Lm4/q;)Lm4/q;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    :cond_12
    if-ne v5, v9, :cond_13

    .line 292
    .line 293
    invoke-virtual {v11, v3}, Lm4/q;->d(Lm4/q;)Lm4/q;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    goto :goto_d

    .line 298
    :cond_13
    invoke-static {v3, v11, v9}, Lc5/q;->z(Lm4/q;Lm4/q;Z)Lm4/q;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :goto_d
    aput-object v3, v14, v15

    .line 303
    .line 304
    add-int/lit8 v15, v15, 0x1

    .line 305
    .line 306
    const/4 v3, 0x0

    .line 307
    goto :goto_c

    .line 308
    :cond_14
    new-instance v3, Lm4/j1;

    .line 309
    .line 310
    invoke-direct {v3, v12, v14}, Lm4/j1;-><init>(Ljava/lang/String;[Lm4/q;)V

    .line 311
    .line 312
    .line 313
    aput-object v3, v4, v6

    .line 314
    .line 315
    iput v6, v0, Lc5/q;->L:I

    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    goto :goto_10

    .line 319
    :cond_15
    if-ne v7, v10, :cond_16

    .line 320
    .line 321
    iget-object v3, v11, Lm4/q;->n:Ljava/lang/String;

    .line 322
    .line 323
    invoke-static {v3}, Lm4/o0;->k(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_16

    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_16
    const/4 v13, 0x0

    .line 331
    :goto_e
    new-instance v3, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v12, ":muxed:"

    .line 340
    .line 341
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    if-ge v6, v8, :cond_17

    .line 345
    .line 346
    move v12, v6

    .line 347
    goto :goto_f

    .line 348
    :cond_17
    add-int/lit8 v12, v6, -0x1

    .line 349
    .line 350
    :goto_f
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    new-instance v12, Lm4/j1;

    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    invoke-static {v13, v11, v14}, Lc5/q;->z(Lm4/q;Lm4/q;Z)Lm4/q;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    new-array v13, v9, [Lm4/q;

    .line 365
    .line 366
    aput-object v11, v13, v14

    .line 367
    .line 368
    invoke-direct {v12, v3, v13}, Lm4/j1;-><init>(Ljava/lang/String;[Lm4/q;)V

    .line 369
    .line 370
    .line 371
    aput-object v12, v4, v6

    .line 372
    .line 373
    :goto_10
    add-int/lit8 v6, v6, 0x1

    .line 374
    .line 375
    const/4 v3, 0x0

    .line 376
    goto :goto_b

    .line 377
    :cond_18
    const/4 v14, 0x0

    .line 378
    invoke-virtual {v0, v4}, Lc5/q;->y([Lm4/j1;)Lj5/o1;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    iput-object v1, v0, Lc5/q;->I:Lj5/o1;

    .line 383
    .line 384
    iget-object v1, v0, Lc5/q;->J:Ljava/util/Set;

    .line 385
    .line 386
    if-nez v1, :cond_19

    .line 387
    .line 388
    const/4 v3, 0x1

    .line 389
    goto :goto_11

    .line 390
    :cond_19
    const/4 v3, 0x0

    .line 391
    :goto_11
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 392
    .line 393
    .line 394
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 395
    .line 396
    iput-object v1, v0, Lc5/q;->J:Ljava/util/Set;

    .line 397
    .line 398
    iput-boolean v9, v0, Lc5/q;->D:Z

    .line 399
    .line 400
    iget-object v1, v0, Lc5/q;->c:Lb0/c1;

    .line 401
    .line 402
    invoke-virtual {v1}, Lb0/c1;->r()V

    .line 403
    .line 404
    .line 405
    :cond_1a
    :goto_12
    return-void
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final F()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc5/q;->j:Ln5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/o;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/q;->d:Lc5/i;

    .line 7
    .line 8
    iget-object v1, v0, Lc5/i;->n:Lj5/b;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, v0, Lc5/i;->o:Landroid/net/Uri;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-boolean v2, v0, Lc5/i;->s:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Lc5/i;->g:Le5/c;

    .line 21
    .line 22
    iget-object v0, v0, Le5/c;->d:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Le5/b;

    .line 29
    .line 30
    iget-object v1, v0, Le5/b;->b:Ln5/o;

    .line 31
    .line 32
    invoke-virtual {v1}, Ln5/o;->b()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Le5/b;->j:Ljava/io/IOException;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    throw v0

    .line 41
    :cond_1
    :goto_0
    return-void

    .line 42
    :cond_2
    throw v1
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

.method public final varargs G([Lm4/j1;[I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lc5/q;->y([Lm4/j1;)Lj5/o1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lc5/q;->I:Lj5/o1;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lc5/q;->J:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p2

    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, p1, :cond_0

    .line 18
    .line 19
    aget v2, p2, v1

    .line 20
    .line 21
    iget-object v3, p0, Lc5/q;->J:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v4, p0, Lc5/q;->I:Lj5/o1;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Lj5/o1;->a(I)Lm4/j1;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v0, p0, Lc5/q;->L:I

    .line 36
    .line 37
    new-instance p1, La9/m;

    .line 38
    .line 39
    const/16 p2, 0xa

    .line 40
    .line 41
    iget-object v0, p0, Lc5/q;->c:Lb0/c1;

    .line 42
    .line 43
    invoke-direct {p1, p2, v0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lc5/q;->r:Landroid/os/Handler;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Lc5/q;->D:Z

    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final H()V
    .locals 6

    .line 1
    iget-object v0, p0, Lc5/q;->v:[Lc5/p;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, Lc5/q;->R:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Lj5/b1;->D(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, Lc5/q;->R:Z

    .line 19
    .line 20
    return-void
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

.method public final I(JZ)Z
    .locals 9

    .line 1
    iput-wide p1, p0, Lc5/q;->P:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lc5/q;->D()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, Lc5/q;->Q:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lc5/q;->d:Lc5/i;

    .line 14
    .line 15
    iget-boolean v0, v0, Lc5/i;->p:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iget-object v3, p0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ge v0, v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lc5/j;

    .line 35
    .line 36
    iget-wide v6, v5, Lk5/f;->g:J

    .line 37
    .line 38
    cmp-long v8, v6, p1

    .line 39
    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v5, v2

    .line 47
    :goto_1
    iget-boolean v0, p0, Lc5/q;->C:Z

    .line 48
    .line 49
    if-eqz v0, :cond_7

    .line 50
    .line 51
    if-nez p3, :cond_7

    .line 52
    .line 53
    iget-object p3, p0, Lc5/q;->v:[Lc5/p;

    .line 54
    .line 55
    array-length p3, p3

    .line 56
    const/4 v0, 0x0

    .line 57
    :goto_2
    if-ge v0, p3, :cond_6

    .line 58
    .line 59
    iget-object v6, p0, Lc5/q;->v:[Lc5/p;

    .line 60
    .line 61
    aget-object v6, v6, v0

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Lc5/j;->e(I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v6, v7}, Lj5/b1;->F(I)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-virtual {v6, p1, p2, v4}, Lj5/b1;->G(JZ)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    :goto_3
    if-nez v6, :cond_5

    .line 79
    .line 80
    iget-object v6, p0, Lc5/q;->O:[Z

    .line 81
    .line 82
    aget-boolean v6, v6, v0

    .line 83
    .line 84
    if-nez v6, :cond_4

    .line 85
    .line 86
    iget-boolean v6, p0, Lc5/q;->M:Z

    .line 87
    .line 88
    if-nez v6, :cond_5

    .line 89
    .line 90
    :cond_4
    const/4 p3, 0x0

    .line 91
    goto :goto_4

    .line 92
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    const/4 p3, 0x1

    .line 96
    :goto_4
    if-eqz p3, :cond_7

    .line 97
    .line 98
    return v4

    .line 99
    :cond_7
    iput-wide p1, p0, Lc5/q;->Q:J

    .line 100
    .line 101
    iput-boolean v4, p0, Lc5/q;->T:Z

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lc5/q;->j:Ln5/o;

    .line 107
    .line 108
    invoke-virtual {p1}, Ln5/o;->d()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_9

    .line 113
    .line 114
    iget-boolean p2, p0, Lc5/q;->C:Z

    .line 115
    .line 116
    if-eqz p2, :cond_8

    .line 117
    .line 118
    iget-object p2, p0, Lc5/q;->v:[Lc5/p;

    .line 119
    .line 120
    array-length p3, p2

    .line 121
    :goto_5
    if-ge v4, p3, :cond_8

    .line 122
    .line 123
    aget-object v0, p2, v4

    .line 124
    .line 125
    invoke-virtual {v0}, Lj5/b1;->k()V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    invoke-virtual {p1}, Ln5/o;->a()V

    .line 132
    .line 133
    .line 134
    return v1

    .line 135
    :cond_9
    iput-object v2, p1, Ln5/o;->c:Ljava/io/IOException;

    .line 136
    .line 137
    invoke-virtual {p0}, Lc5/q;->H()V

    .line 138
    .line 139
    .line 140
    return v1
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
.end method

.method public final a(Lr5/b0;)V
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

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/q;->r:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lc5/q;->p:Lc5/n;

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
    .locals 6

    .line 1
    iget-object v0, p0, Lc5/q;->v:[Lc5/p;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-virtual {v3, v4}, Lj5/b1;->D(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v4, v3, Lj5/b1;->h:Lb5/l;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    iget-object v5, v3, Lj5/b1;->e:Lb5/q;

    .line 18
    .line 19
    invoke-interface {v4, v5}, Lb5/l;->c(Lb5/q;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    iput-object v4, v3, Lj5/b1;->h:Lb5/l;

    .line 24
    .line 25
    iput-object v4, v3, Lj5/b1;->g:Lm4/q;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
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
.end method

.method public final d()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc5/q;->D()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lc5/q;->Q:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Lc5/q;->T:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    invoke-virtual {p0}, Lc5/q;->B()Lc5/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, Lk5/f;->h:J

    .line 22
    .line 23
    return-wide v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final e(Lv4/f0;)Z
    .locals 70

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lc5/q;->T:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lc5/q;->j:Ln5/o;

    .line 9
    .line 10
    invoke-virtual {v1}, Ln5/o;->d()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ln5/o;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    :cond_0
    const/16 v23, 0x0

    .line 23
    .line 24
    goto/16 :goto_35

    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0}, Lc5/q;->D()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iget-wide v4, v0, Lc5/q;->Q:J

    .line 35
    .line 36
    iget-object v6, v0, Lc5/q;->v:[Lc5/p;

    .line 37
    .line 38
    array-length v7, v6

    .line 39
    const/4 v8, 0x0

    .line 40
    :goto_0
    if-ge v8, v7, :cond_2

    .line 41
    .line 42
    aget-object v9, v6, v8

    .line 43
    .line 44
    iget-wide v10, v0, Lc5/q;->Q:J

    .line 45
    .line 46
    iput-wide v10, v9, Lj5/b1;->t:J

    .line 47
    .line 48
    add-int/lit8 v8, v8, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    move-object v13, v3

    .line 52
    goto :goto_4

    .line 53
    :cond_3
    invoke-virtual {v0}, Lc5/q;->B()Lc5/j;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-boolean v4, v3, Lc5/j;->H:Z

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    iget-wide v3, v3, Lk5/f;->h:J

    .line 62
    .line 63
    :goto_2
    move-wide v4, v3

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    iget-wide v4, v0, Lc5/q;->P:J

    .line 66
    .line 67
    iget-wide v6, v3, Lk5/f;->g:J

    .line 68
    .line 69
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    iget-object v3, v0, Lc5/q;->o:Ljava/util/List;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_4
    iget-object v15, v0, Lc5/q;->m:Lb7/n;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    iput-object v3, v15, Lb7/n;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput-boolean v2, v15, Lb7/n;->b:Z

    .line 83
    .line 84
    iput-object v3, v15, Lb7/n;->d:Ljava/lang/Object;

    .line 85
    .line 86
    iget-boolean v6, v0, Lc5/q;->D:Z

    .line 87
    .line 88
    if-nez v6, :cond_6

    .line 89
    .line 90
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_5

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_5
    const/16 v16, 0x0

    .line 98
    .line 99
    :goto_5
    move-object/from16 v17, v3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_6
    :goto_6
    const/16 v16, 0x1

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :goto_7
    iget-object v3, v0, Lc5/q;->d:Lc5/i;

    .line 106
    .line 107
    iget-object v6, v3, Lc5/i;->j:Lb0/c1;

    .line 108
    .line 109
    iget-object v8, v3, Lc5/i;->e:[Landroid/net/Uri;

    .line 110
    .line 111
    iget-object v9, v3, Lc5/i;->g:Le5/c;

    .line 112
    .line 113
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_7

    .line 118
    .line 119
    move-object/from16 v10, v17

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_7
    invoke-static {v13}, Lya/q;->k(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    check-cast v10, Lc5/j;

    .line 127
    .line 128
    :goto_8
    if-nez v10, :cond_8

    .line 129
    .line 130
    const/4 v12, -0x1

    .line 131
    :goto_9
    move-object/from16 v14, p1

    .line 132
    .line 133
    move-object/from16 v19, v8

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_8
    iget-object v12, v3, Lc5/i;->h:Lm4/j1;

    .line 137
    .line 138
    iget-object v14, v10, Lk5/f;->d:Lm4/q;

    .line 139
    .line 140
    invoke-virtual {v12, v14}, Lm4/j1;->b(Lm4/q;)I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    goto :goto_9

    .line 145
    :goto_a
    iget-wide v7, v14, Lv4/f0;->a:J

    .line 146
    .line 147
    sub-long v20, v4, v7

    .line 148
    .line 149
    move/from16 v22, v12

    .line 150
    .line 151
    iget-wide v11, v3, Lc5/i;->r:J

    .line 152
    .line 153
    move-object/from16 v24, v3

    .line 154
    .line 155
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    cmp-long v25, v11, v2

    .line 161
    .line 162
    if-eqz v25, :cond_9

    .line 163
    .line 164
    sub-long/2addr v11, v7

    .line 165
    goto :goto_b

    .line 166
    :cond_9
    move-wide v11, v2

    .line 167
    :goto_b
    move-wide/from16 v25, v2

    .line 168
    .line 169
    move-object/from16 v2, v24

    .line 170
    .line 171
    if-eqz v10, :cond_a

    .line 172
    .line 173
    iget-boolean v3, v2, Lc5/i;->p:Z

    .line 174
    .line 175
    if-nez v3, :cond_a

    .line 176
    .line 177
    move-object/from16 v24, v15

    .line 178
    .line 179
    iget-wide v14, v10, Lk5/f;->h:J

    .line 180
    .line 181
    move-object v3, v6

    .line 182
    move-wide/from16 v27, v7

    .line 183
    .line 184
    iget-wide v6, v10, Lk5/f;->g:J

    .line 185
    .line 186
    sub-long/2addr v14, v6

    .line 187
    sub-long v6, v20, v14

    .line 188
    .line 189
    move-object/from16 v29, v9

    .line 190
    .line 191
    const-wide/16 v8, 0x0

    .line 192
    .line 193
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v20

    .line 197
    cmp-long v6, v11, v25

    .line 198
    .line 199
    if-eqz v6, :cond_b

    .line 200
    .line 201
    sub-long/2addr v11, v14

    .line 202
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    goto :goto_c

    .line 207
    :cond_a
    move-object v3, v6

    .line 208
    move-wide/from16 v27, v7

    .line 209
    .line 210
    move-object/from16 v29, v9

    .line 211
    .line 212
    move-object/from16 v24, v15

    .line 213
    .line 214
    :cond_b
    :goto_c
    invoke-virtual {v2, v10, v4, v5}, Lc5/i;->a(Lc5/j;J)[Lk5/m;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    iget-object v6, v2, Lc5/i;->q:Lm5/r;

    .line 219
    .line 220
    move-wide v7, v4

    .line 221
    move-object v4, v10

    .line 222
    move-wide/from16 v9, v20

    .line 223
    .line 224
    move-wide/from16 v20, v7

    .line 225
    .line 226
    move-object/from16 p1, v3

    .line 227
    .line 228
    move/from16 v3, v22

    .line 229
    .line 230
    move-wide/from16 v7, v27

    .line 231
    .line 232
    move-object/from16 v15, v29

    .line 233
    .line 234
    const/4 v5, -0x1

    .line 235
    invoke-interface/range {v6 .. v14}, Lm5/r;->f(JJJLjava/util/List;[Lk5/m;)V

    .line 236
    .line 237
    .line 238
    iget-object v6, v2, Lc5/i;->q:Lm5/r;

    .line 239
    .line 240
    invoke-interface {v6}, Lm5/r;->l()I

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    if-eq v3, v12, :cond_c

    .line 245
    .line 246
    const/4 v7, 0x1

    .line 247
    goto :goto_d

    .line 248
    :cond_c
    const/4 v7, 0x0

    .line 249
    :goto_d
    aget-object v11, v19, v12

    .line 250
    .line 251
    invoke-virtual {v15, v11}, Le5/c;->c(Landroid/net/Uri;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-nez v6, :cond_d

    .line 256
    .line 257
    move-object/from16 v13, v24

    .line 258
    .line 259
    iput-object v11, v13, Lb7/n;->d:Ljava/lang/Object;

    .line 260
    .line 261
    iget-boolean v3, v2, Lc5/i;->s:Z

    .line 262
    .line 263
    iget-object v4, v2, Lc5/i;->o:Landroid/net/Uri;

    .line 264
    .line 265
    invoke-virtual {v11, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    and-int/2addr v3, v4

    .line 270
    iput-boolean v3, v2, Lc5/i;->s:Z

    .line 271
    .line 272
    iput-object v11, v2, Lc5/i;->o:Landroid/net/Uri;

    .line 273
    .line 274
    :goto_e
    move-object v15, v1

    .line 275
    goto/16 :goto_32

    .line 276
    .line 277
    :cond_d
    move-object/from16 v13, v24

    .line 278
    .line 279
    const/4 v6, 0x1

    .line 280
    invoke-virtual {v15, v6, v11}, Le5/c;->a(ZLandroid/net/Uri;)Le5/k;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-wide v9, v8, Le5/k;->h:J

    .line 288
    .line 289
    iget-boolean v6, v8, Le5/o;->c:Z

    .line 290
    .line 291
    iput-boolean v6, v2, Lc5/i;->p:Z

    .line 292
    .line 293
    iget-boolean v6, v8, Le5/k;->o:Z

    .line 294
    .line 295
    if-eqz v6, :cond_e

    .line 296
    .line 297
    move/from16 v22, v3

    .line 298
    .line 299
    move-object/from16 v24, v4

    .line 300
    .line 301
    move-wide/from16 v5, v25

    .line 302
    .line 303
    goto :goto_f

    .line 304
    :cond_e
    iget-wide v5, v8, Le5/k;->u:J

    .line 305
    .line 306
    add-long/2addr v5, v9

    .line 307
    move/from16 v22, v3

    .line 308
    .line 309
    move-object/from16 v24, v4

    .line 310
    .line 311
    iget-wide v3, v15, Le5/c;->n:J

    .line 312
    .line 313
    sub-long/2addr v5, v3

    .line 314
    :goto_f
    iput-wide v5, v2, Lc5/i;->r:J

    .line 315
    .line 316
    iget-wide v3, v15, Le5/c;->n:J

    .line 317
    .line 318
    sub-long/2addr v9, v3

    .line 319
    move-object v3, v2

    .line 320
    move v5, v7

    .line 321
    move-object v6, v8

    .line 322
    move-wide v7, v9

    .line 323
    move-wide/from16 v9, v20

    .line 324
    .line 325
    move/from16 v14, v22

    .line 326
    .line 327
    move-object/from16 v4, v24

    .line 328
    .line 329
    const/4 v2, -0x1

    .line 330
    move-object/from16 v20, v11

    .line 331
    .line 332
    move/from16 v21, v12

    .line 333
    .line 334
    invoke-virtual/range {v3 .. v10}, Lc5/i;->c(Lc5/j;ZLe5/k;JJ)Landroid/util/Pair;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v12, Ljava/lang/Long;

    .line 341
    .line 342
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 343
    .line 344
    .line 345
    move-result-wide v27

    .line 346
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v11, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v11

    .line 354
    move-object/from16 v24, v3

    .line 355
    .line 356
    iget-wide v2, v6, Le5/k;->k:J

    .line 357
    .line 358
    cmp-long v22, v27, v2

    .line 359
    .line 360
    if-gez v22, :cond_f

    .line 361
    .line 362
    if-eqz v4, :cond_f

    .line 363
    .line 364
    if-eqz v5, :cond_f

    .line 365
    .line 366
    aget-object v11, v19, v14

    .line 367
    .line 368
    const/4 v6, 0x1

    .line 369
    invoke-virtual {v15, v6, v11}, Le5/c;->a(ZLandroid/net/Uri;)Le5/k;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    iget-wide v5, v2, Le5/k;->h:J

    .line 377
    .line 378
    iget-wide v7, v15, Le5/c;->n:J

    .line 379
    .line 380
    sub-long v7, v5, v7

    .line 381
    .line 382
    const/4 v5, 0x0

    .line 383
    move-object v6, v2

    .line 384
    move-object/from16 v3, v24

    .line 385
    .line 386
    invoke-virtual/range {v3 .. v10}, Lc5/i;->c(Lc5/j;ZLe5/k;JJ)Landroid/util/Pair;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    iget-object v5, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v5, Ljava/lang/Long;

    .line 393
    .line 394
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 395
    .line 396
    .line 397
    move-result-wide v27

    .line 398
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v2, Ljava/lang/Integer;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    move v5, v2

    .line 407
    move v2, v14

    .line 408
    :goto_10
    move-wide v9, v7

    .line 409
    move-object v8, v6

    .line 410
    move-wide/from16 v6, v27

    .line 411
    .line 412
    goto :goto_11

    .line 413
    :cond_f
    move-object/from16 v3, v24

    .line 414
    .line 415
    move v5, v11

    .line 416
    move-object/from16 v11, v20

    .line 417
    .line 418
    move/from16 v2, v21

    .line 419
    .line 420
    goto :goto_10

    .line 421
    :goto_11
    iget-object v12, v8, Le5/k;->r:Lya/i0;

    .line 422
    .line 423
    move-wide/from16 v21, v9

    .line 424
    .line 425
    iget-wide v9, v8, Le5/k;->k:J

    .line 426
    .line 427
    move-wide/from16 v27, v9

    .line 428
    .line 429
    iget-object v9, v8, Le5/o;->a:Ljava/lang/String;

    .line 430
    .line 431
    iget-boolean v10, v8, Le5/o;->c:Z

    .line 432
    .line 433
    move/from16 v24, v10

    .line 434
    .line 435
    if-eq v2, v14, :cond_10

    .line 436
    .line 437
    const/4 v10, -0x1

    .line 438
    if-eq v14, v10, :cond_10

    .line 439
    .line 440
    aget-object v10, v19, v14

    .line 441
    .line 442
    iget-object v14, v15, Le5/c;->d:Ljava/util/HashMap;

    .line 443
    .line 444
    invoke-virtual {v14, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    check-cast v10, Le5/b;

    .line 449
    .line 450
    if-eqz v10, :cond_10

    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    iput-boolean v14, v10, Le5/b;->k:Z

    .line 454
    .line 455
    :cond_10
    cmp-long v10, v6, v27

    .line 456
    .line 457
    if-gez v10, :cond_11

    .line 458
    .line 459
    new-instance v2, Lj5/b;

    .line 460
    .line 461
    invoke-direct {v2}, Ljava/io/IOException;-><init>()V

    .line 462
    .line 463
    .line 464
    iput-object v2, v3, Lc5/i;->n:Lj5/b;

    .line 465
    .line 466
    goto/16 :goto_e

    .line 467
    .line 468
    :cond_11
    iget-object v10, v8, Le5/k;->s:Lya/i0;

    .line 469
    .line 470
    sub-long v14, v6, v27

    .line 471
    .line 472
    long-to-int v15, v14

    .line 473
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    const-wide/16 v29, 0x1

    .line 478
    .line 479
    if-ne v15, v14, :cond_13

    .line 480
    .line 481
    const/4 v14, -0x1

    .line 482
    if-eq v5, v14, :cond_12

    .line 483
    .line 484
    goto :goto_12

    .line 485
    :cond_12
    const/4 v5, 0x0

    .line 486
    :goto_12
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 487
    .line 488
    .line 489
    move-result v15

    .line 490
    if-ge v5, v15, :cond_17

    .line 491
    .line 492
    new-instance v15, Lc5/h;

    .line 493
    .line 494
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v10

    .line 498
    check-cast v10, Le5/i;

    .line 499
    .line 500
    invoke-direct {v15, v10, v6, v7, v5}, Lc5/h;-><init>(Le5/i;JI)V

    .line 501
    .line 502
    .line 503
    move-object v5, v15

    .line 504
    goto :goto_13

    .line 505
    :cond_13
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v19

    .line 509
    move-object/from16 v14, v19

    .line 510
    .line 511
    check-cast v14, Le5/h;

    .line 512
    .line 513
    move/from16 v19, v15

    .line 514
    .line 515
    const/4 v15, -0x1

    .line 516
    if-ne v5, v15, :cond_14

    .line 517
    .line 518
    new-instance v5, Lc5/h;

    .line 519
    .line 520
    invoke-direct {v5, v14, v6, v7, v15}, Lc5/h;-><init>(Le5/i;JI)V

    .line 521
    .line 522
    .line 523
    goto :goto_13

    .line 524
    :cond_14
    iget-object v15, v14, Le5/h;->m:Lya/i0;

    .line 525
    .line 526
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 527
    .line 528
    .line 529
    move-result v15

    .line 530
    if-ge v5, v15, :cond_15

    .line 531
    .line 532
    new-instance v10, Lc5/h;

    .line 533
    .line 534
    iget-object v14, v14, Le5/h;->m:Lya/i0;

    .line 535
    .line 536
    invoke-interface {v14, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v14

    .line 540
    check-cast v14, Le5/i;

    .line 541
    .line 542
    invoke-direct {v10, v14, v6, v7, v5}, Lc5/h;-><init>(Le5/i;JI)V

    .line 543
    .line 544
    .line 545
    move-object v5, v10

    .line 546
    goto :goto_13

    .line 547
    :cond_15
    const/16 v18, 0x1

    .line 548
    .line 549
    add-int/lit8 v15, v19, 0x1

    .line 550
    .line 551
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    if-ge v15, v5, :cond_16

    .line 556
    .line 557
    new-instance v5, Lc5/h;

    .line 558
    .line 559
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v10

    .line 563
    check-cast v10, Le5/i;

    .line 564
    .line 565
    add-long v6, v6, v29

    .line 566
    .line 567
    const/4 v14, -0x1

    .line 568
    invoke-direct {v5, v10, v6, v7, v14}, Lc5/h;-><init>(Le5/i;JI)V

    .line 569
    .line 570
    .line 571
    goto :goto_13

    .line 572
    :cond_16
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    if-nez v5, :cond_17

    .line 577
    .line 578
    new-instance v5, Lc5/h;

    .line 579
    .line 580
    const/4 v15, 0x0

    .line 581
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v10

    .line 585
    check-cast v10, Le5/i;

    .line 586
    .line 587
    add-long v6, v6, v29

    .line 588
    .line 589
    invoke-direct {v5, v10, v6, v7, v15}, Lc5/h;-><init>(Le5/i;JI)V

    .line 590
    .line 591
    .line 592
    goto :goto_13

    .line 593
    :cond_17
    const/4 v5, 0x0

    .line 594
    :goto_13
    if-nez v5, :cond_1b

    .line 595
    .line 596
    iget-boolean v5, v8, Le5/k;->o:Z

    .line 597
    .line 598
    if-nez v5, :cond_18

    .line 599
    .line 600
    iput-object v11, v13, Lb7/n;->d:Ljava/lang/Object;

    .line 601
    .line 602
    iget-boolean v2, v3, Lc5/i;->s:Z

    .line 603
    .line 604
    iget-object v4, v3, Lc5/i;->o:Landroid/net/Uri;

    .line 605
    .line 606
    invoke-virtual {v11, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    and-int/2addr v2, v4

    .line 611
    iput-boolean v2, v3, Lc5/i;->s:Z

    .line 612
    .line 613
    iput-object v11, v3, Lc5/i;->o:Landroid/net/Uri;

    .line 614
    .line 615
    goto/16 :goto_e

    .line 616
    .line 617
    :cond_18
    if-nez v16, :cond_19

    .line 618
    .line 619
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    if-eqz v5, :cond_1a

    .line 624
    .line 625
    :cond_19
    const/4 v6, 0x1

    .line 626
    goto :goto_14

    .line 627
    :cond_1a
    new-instance v5, Lc5/h;

    .line 628
    .line 629
    invoke-static {v12}, Lya/q;->k(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    check-cast v6, Le5/i;

    .line 634
    .line 635
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    int-to-long v14, v7

    .line 640
    add-long v14, v27, v14

    .line 641
    .line 642
    sub-long v14, v14, v29

    .line 643
    .line 644
    const/4 v12, -0x1

    .line 645
    invoke-direct {v5, v6, v14, v15, v12}, Lc5/h;-><init>(Le5/i;JI)V

    .line 646
    .line 647
    .line 648
    goto :goto_15

    .line 649
    :goto_14
    iput-boolean v6, v13, Lb7/n;->b:Z

    .line 650
    .line 651
    goto/16 :goto_e

    .line 652
    .line 653
    :cond_1b
    :goto_15
    iget-boolean v6, v5, Lc5/h;->d:Z

    .line 654
    .line 655
    iget-object v7, v5, Lc5/h;->a:Le5/i;

    .line 656
    .line 657
    const/4 v14, 0x0

    .line 658
    iput-boolean v14, v3, Lc5/i;->s:Z

    .line 659
    .line 660
    const/4 v10, 0x0

    .line 661
    iput-object v10, v3, Lc5/i;->o:Landroid/net/Uri;

    .line 662
    .line 663
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 664
    .line 665
    .line 666
    iget-object v10, v7, Le5/i;->b:Le5/h;

    .line 667
    .line 668
    iget-wide v14, v7, Le5/i;->e:J

    .line 669
    .line 670
    if-eqz v10, :cond_1d

    .line 671
    .line 672
    iget-object v10, v10, Le5/i;->g:Ljava/lang/String;

    .line 673
    .line 674
    if-nez v10, :cond_1c

    .line 675
    .line 676
    goto :goto_17

    .line 677
    :cond_1c
    invoke-static {v9, v10}, Lp4/c;->y(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 678
    .line 679
    .line 680
    move-result-object v10

    .line 681
    :goto_16
    move/from16 v16, v6

    .line 682
    .line 683
    const/4 v12, 0x1

    .line 684
    goto :goto_18

    .line 685
    :cond_1d
    :goto_17
    const/4 v10, 0x0

    .line 686
    goto :goto_16

    .line 687
    :goto_18
    invoke-virtual {v3, v10, v2, v12}, Lc5/i;->d(Landroid/net/Uri;IZ)Lc5/e;

    .line 688
    .line 689
    .line 690
    move-result-object v6

    .line 691
    iput-object v6, v13, Lb7/n;->c:Ljava/lang/Object;

    .line 692
    .line 693
    if-eqz v6, :cond_1e

    .line 694
    .line 695
    goto :goto_1f

    .line 696
    :cond_1e
    iget-object v6, v7, Le5/i;->g:Ljava/lang/String;

    .line 697
    .line 698
    if-nez v6, :cond_1f

    .line 699
    .line 700
    const/4 v6, 0x0

    .line 701
    :goto_19
    move-wide/from16 v19, v14

    .line 702
    .line 703
    const/4 v12, 0x0

    .line 704
    goto :goto_1a

    .line 705
    :cond_1f
    invoke-static {v9, v6}, Lp4/c;->y(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    goto :goto_19

    .line 710
    :goto_1a
    invoke-virtual {v3, v6, v2, v12}, Lc5/i;->d(Landroid/net/Uri;IZ)Lc5/e;

    .line 711
    .line 712
    .line 713
    move-result-object v14

    .line 714
    iput-object v14, v13, Lb7/n;->c:Ljava/lang/Object;

    .line 715
    .line 716
    if-eqz v14, :cond_20

    .line 717
    .line 718
    goto :goto_1f

    .line 719
    :cond_20
    if-nez v4, :cond_22

    .line 720
    .line 721
    sget-object v12, Lc5/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 722
    .line 723
    :cond_21
    :goto_1b
    const/16 v56, 0x0

    .line 724
    .line 725
    goto :goto_1e

    .line 726
    :cond_22
    iget-object v12, v4, Lc5/j;->m:Landroid/net/Uri;

    .line 727
    .line 728
    invoke-virtual {v11, v12}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v12

    .line 732
    if-eqz v12, :cond_23

    .line 733
    .line 734
    iget-boolean v12, v4, Lc5/j;->H:Z

    .line 735
    .line 736
    if-eqz v12, :cond_23

    .line 737
    .line 738
    goto :goto_1b

    .line 739
    :cond_23
    add-long v14, v21, v19

    .line 740
    .line 741
    instance-of v12, v7, Le5/f;

    .line 742
    .line 743
    if-eqz v12, :cond_26

    .line 744
    .line 745
    move-object v12, v7

    .line 746
    check-cast v12, Le5/f;

    .line 747
    .line 748
    iget-boolean v12, v12, Le5/f;->l:Z

    .line 749
    .line 750
    if-nez v12, :cond_25

    .line 751
    .line 752
    iget v12, v5, Lc5/h;->c:I

    .line 753
    .line 754
    if-nez v12, :cond_24

    .line 755
    .line 756
    if-eqz v24, :cond_24

    .line 757
    .line 758
    goto :goto_1c

    .line 759
    :cond_24
    const/16 v24, 0x0

    .line 760
    .line 761
    goto :goto_1d

    .line 762
    :cond_25
    :goto_1c
    const/16 v24, 0x1

    .line 763
    .line 764
    :cond_26
    :goto_1d
    if-eqz v24, :cond_27

    .line 765
    .line 766
    move-wide/from16 v27, v14

    .line 767
    .line 768
    iget-wide v14, v4, Lk5/f;->h:J

    .line 769
    .line 770
    cmp-long v12, v27, v14

    .line 771
    .line 772
    if-gez v12, :cond_21

    .line 773
    .line 774
    :cond_27
    const/16 v56, 0x1

    .line 775
    .line 776
    :goto_1e
    if-eqz v56, :cond_28

    .line 777
    .line 778
    if-eqz v16, :cond_28

    .line 779
    .line 780
    :goto_1f
    goto/16 :goto_e

    .line 781
    .line 782
    :cond_28
    iget-object v12, v3, Lc5/i;->a:Lc5/c;

    .line 783
    .line 784
    iget-object v14, v3, Lc5/i;->b:Ls4/h;

    .line 785
    .line 786
    iget-object v15, v3, Lc5/i;->f:[Lm4/q;

    .line 787
    .line 788
    aget-object v31, v15, v2

    .line 789
    .line 790
    iget-object v2, v3, Lc5/i;->i:Ljava/util/List;

    .line 791
    .line 792
    iget-object v15, v3, Lc5/i;->q:Lm5/r;

    .line 793
    .line 794
    invoke-interface {v15}, Lm5/r;->n()I

    .line 795
    .line 796
    .line 797
    move-result v38

    .line 798
    iget-object v15, v3, Lc5/i;->q:Lm5/r;

    .line 799
    .line 800
    invoke-interface {v15}, Lm5/r;->q()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v39

    .line 804
    iget-boolean v15, v3, Lc5/i;->l:Z

    .line 805
    .line 806
    move-object/from16 v37, v2

    .line 807
    .line 808
    iget-object v2, v3, Lc5/i;->d:Lb0/c1;

    .line 809
    .line 810
    if-nez v6, :cond_29

    .line 811
    .line 812
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    move-object/from16 v28, v12

    .line 816
    .line 817
    move/from16 v50, v15

    .line 818
    .line 819
    const/4 v6, 0x0

    .line 820
    move-object/from16 v12, p1

    .line 821
    .line 822
    goto :goto_20

    .line 823
    :cond_29
    move-object/from16 v28, v12

    .line 824
    .line 825
    move/from16 v50, v15

    .line 826
    .line 827
    move-object/from16 v12, p1

    .line 828
    .line 829
    iget-object v15, v12, Lb0/c1;->b:Ljava/lang/Object;

    .line 830
    .line 831
    check-cast v15, Lc5/d;

    .line 832
    .line 833
    invoke-virtual {v15, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v6

    .line 837
    check-cast v6, [B

    .line 838
    .line 839
    :goto_20
    if-nez v10, :cond_2a

    .line 840
    .line 841
    const/4 v10, 0x0

    .line 842
    goto :goto_21

    .line 843
    :cond_2a
    iget-object v12, v12, Lb0/c1;->b:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v12, Lc5/d;

    .line 846
    .line 847
    invoke-virtual {v12, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v10

    .line 851
    check-cast v10, [B

    .line 852
    .line 853
    :goto_21
    iget-object v3, v3, Lc5/i;->k:Lw4/k;

    .line 854
    .line 855
    sget-object v12, Lc5/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 856
    .line 857
    sget-object v63, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 858
    .line 859
    iget-object v12, v7, Le5/i;->a:Ljava/lang/String;

    .line 860
    .line 861
    move-object v15, v1

    .line 862
    iget-wide v0, v7, Le5/i;->c:J

    .line 863
    .line 864
    invoke-static {v9, v12}, Lp4/c;->y(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 865
    .line 866
    .line 867
    move-result-object v12

    .line 868
    move-wide/from16 v29, v0

    .line 869
    .line 870
    iget-wide v0, v7, Le5/i;->i:J

    .line 871
    .line 872
    move-wide/from16 v64, v0

    .line 873
    .line 874
    iget-wide v0, v7, Le5/i;->j:J

    .line 875
    .line 876
    if-eqz v16, :cond_2b

    .line 877
    .line 878
    const/16 v24, 0x8

    .line 879
    .line 880
    const/16 v69, 0x8

    .line 881
    .line 882
    :goto_22
    move-wide/from16 v66, v0

    .line 883
    .line 884
    goto :goto_23

    .line 885
    :cond_2b
    const/16 v69, 0x0

    .line 886
    .line 887
    goto :goto_22

    .line 888
    :goto_23
    const-string v0, "The uri must be set."

    .line 889
    .line 890
    invoke-static {v12, v0}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    new-instance v57, Ls4/m;

    .line 894
    .line 895
    const-wide/16 v59, 0x0

    .line 896
    .line 897
    const/16 v61, 0x1

    .line 898
    .line 899
    const/16 v62, 0x0

    .line 900
    .line 901
    const/16 v68, 0x0

    .line 902
    .line 903
    move-object/from16 v58, v12

    .line 904
    .line 905
    invoke-direct/range {v57 .. v69}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 906
    .line 907
    .line 908
    move-wide/from16 v32, v29

    .line 909
    .line 910
    move-object/from16 v30, v57

    .line 911
    .line 912
    move-wide/from16 v33, v32

    .line 913
    .line 914
    if-eqz v6, :cond_2c

    .line 915
    .line 916
    const/16 v32, 0x1

    .line 917
    .line 918
    goto :goto_24

    .line 919
    :cond_2c
    const/16 v32, 0x0

    .line 920
    .line 921
    :goto_24
    if-eqz v32, :cond_2d

    .line 922
    .line 923
    iget-object v1, v7, Le5/i;->h:Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    invoke-static {v1}, Lc5/j;->d(Ljava/lang/String;)[B

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    goto :goto_25

    .line 933
    :cond_2d
    const/4 v1, 0x0

    .line 934
    :goto_25
    if-eqz v6, :cond_2e

    .line 935
    .line 936
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    new-instance v12, Lc5/a;

    .line 940
    .line 941
    invoke-direct {v12, v14, v6, v1}, Lc5/a;-><init>(Ls4/h;[B[B)V

    .line 942
    .line 943
    .line 944
    move-object/from16 v29, v12

    .line 945
    .line 946
    goto :goto_26

    .line 947
    :cond_2e
    move-object/from16 v29, v14

    .line 948
    .line 949
    :goto_26
    iget-object v1, v7, Le5/i;->b:Le5/h;

    .line 950
    .line 951
    if-eqz v1, :cond_32

    .line 952
    .line 953
    if-eqz v10, :cond_2f

    .line 954
    .line 955
    const/4 v6, 0x1

    .line 956
    goto :goto_27

    .line 957
    :cond_2f
    const/4 v6, 0x0

    .line 958
    :goto_27
    if-eqz v6, :cond_30

    .line 959
    .line 960
    iget-object v12, v1, Le5/i;->h:Ljava/lang/String;

    .line 961
    .line 962
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-static {v12}, Lc5/j;->d(Ljava/lang/String;)[B

    .line 966
    .line 967
    .line 968
    move-result-object v12

    .line 969
    :goto_28
    move-object/from16 v24, v3

    .line 970
    .line 971
    goto :goto_29

    .line 972
    :cond_30
    const/4 v12, 0x0

    .line 973
    goto :goto_28

    .line 974
    :goto_29
    iget-object v3, v1, Le5/i;->a:Ljava/lang/String;

    .line 975
    .line 976
    invoke-static {v9, v3}, Lp4/c;->y(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 977
    .line 978
    .line 979
    move-result-object v3

    .line 980
    move-object v9, v5

    .line 981
    move/from16 p1, v6

    .line 982
    .line 983
    iget-wide v5, v1, Le5/i;->i:J

    .line 984
    .line 985
    move-wide/from16 v64, v5

    .line 986
    .line 987
    iget-wide v5, v1, Le5/i;->j:J

    .line 988
    .line 989
    invoke-static {v3, v0}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    new-instance v57, Ls4/m;

    .line 993
    .line 994
    const-wide/16 v59, 0x0

    .line 995
    .line 996
    const/16 v61, 0x1

    .line 997
    .line 998
    const/16 v62, 0x0

    .line 999
    .line 1000
    const/16 v68, 0x0

    .line 1001
    .line 1002
    const/16 v69, 0x0

    .line 1003
    .line 1004
    move-object/from16 v58, v3

    .line 1005
    .line 1006
    move-wide/from16 v66, v5

    .line 1007
    .line 1008
    invoke-direct/range {v57 .. v69}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 1009
    .line 1010
    .line 1011
    if-eqz v10, :cond_31

    .line 1012
    .line 1013
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    new-instance v0, Lc5/a;

    .line 1017
    .line 1018
    invoke-direct {v0, v14, v10, v12}, Lc5/a;-><init>(Ls4/h;[B[B)V

    .line 1019
    .line 1020
    .line 1021
    move-object v3, v0

    .line 1022
    goto :goto_2a

    .line 1023
    :cond_31
    move-object v3, v14

    .line 1024
    :goto_2a
    move/from16 v35, p1

    .line 1025
    .line 1026
    move-wide/from16 v0, v33

    .line 1027
    .line 1028
    move-object/from16 v33, v3

    .line 1029
    .line 1030
    move-object/from16 v3, v57

    .line 1031
    .line 1032
    goto :goto_2b

    .line 1033
    :cond_32
    move-object/from16 v24, v3

    .line 1034
    .line 1035
    move-object v9, v5

    .line 1036
    move-wide/from16 v0, v33

    .line 1037
    .line 1038
    const/4 v3, 0x0

    .line 1039
    const/16 v33, 0x0

    .line 1040
    .line 1041
    const/16 v35, 0x0

    .line 1042
    .line 1043
    :goto_2b
    add-long v40, v21, v19

    .line 1044
    .line 1045
    add-long v42, v40, v0

    .line 1046
    .line 1047
    iget v0, v8, Le5/k;->j:I

    .line 1048
    .line 1049
    iget v1, v7, Le5/i;->d:I

    .line 1050
    .line 1051
    add-int/2addr v0, v1

    .line 1052
    if-eqz v4, :cond_37

    .line 1053
    .line 1054
    iget-object v1, v4, Lc5/j;->q:Ls4/m;

    .line 1055
    .line 1056
    if-eq v3, v1, :cond_34

    .line 1057
    .line 1058
    if-eqz v3, :cond_33

    .line 1059
    .line 1060
    if-eqz v1, :cond_33

    .line 1061
    .line 1062
    iget-object v5, v3, Ls4/m;->a:Landroid/net/Uri;

    .line 1063
    .line 1064
    iget-object v6, v1, Ls4/m;->a:Landroid/net/Uri;

    .line 1065
    .line 1066
    invoke-virtual {v5, v6}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v5

    .line 1070
    if-eqz v5, :cond_33

    .line 1071
    .line 1072
    iget-wide v5, v3, Ls4/m;->f:J

    .line 1073
    .line 1074
    move-wide/from16 v19, v5

    .line 1075
    .line 1076
    iget-wide v5, v1, Ls4/m;->f:J

    .line 1077
    .line 1078
    cmp-long v1, v19, v5

    .line 1079
    .line 1080
    if-nez v1, :cond_33

    .line 1081
    .line 1082
    goto :goto_2c

    .line 1083
    :cond_33
    const/4 v1, 0x0

    .line 1084
    goto :goto_2d

    .line 1085
    :cond_34
    :goto_2c
    const/4 v1, 0x1

    .line 1086
    :goto_2d
    iget-object v5, v4, Lc5/j;->m:Landroid/net/Uri;

    .line 1087
    .line 1088
    invoke-virtual {v11, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v5

    .line 1092
    if-eqz v5, :cond_35

    .line 1093
    .line 1094
    iget-boolean v5, v4, Lc5/j;->H:Z

    .line 1095
    .line 1096
    if-eqz v5, :cond_35

    .line 1097
    .line 1098
    const/4 v5, 0x1

    .line 1099
    goto :goto_2e

    .line 1100
    :cond_35
    const/4 v5, 0x0

    .line 1101
    :goto_2e
    iget-object v6, v4, Lc5/j;->y:Lf6/h;

    .line 1102
    .line 1103
    iget-object v8, v4, Lc5/j;->z:Lp4/s;

    .line 1104
    .line 1105
    if-eqz v1, :cond_36

    .line 1106
    .line 1107
    if-eqz v5, :cond_36

    .line 1108
    .line 1109
    iget-boolean v1, v4, Lc5/j;->J:Z

    .line 1110
    .line 1111
    if-nez v1, :cond_36

    .line 1112
    .line 1113
    iget v1, v4, Lc5/j;->l:I

    .line 1114
    .line 1115
    if-ne v1, v0, :cond_36

    .line 1116
    .line 1117
    iget-object v1, v4, Lc5/j;->C:Lc5/b;

    .line 1118
    .line 1119
    goto :goto_2f

    .line 1120
    :cond_36
    const/4 v1, 0x0

    .line 1121
    :goto_2f
    move-object/from16 v53, v1

    .line 1122
    .line 1123
    :goto_30
    move-object/from16 v54, v6

    .line 1124
    .line 1125
    move-object/from16 v55, v8

    .line 1126
    .line 1127
    goto :goto_31

    .line 1128
    :cond_37
    new-instance v6, Lf6/h;

    .line 1129
    .line 1130
    const/4 v10, 0x0

    .line 1131
    invoke-direct {v6, v10}, Lf6/h;-><init>(Lb7/c3;)V

    .line 1132
    .line 1133
    .line 1134
    new-instance v8, Lp4/s;

    .line 1135
    .line 1136
    const/16 v1, 0xa

    .line 1137
    .line 1138
    invoke-direct {v8, v1}, Lp4/s;-><init>(I)V

    .line 1139
    .line 1140
    .line 1141
    move-object/from16 v53, v10

    .line 1142
    .line 1143
    goto :goto_30

    .line 1144
    :goto_31
    new-instance v27, Lc5/j;

    .line 1145
    .line 1146
    iget-wide v4, v9, Lc5/h;->b:J

    .line 1147
    .line 1148
    iget v1, v9, Lc5/h;->c:I

    .line 1149
    .line 1150
    const/16 v18, 0x1

    .line 1151
    .line 1152
    xor-int/lit8 v47, v16, 0x1

    .line 1153
    .line 1154
    iget-boolean v6, v7, Le5/i;->k:Z

    .line 1155
    .line 1156
    iget-object v2, v2, Lb0/c1;->b:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v2, Landroid/util/SparseArray;

    .line 1159
    .line 1160
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v8

    .line 1164
    check-cast v8, Lp4/y;

    .line 1165
    .line 1166
    if-nez v8, :cond_38

    .line 1167
    .line 1168
    new-instance v8, Lp4/y;

    .line 1169
    .line 1170
    const-wide v9, 0x7ffffffffffffffeL

    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    invoke-direct {v8, v9, v10}, Lp4/y;-><init>(J)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v2, v0, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1179
    .line 1180
    .line 1181
    :cond_38
    move-object/from16 v51, v8

    .line 1182
    .line 1183
    iget-object v2, v7, Le5/i;->f:Lm4/n;

    .line 1184
    .line 1185
    move/from16 v48, v0

    .line 1186
    .line 1187
    move/from16 v46, v1

    .line 1188
    .line 1189
    move-object/from16 v52, v2

    .line 1190
    .line 1191
    move-object/from16 v34, v3

    .line 1192
    .line 1193
    move-wide/from16 v44, v4

    .line 1194
    .line 1195
    move/from16 v49, v6

    .line 1196
    .line 1197
    move-object/from16 v36, v11

    .line 1198
    .line 1199
    move-object/from16 v57, v24

    .line 1200
    .line 1201
    invoke-direct/range {v27 .. v57}, Lc5/j;-><init>(Lc5/c;Ls4/h;Ls4/m;Lm4/q;ZLs4/h;Ls4/m;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLp4/y;Lm4/n;Lc5/b;Lf6/h;Lp4/s;ZLw4/k;)V

    .line 1202
    .line 1203
    .line 1204
    move-object/from16 v0, v27

    .line 1205
    .line 1206
    iput-object v0, v13, Lb7/n;->c:Ljava/lang/Object;

    .line 1207
    .line 1208
    :goto_32
    iget-boolean v0, v13, Lb7/n;->b:Z

    .line 1209
    .line 1210
    iget-object v1, v13, Lb7/n;->c:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v1, Lk5/f;

    .line 1213
    .line 1214
    iget-object v2, v13, Lb7/n;->d:Ljava/lang/Object;

    .line 1215
    .line 1216
    check-cast v2, Landroid/net/Uri;

    .line 1217
    .line 1218
    if-eqz v0, :cond_39

    .line 1219
    .line 1220
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    move-object/from16 v0, p0

    .line 1226
    .line 1227
    iput-wide v3, v0, Lc5/q;->Q:J

    .line 1228
    .line 1229
    const/4 v6, 0x1

    .line 1230
    iput-boolean v6, v0, Lc5/q;->T:Z

    .line 1231
    .line 1232
    return v6

    .line 1233
    :cond_39
    move-object/from16 v0, p0

    .line 1234
    .line 1235
    const/4 v6, 0x1

    .line 1236
    if-nez v1, :cond_3a

    .line 1237
    .line 1238
    if-eqz v2, :cond_0

    .line 1239
    .line 1240
    iget-object v1, v0, Lc5/q;->c:Lb0/c1;

    .line 1241
    .line 1242
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v1, Lc5/k;

    .line 1245
    .line 1246
    iget-object v1, v1, Lc5/k;->b:Le5/c;

    .line 1247
    .line 1248
    iget-object v1, v1, Le5/c;->d:Ljava/util/HashMap;

    .line 1249
    .line 1250
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    check-cast v1, Le5/b;

    .line 1255
    .line 1256
    invoke-virtual {v1, v6}, Le5/b;->c(Z)V

    .line 1257
    .line 1258
    .line 1259
    const/16 v23, 0x0

    .line 1260
    .line 1261
    return v23

    .line 1262
    :cond_3a
    instance-of v2, v1, Lc5/j;

    .line 1263
    .line 1264
    if-eqz v2, :cond_3d

    .line 1265
    .line 1266
    move-object v2, v1

    .line 1267
    check-cast v2, Lc5/j;

    .line 1268
    .line 1269
    iput-object v2, v0, Lc5/q;->X:Lc5/j;

    .line 1270
    .line 1271
    iget-object v3, v2, Lk5/f;->d:Lm4/q;

    .line 1272
    .line 1273
    iput-object v3, v0, Lc5/q;->F:Lm4/q;

    .line 1274
    .line 1275
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    iput-wide v3, v0, Lc5/q;->Q:J

    .line 1281
    .line 1282
    iget-object v3, v0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 1283
    .line 1284
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    iget-object v4, v0, Lc5/q;->v:[Lc5/p;

    .line 1292
    .line 1293
    array-length v5, v4

    .line 1294
    const/4 v14, 0x0

    .line 1295
    :goto_33
    if-ge v14, v5, :cond_3b

    .line 1296
    .line 1297
    aget-object v6, v4, v14

    .line 1298
    .line 1299
    iget v7, v6, Lj5/b1;->q:I

    .line 1300
    .line 1301
    iget v6, v6, Lj5/b1;->p:I

    .line 1302
    .line 1303
    add-int/2addr v7, v6

    .line 1304
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v6

    .line 1308
    invoke-virtual {v3, v6}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1309
    .line 1310
    .line 1311
    add-int/lit8 v14, v14, 0x1

    .line 1312
    .line 1313
    goto :goto_33

    .line 1314
    :cond_3b
    invoke-virtual {v3}, Lya/f0;->f()Lya/a1;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v3

    .line 1318
    iput-object v0, v2, Lc5/j;->D:Lc5/q;

    .line 1319
    .line 1320
    iput-object v3, v2, Lc5/j;->I:Lya/i0;

    .line 1321
    .line 1322
    iget-object v3, v0, Lc5/q;->v:[Lc5/p;

    .line 1323
    .line 1324
    array-length v4, v3

    .line 1325
    const/4 v5, 0x0

    .line 1326
    :goto_34
    if-ge v5, v4, :cond_3d

    .line 1327
    .line 1328
    aget-object v6, v3, v5

    .line 1329
    .line 1330
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1331
    .line 1332
    .line 1333
    iget v7, v2, Lc5/j;->k:I

    .line 1334
    .line 1335
    int-to-long v7, v7

    .line 1336
    iput-wide v7, v6, Lj5/b1;->C:J

    .line 1337
    .line 1338
    iget-boolean v7, v2, Lc5/j;->n:Z

    .line 1339
    .line 1340
    if-eqz v7, :cond_3c

    .line 1341
    .line 1342
    const/4 v12, 0x1

    .line 1343
    iput-boolean v12, v6, Lj5/b1;->G:Z

    .line 1344
    .line 1345
    :cond_3c
    add-int/lit8 v5, v5, 0x1

    .line 1346
    .line 1347
    goto :goto_34

    .line 1348
    :cond_3d
    iput-object v1, v0, Lc5/q;->u:Lk5/f;

    .line 1349
    .line 1350
    iget-object v2, v0, Lc5/q;->i:Lm3/l;

    .line 1351
    .line 1352
    iget v3, v1, Lk5/f;->c:I

    .line 1353
    .line 1354
    invoke-virtual {v2, v3}, Lm3/l;->u(I)I

    .line 1355
    .line 1356
    .line 1357
    move-result v2

    .line 1358
    invoke-virtual {v15, v1, v0, v2}, Ln5/o;->f(Ln5/l;Ln5/j;I)V

    .line 1359
    .line 1360
    .line 1361
    const/16 v18, 0x1

    .line 1362
    .line 1363
    return v18

    .line 1364
    :goto_35
    return v23
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc5/q;->D:Z

    .line 2
    .line 3
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/q;->I:Lj5/o1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc5/q;->J:Ljava/util/Set;

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
    .locals 12

    .line 1
    check-cast p1, Lk5/f;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc5/q;->u:Lk5/f;

    .line 5
    .line 6
    instance-of v0, p1, Lc5/e;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lc5/e;

    .line 12
    .line 13
    iget-object v1, v0, Lc5/e;->j:[B

    .line 14
    .line 15
    iget-object v2, p0, Lc5/q;->d:Lc5/i;

    .line 16
    .line 17
    iput-object v1, v2, Lc5/i;->m:[B

    .line 18
    .line 19
    iget-object v1, v2, Lc5/i;->j:Lb0/c1;

    .line 20
    .line 21
    iget-object v2, v0, Lk5/f;->b:Ls4/m;

    .line 22
    .line 23
    iget-object v2, v2, Ls4/m;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v0, v0, Lc5/e;->l:[B

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lc5/d;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, [B

    .line 42
    .line 43
    :cond_0
    new-instance v2, Lj5/u;

    .line 44
    .line 45
    iget-wide v0, p1, Lk5/f;->a:J

    .line 46
    .line 47
    iget-object v0, p1, Lk5/f;->i:Ls4/d0;

    .line 48
    .line 49
    iget-object v0, v0, Ls4/d0;->c:Landroid/net/Uri;

    .line 50
    .line 51
    move-wide/from16 v0, p4

    .line 52
    .line 53
    invoke-direct {v2, v0, v1}, Lj5/u;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lc5/q;->i:Lm3/l;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget v3, p1, Lk5/f;->c:I

    .line 62
    .line 63
    iget-object v5, p1, Lk5/f;->d:Lm4/q;

    .line 64
    .line 65
    iget v6, p1, Lk5/f;->e:I

    .line 66
    .line 67
    iget-object v7, p1, Lk5/f;->f:Ljava/lang/Object;

    .line 68
    .line 69
    iget-wide v8, p1, Lk5/f;->g:J

    .line 70
    .line 71
    iget-wide v10, p1, Lk5/f;->h:J

    .line 72
    .line 73
    iget-object v1, p0, Lc5/q;->k:Lah/j;

    .line 74
    .line 75
    iget v4, p0, Lc5/q;->b:I

    .line 76
    .line 77
    invoke-virtual/range {v1 .. v11}, Lah/j;->B(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 78
    .line 79
    .line 80
    iget-boolean p1, p0, Lc5/q;->D:Z

    .line 81
    .line 82
    if-nez p1, :cond_1

    .line 83
    .line 84
    new-instance p1, Lv4/e0;

    .line 85
    .line 86
    invoke-direct {p1}, Lv4/e0;-><init>()V

    .line 87
    .line 88
    .line 89
    iget-wide v0, p0, Lc5/q;->P:J

    .line 90
    .line 91
    iput-wide v0, p1, Lv4/e0;->a:J

    .line 92
    .line 93
    new-instance v0, Lv4/f0;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Lv4/f0;-><init>(Lv4/e0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lc5/q;->e(Lv4/f0;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_1
    iget-object p1, p0, Lc5/q;->c:Lb0/c1;

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Lb0/c1;->c(Lj5/e1;)V

    .line 105
    .line 106
    .line 107
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc5/q;->j:Ln5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/o;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final n()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc5/q;->U:Z

    .line 3
    .line 4
    iget-object v0, p0, Lc5/q;->r:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lc5/q;->q:Lc5/n;

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

.method public final r(Ln5/l;JJI)V
    .locals 13

    .line 1
    check-cast p1, Lk5/f;

    .line 2
    .line 3
    if-nez p6, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj5/u;

    .line 6
    .line 7
    iget-wide v1, p1, Lk5/f;->a:J

    .line 8
    .line 9
    iget-object v1, p1, Lk5/f;->b:Ls4/m;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lj5/u;-><init>(Ls4/m;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    move-object v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance v0, Lj5/u;

    .line 17
    .line 18
    iget-wide v1, p1, Lk5/f;->a:J

    .line 19
    .line 20
    iget-object v1, p1, Lk5/f;->i:Ls4/d0;

    .line 21
    .line 22
    iget-object v1, v1, Ls4/d0;->c:Landroid/net/Uri;

    .line 23
    .line 24
    move-wide/from16 v1, p4

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Lj5/u;-><init>(J)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    iget v3, p1, Lk5/f;->c:I

    .line 31
    .line 32
    iget-object v5, p1, Lk5/f;->d:Lm4/q;

    .line 33
    .line 34
    iget v6, p1, Lk5/f;->e:I

    .line 35
    .line 36
    iget-object v7, p1, Lk5/f;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iget-wide v8, p1, Lk5/f;->g:J

    .line 39
    .line 40
    iget-wide v10, p1, Lk5/f;->h:J

    .line 41
    .line 42
    iget-object v1, p0, Lc5/q;->k:Lah/j;

    .line 43
    .line 44
    iget v4, p0, Lc5/q;->b:I

    .line 45
    .line 46
    move/from16 v12, p6

    .line 47
    .line 48
    invoke-virtual/range {v1 .. v12}, Lah/j;->E(Lj5/u;IILm4/q;ILjava/lang/Object;JJI)V

    .line 49
    .line 50
    .line 51
    return-void
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
    check-cast p1, Lk5/f;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc5/q;->u:Lk5/f;

    .line 5
    .line 6
    new-instance v2, Lj5/u;

    .line 7
    .line 8
    iget-wide v0, p1, Lk5/f;->a:J

    .line 9
    .line 10
    iget-object v0, p1, Lk5/f;->i:Ls4/d0;

    .line 11
    .line 12
    iget-object v0, v0, Ls4/d0;->c:Landroid/net/Uri;

    .line 13
    .line 14
    move-wide/from16 v0, p4

    .line 15
    .line 16
    invoke-direct {v2, v0, v1}, Lj5/u;-><init>(J)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lc5/q;->i:Lm3/l;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v3, p1, Lk5/f;->c:I

    .line 25
    .line 26
    iget-object v5, p1, Lk5/f;->d:Lm4/q;

    .line 27
    .line 28
    iget v6, p1, Lk5/f;->e:I

    .line 29
    .line 30
    iget-object v7, p1, Lk5/f;->f:Ljava/lang/Object;

    .line 31
    .line 32
    iget-wide v8, p1, Lk5/f;->g:J

    .line 33
    .line 34
    iget-wide v10, p1, Lk5/f;->h:J

    .line 35
    .line 36
    iget-object v1, p0, Lc5/q;->k:Lah/j;

    .line 37
    .line 38
    iget v4, p0, Lc5/q;->b:I

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v11}, Lah/j;->A(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 41
    .line 42
    .line 43
    if-nez p6, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lc5/q;->D()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    iget p1, p0, Lc5/q;->E:I

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p0}, Lc5/q;->H()V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget p1, p0, Lc5/q;->E:I

    .line 59
    .line 60
    if-lez p1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Lc5/q;->c:Lb0/c1;

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Lb0/c1;->c(Lj5/e1;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
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
    .locals 7

    .line 1
    iget-boolean v0, p0, Lc5/q;->T:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lc5/q;->D()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, Lc5/q;->Q:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    iget-wide v0, p0, Lc5/q;->P:J

    .line 18
    .line 19
    invoke-virtual {p0}, Lc5/q;->B()Lc5/j;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-boolean v3, v2, Lc5/j;->H:Z

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget-object v2, p0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-le v3, v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/lit8 v3, v3, -0x2

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lc5/j;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-eqz v2, :cond_4

    .line 52
    .line 53
    iget-wide v2, v2, Lk5/f;->h:J

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    :cond_4
    iget-boolean v2, p0, Lc5/q;->C:Z

    .line 60
    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    iget-object v2, p0, Lc5/q;->v:[Lc5/p;

    .line 64
    .line 65
    array-length v3, v2

    .line 66
    const/4 v4, 0x0

    .line 67
    :goto_1
    if-ge v4, v3, :cond_5

    .line 68
    .line 69
    aget-object v5, v2, v4

    .line 70
    .line 71
    invoke-virtual {v5}, Lj5/b1;->q()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    return-wide v0
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

.method public final u(II)Lr5/h0;
    .locals 11

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lc5/q;->Y:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, Lc5/q;->x:Ljava/util/HashSet;

    .line 13
    .line 14
    iget-object v4, p0, Lc5/q;->y:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Lp4/c;->c(Z)V

    .line 28
    .line 29
    .line 30
    const/4 v0, -0x1

    .line 31
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v1, v0, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lc5/q;->w:[I

    .line 49
    .line 50
    aput p1, v0, v1

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lc5/q;->w:[I

    .line 53
    .line 54
    aget v0, v0, v1

    .line 55
    .line 56
    if-ne v0, p1, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lc5/q;->v:[Lc5/p;

    .line 59
    .line 60
    aget-object v5, v0, v1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {p1, p2}, Lc5/q;->x(II)Lr5/m;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const/4 v0, 0x0

    .line 69
    :goto_0
    iget-object v1, p0, Lc5/q;->v:[Lc5/p;

    .line 70
    .line 71
    array-length v6, v1

    .line 72
    if-ge v0, v6, :cond_5

    .line 73
    .line 74
    iget-object v6, p0, Lc5/q;->w:[I

    .line 75
    .line 76
    aget v6, v6, v0

    .line 77
    .line 78
    if-ne v6, p1, :cond_4

    .line 79
    .line 80
    aget-object v5, v1, v0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    :goto_1
    if-nez v5, :cond_d

    .line 87
    .line 88
    iget-boolean v0, p0, Lc5/q;->U:Z

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-static {p1, p2}, Lc5/q;->x(II)Lr5/m;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_6
    iget-object v0, p0, Lc5/q;->v:[Lc5/p;

    .line 98
    .line 99
    array-length v0, v0

    .line 100
    const/4 v1, 0x1

    .line 101
    if-eq p2, v1, :cond_7

    .line 102
    .line 103
    const/4 v5, 0x2

    .line 104
    if-ne p2, v5, :cond_8

    .line 105
    .line 106
    :cond_7
    const/4 v2, 0x1

    .line 107
    :cond_8
    new-instance v5, Lc5/p;

    .line 108
    .line 109
    iget-object v6, p0, Lc5/q;->h:Lb5/q;

    .line 110
    .line 111
    iget-object v7, p0, Lc5/q;->t:Ljava/util/Map;

    .line 112
    .line 113
    iget-object v8, p0, Lc5/q;->e:Ln5/f;

    .line 114
    .line 115
    iget-object v9, p0, Lc5/q;->g:Lb5/t;

    .line 116
    .line 117
    invoke-direct {v5, v8, v9, v6, v7}, Lc5/p;-><init>(Ln5/f;Lb5/t;Lb5/q;Ljava/util/Map;)V

    .line 118
    .line 119
    .line 120
    iget-wide v6, p0, Lc5/q;->P:J

    .line 121
    .line 122
    iput-wide v6, v5, Lj5/b1;->t:J

    .line 123
    .line 124
    if-eqz v2, :cond_9

    .line 125
    .line 126
    iget-object v6, p0, Lc5/q;->W:Lm4/n;

    .line 127
    .line 128
    iput-object v6, v5, Lc5/p;->I:Lm4/n;

    .line 129
    .line 130
    iput-boolean v1, v5, Lj5/b1;->z:Z

    .line 131
    .line 132
    :cond_9
    iget-wide v6, p0, Lc5/q;->V:J

    .line 133
    .line 134
    iget-wide v8, v5, Lj5/b1;->F:J

    .line 135
    .line 136
    cmp-long v10, v8, v6

    .line 137
    .line 138
    if-eqz v10, :cond_a

    .line 139
    .line 140
    iput-wide v6, v5, Lj5/b1;->F:J

    .line 141
    .line 142
    iput-boolean v1, v5, Lj5/b1;->z:Z

    .line 143
    .line 144
    :cond_a
    iget-object v6, p0, Lc5/q;->X:Lc5/j;

    .line 145
    .line 146
    if-eqz v6, :cond_b

    .line 147
    .line 148
    iget v6, v6, Lc5/j;->k:I

    .line 149
    .line 150
    int-to-long v6, v6

    .line 151
    iput-wide v6, v5, Lj5/b1;->C:J

    .line 152
    .line 153
    :cond_b
    iput-object p0, v5, Lj5/b1;->f:Ljava/lang/Object;

    .line 154
    .line 155
    iget-object v6, p0, Lc5/q;->w:[I

    .line 156
    .line 157
    add-int/lit8 v7, v0, 0x1

    .line 158
    .line 159
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    iput-object v6, p0, Lc5/q;->w:[I

    .line 164
    .line 165
    aput p1, v6, v0

    .line 166
    .line 167
    iget-object p1, p0, Lc5/q;->v:[Lc5/p;

    .line 168
    .line 169
    sget v6, Lp4/c0;->a:I

    .line 170
    .line 171
    array-length v6, p1

    .line 172
    add-int/2addr v6, v1

    .line 173
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    array-length p1, p1

    .line 178
    aput-object v5, v1, p1

    .line 179
    .line 180
    check-cast v1, [Lc5/p;

    .line 181
    .line 182
    iput-object v1, p0, Lc5/q;->v:[Lc5/p;

    .line 183
    .line 184
    iget-object p1, p0, Lc5/q;->O:[Z

    .line 185
    .line 186
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, Lc5/q;->O:[Z

    .line 191
    .line 192
    aput-boolean v2, p1, v0

    .line 193
    .line 194
    iget-boolean p1, p0, Lc5/q;->M:Z

    .line 195
    .line 196
    or-int/2addr p1, v2

    .line 197
    iput-boolean p1, p0, Lc5/q;->M:Z

    .line 198
    .line 199
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 207
    .line 208
    .line 209
    invoke-static {p2}, Lc5/q;->C(I)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iget v1, p0, Lc5/q;->A:I

    .line 214
    .line 215
    invoke-static {v1}, Lc5/q;->C(I)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-le p1, v1, :cond_c

    .line 220
    .line 221
    iput v0, p0, Lc5/q;->B:I

    .line 222
    .line 223
    iput p2, p0, Lc5/q;->A:I

    .line 224
    .line 225
    :cond_c
    iget-object p1, p0, Lc5/q;->N:[Z

    .line 226
    .line 227
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Lc5/q;->N:[Z

    .line 232
    .line 233
    :cond_d
    const/4 p1, 0x5

    .line 234
    if-ne p2, p1, :cond_f

    .line 235
    .line 236
    iget-object p1, p0, Lc5/q;->z:Lc5/o;

    .line 237
    .line 238
    if-nez p1, :cond_e

    .line 239
    .line 240
    new-instance p1, Lc5/o;

    .line 241
    .line 242
    iget p2, p0, Lc5/q;->l:I

    .line 243
    .line 244
    invoke-direct {p1, v5, p2}, Lc5/o;-><init>(Lr5/h0;I)V

    .line 245
    .line 246
    .line 247
    iput-object p1, p0, Lc5/q;->z:Lc5/o;

    .line 248
    .line 249
    :cond_e
    iget-object p1, p0, Lc5/q;->z:Lc5/o;

    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_f
    return-object v5
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

.method public final v(Ln5/l;JJLjava/io/IOException;I)Lb7/q0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, Lk5/f;

    .line 8
    .line 9
    instance-of v2, v1, Lc5/j;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Lc5/j;

    .line 15
    .line 16
    iget-boolean v3, v3, Lc5/j;->K:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    instance-of v3, v12, Ls4/y;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    move-object v3, v12

    .line 25
    check-cast v3, Ls4/y;

    .line 26
    .line 27
    iget v3, v3, Ls4/y;->d:I

    .line 28
    .line 29
    const/16 v4, 0x19a

    .line 30
    .line 31
    if-eq v3, v4, :cond_0

    .line 32
    .line 33
    const/16 v4, 0x194

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    :cond_0
    sget-object v1, Ln5/o;->d:Lb7/q0;

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_1
    iget-object v3, v1, Lk5/f;->i:Ls4/d0;

    .line 41
    .line 42
    iget-wide v3, v3, Ls4/d0;->b:J

    .line 43
    .line 44
    move v5, v2

    .line 45
    new-instance v2, Lj5/u;

    .line 46
    .line 47
    iget-object v6, v1, Lk5/f;->i:Ls4/d0;

    .line 48
    .line 49
    iget-object v6, v6, Ls4/d0;->c:Landroid/net/Uri;

    .line 50
    .line 51
    move-wide/from16 v6, p4

    .line 52
    .line 53
    invoke-direct {v2, v6, v7}, Lj5/u;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iget-wide v6, v1, Lk5/f;->g:J

    .line 57
    .line 58
    invoke-static {v6, v7}, Lp4/c0;->c0(J)J

    .line 59
    .line 60
    .line 61
    iget-wide v6, v1, Lk5/f;->h:J

    .line 62
    .line 63
    invoke-static {v6, v7}, Lp4/c0;->c0(J)J

    .line 64
    .line 65
    .line 66
    new-instance v6, Lb7/m;

    .line 67
    .line 68
    const/4 v7, 0x6

    .line 69
    move/from16 v8, p7

    .line 70
    .line 71
    invoke-direct {v6, v8, v7, v12}, Lb7/m;-><init>(IILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v7, v0, Lc5/q;->d:Lc5/i;

    .line 75
    .line 76
    iget-object v8, v7, Lc5/i;->q:Lm5/r;

    .line 77
    .line 78
    invoke-static {v8}, Llc/b;->q(Lm5/r;)Leg/g;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    iget-object v9, v0, Lc5/q;->i:Lm3/l;

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v8, v6}, Lm3/l;->t(Leg/g;Lb7/m;)Lb7/q0;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    const/4 v9, 0x0

    .line 92
    if-eqz v8, :cond_2

    .line 93
    .line 94
    iget v10, v8, Lb7/q0;->b:I

    .line 95
    .line 96
    const/4 v11, 0x2

    .line 97
    if-ne v10, v11, :cond_2

    .line 98
    .line 99
    iget-wide v10, v8, Lb7/q0;->a:J

    .line 100
    .line 101
    iget-object v8, v7, Lc5/i;->q:Lm5/r;

    .line 102
    .line 103
    iget-object v7, v7, Lc5/i;->h:Lm4/j1;

    .line 104
    .line 105
    iget-object v13, v1, Lk5/f;->d:Lm4/q;

    .line 106
    .line 107
    invoke-virtual {v7, v13}, Lm4/j1;->b(Lm4/q;)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    invoke-interface {v8, v7}, Lm5/r;->u(I)I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-interface {v8, v7, v10, v11}, Lm5/r;->o(IJ)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    move v14, v7

    .line 120
    goto :goto_0

    .line 121
    :cond_2
    const/4 v14, 0x0

    .line 122
    :goto_0
    if-eqz v14, :cond_6

    .line 123
    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    const-wide/16 v5, 0x0

    .line 127
    .line 128
    cmp-long v7, v3, v5

    .line 129
    .line 130
    if-nez v7, :cond_5

    .line 131
    .line 132
    iget-object v3, v0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    const/4 v5, 0x1

    .line 139
    sub-int/2addr v4, v5

    .line 140
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Lc5/j;

    .line 145
    .line 146
    if-ne v4, v1, :cond_3

    .line 147
    .line 148
    const/4 v9, 0x1

    .line 149
    :cond_3
    invoke-static {v9}, Lp4/c;->i(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_4

    .line 157
    .line 158
    iget-wide v3, v0, Lc5/q;->P:J

    .line 159
    .line 160
    iput-wide v3, v0, Lc5/q;->Q:J

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    invoke-static {v3}, Lya/q;->k(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Lc5/j;

    .line 168
    .line 169
    iput-boolean v5, v3, Lc5/j;->J:Z

    .line 170
    .line 171
    :cond_5
    :goto_1
    sget-object v3, Ln5/o;->e:Lb7/q0;

    .line 172
    .line 173
    :goto_2
    move-object v15, v3

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    invoke-static {v6}, Lm3/l;->v(Lb7/m;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v3

    .line 179
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    cmp-long v7, v3, v5

    .line 185
    .line 186
    if-eqz v7, :cond_7

    .line 187
    .line 188
    new-instance v5, Lb7/q0;

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    invoke-direct {v5, v9, v6, v3, v4}, Lb7/q0;-><init>(IZJ)V

    .line 192
    .line 193
    .line 194
    move-object v3, v5

    .line 195
    goto :goto_2

    .line 196
    :cond_7
    sget-object v3, Ln5/o;->f:Lb7/q0;

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :goto_3
    invoke-virtual {v15}, Lb7/q0;->a()Z

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    xor-int/lit8 v13, v16, 0x1

    .line 204
    .line 205
    iget v3, v1, Lk5/f;->c:I

    .line 206
    .line 207
    iget-object v5, v1, Lk5/f;->d:Lm4/q;

    .line 208
    .line 209
    iget v6, v1, Lk5/f;->e:I

    .line 210
    .line 211
    iget-object v7, v1, Lk5/f;->f:Ljava/lang/Object;

    .line 212
    .line 213
    iget-wide v8, v1, Lk5/f;->g:J

    .line 214
    .line 215
    iget-wide v10, v1, Lk5/f;->h:J

    .line 216
    .line 217
    iget-object v1, v0, Lc5/q;->k:Lah/j;

    .line 218
    .line 219
    iget v4, v0, Lc5/q;->b:I

    .line 220
    .line 221
    invoke-virtual/range {v1 .. v13}, Lah/j;->C(Lj5/u;IILm4/q;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 222
    .line 223
    .line 224
    if-nez v16, :cond_8

    .line 225
    .line 226
    const/4 v1, 0x0

    .line 227
    iput-object v1, v0, Lc5/q;->u:Lk5/f;

    .line 228
    .line 229
    :cond_8
    if-eqz v14, :cond_a

    .line 230
    .line 231
    iget-boolean v1, v0, Lc5/q;->D:Z

    .line 232
    .line 233
    if-nez v1, :cond_9

    .line 234
    .line 235
    new-instance v1, Lv4/e0;

    .line 236
    .line 237
    invoke-direct {v1}, Lv4/e0;-><init>()V

    .line 238
    .line 239
    .line 240
    iget-wide v2, v0, Lc5/q;->P:J

    .line 241
    .line 242
    iput-wide v2, v1, Lv4/e0;->a:J

    .line 243
    .line 244
    new-instance v2, Lv4/f0;

    .line 245
    .line 246
    invoke-direct {v2, v1}, Lv4/f0;-><init>(Lv4/e0;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v2}, Lc5/q;->e(Lv4/f0;)Z

    .line 250
    .line 251
    .line 252
    return-object v15

    .line 253
    :cond_9
    iget-object v1, v0, Lc5/q;->c:Lb0/c1;

    .line 254
    .line 255
    invoke-virtual {v1, v0}, Lb0/c1;->c(Lj5/e1;)V

    .line 256
    .line 257
    .line 258
    :cond_a
    return-object v15
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
    .locals 5

    .line 1
    iget-object v0, p0, Lc5/q;->j:Ln5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/o;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Lc5/q;->D()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_0
    invoke-virtual {v0}, Ln5/o;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Lc5/q;->d:Lc5/i;

    .line 21
    .line 22
    iget-object v3, p0, Lc5/q;->o:Ljava/util/List;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lc5/q;->u:Lk5/f;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lc5/q;->u:Lk5/f;

    .line 32
    .line 33
    iget-object v4, v2, Lc5/i;->n:Lj5/b;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v2, v2, Lc5/i;->q:Lm5/r;

    .line 40
    .line 41
    invoke-interface {v2, p1, p2, v1, v3}, Lm5/r;->d(JLk5/f;Ljava/util/List;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_0
    if-eqz p1, :cond_7

    .line 46
    .line 47
    invoke-virtual {v0}, Ln5/o;->a()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_1
    const/4 v1, 0x2

    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    add-int/lit8 v4, v0, -0x1

    .line 59
    .line 60
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lc5/j;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Lc5/i;->b(Lc5/j;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ne v4, v1, :cond_3

    .line 71
    .line 72
    add-int/lit8 v0, v0, -0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ge v0, v4, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lc5/q;->A(I)V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget-object v0, v2, Lc5/i;->n:Lj5/b;

    .line 85
    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    iget-object v0, v2, Lc5/i;->q:Lm5/r;

    .line 89
    .line 90
    invoke-interface {v0}, Lm5/r;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ge v0, v1, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-object v0, v2, Lc5/i;->q:Lm5/r;

    .line 98
    .line 99
    invoke-interface {v0, p1, p2, v3}, Lm5/r;->j(JLjava/util/List;)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    goto :goto_3

    .line 104
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    :goto_3
    iget-object p2, p0, Lc5/q;->n:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-ge p1, p2, :cond_7

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Lc5/q;->A(I)V

    .line 117
    .line 118
    .line 119
    :cond_7
    :goto_4
    return-void
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
.end method

.method public final y([Lm4/j1;)Lj5/o1;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, Lm4/j1;->a:I

    .line 9
    .line 10
    new-array v3, v3, [Lm4/q;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_1
    iget v5, v2, Lm4/j1;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v2, Lm4/j1;->d:[Lm4/q;

    .line 18
    .line 19
    aget-object v5, v5, v4

    .line 20
    .line 21
    iget-object v6, p0, Lc5/q;->g:Lb5/t;

    .line 22
    .line 23
    invoke-interface {v6, v5}, Lb5/t;->k(Lm4/q;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, Lm4/q;->a()Lm4/p;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iput v6, v5, Lm4/p;->L:I

    .line 32
    .line 33
    new-instance v6, Lm4/q;

    .line 34
    .line 35
    invoke-direct {v6, v5}, Lm4/q;-><init>(Lm4/p;)V

    .line 36
    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance v4, Lm4/j1;

    .line 44
    .line 45
    iget-object v2, v2, Lm4/j1;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3}, Lm4/j1;-><init>(Ljava/lang/String;[Lm4/q;)V

    .line 48
    .line 49
    .line 50
    aput-object v4, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Lj5/o1;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lj5/o1;-><init>([Lm4/j1;)V

    .line 58
    .line 59
    .line 60
    return-object v0
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
