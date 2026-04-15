.class public abstract Ld0/f0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lu/v1;


# instance fields
.field public final A:Lb0/w0;

.field public final B:Lx0/w0;

.field public final C:Lx0/w0;

.field public final D:Lx0/e1;

.field public final E:Lx0/e1;

.field public final F:Lx0/e1;

.field public final G:Lx0/e1;

.field public a:Z

.field public b:Ld0/w;

.field public final c:Lx0/e1;

.field public final d:Ld0/y;

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public final k:Lu/k;

.field public final l:Z

.field public m:I

.field public n:Lb0/y0;

.field public o:Z

.field public final p:Lx0/e1;

.field public q:Lf3/c;

.field public final r:Lw/k;

.field public final s:Lx0/b1;

.field public final t:Lx0/b1;

.field public final u:Lb0/z0;

.field public final v:Lb0/m;

.field public final w:Lb0/e;

.field public final x:Lx0/e1;

.field public final y:La0/b0;

.field public z:J


# direct methods
.method public constructor <init>(FI)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p1

    .line 5
    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    .line 6
    .line 7
    cmpg-double v4, v2, v0

    .line 8
    .line 9
    if-gtz v4, :cond_0

    .line 10
    .line 11
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 12
    .line 13
    cmpg-double v4, v0, v2

    .line 14
    .line 15
    if-gtz v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "currentPageOffsetFraction "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " is not within the range -0.5 to 0.5"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lx/a;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance v0, Lp1/b;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lp1/b;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Ld0/f0;->c:Lx0/e1;

    .line 52
    .line 53
    new-instance v0, Ld0/y;

    .line 54
    .line 55
    invoke-direct {v0, p2, p1, p0}, Ld0/y;-><init>(IFLd0/f0;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Ld0/f0;->d:Ld0/y;

    .line 59
    .line 60
    iput p2, p0, Ld0/f0;->e:I

    .line 61
    .line 62
    const-wide v0, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide v0, p0, Ld0/f0;->g:J

    .line 68
    .line 69
    new-instance p1, Ld0/c0;

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-direct {p1, p0, v0}, Ld0/c0;-><init>(Ld0/f0;I)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lu/k;

    .line 76
    .line 77
    invoke-direct {v0, p1}, Lu/k;-><init>(Lic/k;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Ld0/f0;->k:Lu/k;

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, Ld0/f0;->l:Z

    .line 84
    .line 85
    const/4 p1, -0x1

    .line 86
    iput p1, p0, Ld0/f0;->m:I

    .line 87
    .line 88
    sget-object v0, Ld0/j0;->b:Ld0/w;

    .line 89
    .line 90
    sget-object v1, Lx0/r0;->c:Lx0/r0;

    .line 91
    .line 92
    new-instance v2, Lx0/e1;

    .line 93
    .line 94
    invoke-direct {v2, v0, v1}, Lx0/e1;-><init>(Ljava/lang/Object;Lx0/i2;)V

    .line 95
    .line 96
    .line 97
    iput-object v2, p0, Ld0/f0;->p:Lx0/e1;

    .line 98
    .line 99
    sget-object v0, Ld0/j0;->c:Ld0/h0;

    .line 100
    .line 101
    iput-object v0, p0, Ld0/f0;->q:Lf3/c;

    .line 102
    .line 103
    new-instance v0, Lw/k;

    .line 104
    .line 105
    invoke-direct {v0}, Lw/k;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Ld0/f0;->r:Lw/k;

    .line 109
    .line 110
    new-instance v0, Lx0/b1;

    .line 111
    .line 112
    invoke-direct {v0, p1}, Lx0/b1;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, Ld0/f0;->s:Lx0/b1;

    .line 116
    .line 117
    new-instance p1, Lx0/b1;

    .line 118
    .line 119
    invoke-direct {p1, p2}, Lx0/b1;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Ld0/f0;->t:Lx0/b1;

    .line 123
    .line 124
    sget-object p1, Lx0/r0;->f:Lx0/r0;

    .line 125
    .line 126
    new-instance p2, Ld0/e0;

    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {p2, p0, v0}, Ld0/e0;-><init>(Ld0/f0;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2, p1}, Lx0/v;->p(Lic/a;Lx0/i2;)Lx0/c0;

    .line 133
    .line 134
    .line 135
    new-instance p2, Ld0/e0;

    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    invoke-direct {p2, p0, v0}, Ld0/e0;-><init>(Ld0/f0;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {p2, p1}, Lx0/v;->p(Lic/a;Lx0/i2;)Lx0/c0;

    .line 142
    .line 143
    .line 144
    new-instance p1, Lb0/z0;

    .line 145
    .line 146
    new-instance p2, Ld0/c0;

    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    invoke-direct {p2, p0, v0}, Ld0/c0;-><init>(Ld0/f0;I)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, p2}, Lb0/z0;-><init>(Lic/k;)V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, Ld0/f0;->u:Lb0/z0;

    .line 156
    .line 157
    new-instance p1, Lb0/m;

    .line 158
    .line 159
    const/4 p2, 0x0

    .line 160
    invoke-direct {p1, p2}, Lb0/m;-><init>(I)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Ld0/f0;->v:Lb0/m;

    .line 164
    .line 165
    new-instance p1, Lb0/e;

    .line 166
    .line 167
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object p1, p0, Ld0/f0;->w:Lb0/e;

    .line 171
    .line 172
    const/4 p1, 0x0

    .line 173
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, p0, Ld0/f0;->x:Lx0/e1;

    .line 178
    .line 179
    new-instance p1, La0/b0;

    .line 180
    .line 181
    const/4 p2, 0x2

    .line 182
    invoke-direct {p1, p0, p2}, La0/b0;-><init>(Lu/v1;I)V

    .line 183
    .line 184
    .line 185
    iput-object p1, p0, Ld0/f0;->y:La0/b0;

    .line 186
    .line 187
    const/16 p1, 0xf

    .line 188
    .line 189
    const/4 p2, 0x0

    .line 190
    invoke-static {p2, p2, p1}, Lf3/b;->b(III)J

    .line 191
    .line 192
    .line 193
    move-result-wide p1

    .line 194
    iput-wide p1, p0, Ld0/f0;->z:J

    .line 195
    .line 196
    new-instance p1, Lb0/w0;

    .line 197
    .line 198
    invoke-direct {p1}, Lb0/w0;-><init>()V

    .line 199
    .line 200
    .line 201
    iput-object p1, p0, Ld0/f0;->A:Lb0/w0;

    .line 202
    .line 203
    invoke-static {}, Lb0/g0;->g()Lx0/w0;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iput-object p1, p0, Ld0/f0;->B:Lx0/w0;

    .line 208
    .line 209
    invoke-static {}, Lb0/g0;->g()Lx0/w0;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    iput-object p1, p0, Ld0/f0;->C:Lx0/w0;

    .line 214
    .line 215
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    iput-object p2, p0, Ld0/f0;->D:Lx0/e1;

    .line 222
    .line 223
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iput-object p2, p0, Ld0/f0;->E:Lx0/e1;

    .line 228
    .line 229
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    iput-object p2, p0, Ld0/f0;->F:Lx0/e1;

    .line 234
    .line 235
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, p0, Ld0/f0;->G:Lx0/e1;

    .line 240
    .line 241
    return-void
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
.end method

.method public static synthetic g(Ld0/d;ILac/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    invoke-static {v1, v0}, Lr/d;->q(ILjava/lang/Object;)Lr/z0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1, v0, p2}, Ld0/f0;->f(ILr/z0;Lac/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public static r(Ld0/f0;Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Ld0/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ld0/d0;

    .line 7
    .line 8
    iget v1, v0, Ld0/d0;->i:I

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
    iput v1, v0, Ld0/d0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ld0/d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ld0/d0;-><init>(Ld0/f0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ld0/d0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ld0/d0;->i:I

    .line 28
    .line 29
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Ld0/d0;->d:Ld0/f0;

    .line 42
    .line 43
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    iget-object p0, v0, Ld0/d0;->f:Lac/i;

    .line 56
    .line 57
    move-object p2, p0

    .line 58
    check-cast p2, Lic/n;

    .line 59
    .line 60
    iget-object p1, v0, Ld0/d0;->e:Ls/v0;

    .line 61
    .line 62
    iget-object p0, v0, Ld0/d0;->d:Ld0/f0;

    .line 63
    .line 64
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p0, v0, Ld0/d0;->d:Ld0/f0;

    .line 72
    .line 73
    iput-object p1, v0, Ld0/d0;->e:Ls/v0;

    .line 74
    .line 75
    move-object p3, p2

    .line 76
    check-cast p3, Lac/i;

    .line 77
    .line 78
    iput-object p3, v0, Ld0/d0;->f:Lac/i;

    .line 79
    .line 80
    iput v4, v0, Ld0/d0;->i:I

    .line 81
    .line 82
    iget-object p3, p0, Ld0/f0;->w:Lb0/e;

    .line 83
    .line 84
    invoke-virtual {p3, v0}, Lb0/e;->h(Lac/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-ne p3, v5, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-object p3, v2

    .line 92
    :goto_1
    if-ne p3, v5, :cond_5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    iget-object p3, p0, Ld0/f0;->k:Lu/k;

    .line 96
    .line 97
    invoke-virtual {p3}, Lu/k;->a()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-nez p3, :cond_6

    .line 102
    .line 103
    invoke-virtual {p0}, Ld0/f0;->j()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    iget-object v1, p0, Ld0/f0;->t:Lx0/b1;

    .line 108
    .line 109
    invoke-virtual {v1, p3}, Lx0/b1;->f(I)V

    .line 110
    .line 111
    .line 112
    :cond_6
    iget-object p3, p0, Ld0/f0;->k:Lu/k;

    .line 113
    .line 114
    iput-object p0, v0, Ld0/d0;->d:Ld0/f0;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    iput-object v1, v0, Ld0/d0;->e:Ls/v0;

    .line 118
    .line 119
    iput-object v1, v0, Ld0/d0;->f:Lac/i;

    .line 120
    .line 121
    iput v3, v0, Ld0/d0;->i:I

    .line 122
    .line 123
    invoke-virtual {p3, p1, p2, v0}, Lu/k;->b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v5, :cond_7

    .line 128
    .line 129
    :goto_3
    return-object v5

    .line 130
    :cond_7
    :goto_4
    const/4 p1, -0x1

    .line 131
    iget-object p0, p0, Ld0/f0;->s:Lx0/b1;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Lx0/b1;->f(I)V

    .line 134
    .line 135
    .line 136
    return-object v2
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


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->k:Lu/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu/k;->a()Z

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

.method public final b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ld0/f0;->r(Ld0/f0;Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->E:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->D:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final e(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->k:Lu/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu/k;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final f(ILr/z0;Lac/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Ld0/a0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Ld0/a0;

    .line 13
    .line 14
    iget v4, v3, Ld0/a0;->i:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Ld0/a0;->i:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Ld0/a0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Ld0/a0;-><init>(Ld0/f0;Lac/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Ld0/a0;->g:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Ld0/a0;->i:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    sget-object v6, Lub/a0;->a:Lub/a0;

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    sget-object v9, Lzb/a;->a:Lzb/a;

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v8, :cond_2

    .line 45
    .line 46
    if-ne v4, v7, :cond_1

    .line 47
    .line 48
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v6

    .line 52
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_2
    iget v1, v3, Ld0/a0;->f:I

    .line 61
    .line 62
    iget-object v4, v3, Ld0/a0;->e:Lr/z0;

    .line 63
    .line 64
    iget-object v8, v3, Ld0/a0;->d:Ld0/f0;

    .line 65
    .line 66
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v14, v4

    .line 70
    move-object v11, v8

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ld0/f0;->j()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-ne v1, v2, :cond_4

    .line 80
    .line 81
    iget-object v2, v0, Ld0/f0;->d:Ld0/y;

    .line 82
    .line 83
    iget-object v2, v2, Ld0/y;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Lx0/a1;

    .line 86
    .line 87
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    cmpg-float v2, v2, v5

    .line 92
    .line 93
    if-nez v2, :cond_4

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_4
    invoke-virtual {v0}, Ld0/f0;->l()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    iput-object v0, v3, Ld0/a0;->d:Ld0/f0;

    .line 104
    .line 105
    move-object/from16 v2, p2

    .line 106
    .line 107
    iput-object v2, v3, Ld0/a0;->e:Lr/z0;

    .line 108
    .line 109
    iput v1, v3, Ld0/a0;->f:I

    .line 110
    .line 111
    iput v8, v3, Ld0/a0;->i:I

    .line 112
    .line 113
    iget-object v4, v0, Ld0/f0;->w:Lb0/e;

    .line 114
    .line 115
    invoke-virtual {v4, v3}, Lb0/e;->h(Lac/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    if-ne v4, v9, :cond_6

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    move-object v4, v6

    .line 123
    :goto_1
    if-ne v4, v9, :cond_7

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    move-object v11, v0

    .line 127
    move-object v14, v2

    .line 128
    :goto_2
    float-to-double v12, v5

    .line 129
    const-wide/high16 v15, -0x4020000000000000L    # -0.5

    .line 130
    .line 131
    cmpg-double v2, v15, v12

    .line 132
    .line 133
    if-gtz v2, :cond_8

    .line 134
    .line 135
    const-wide/high16 v15, 0x3fe0000000000000L    # 0.5

    .line 136
    .line 137
    cmpg-double v2, v12, v15

    .line 138
    .line 139
    if-gtz v2, :cond_8

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v4, "pageOffsetFraction "

    .line 145
    .line 146
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v4, " is not within the range -0.5 to 0.5"

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2}, Lx/a;->a(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    invoke-virtual {v11, v1}, Ld0/f0;->i(I)I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    invoke-virtual {v11}, Ld0/f0;->n()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    int-to-float v1, v1

    .line 173
    mul-float v13, v5, v1

    .line 174
    .line 175
    new-instance v10, Ld0/b0;

    .line 176
    .line 177
    const/4 v15, 0x0

    .line 178
    invoke-direct/range {v10 .. v15}, Ld0/b0;-><init>(Ld0/f0;IFLr/j;Lyb/c;)V

    .line 179
    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    iput-object v1, v3, Ld0/a0;->d:Ld0/f0;

    .line 183
    .line 184
    iput-object v1, v3, Ld0/a0;->e:Lr/z0;

    .line 185
    .line 186
    iput v7, v3, Ld0/a0;->i:I

    .line 187
    .line 188
    sget-object v1, Ls/v0;->a:Ls/v0;

    .line 189
    .line 190
    invoke-virtual {v11, v1, v10, v3}, Ld0/f0;->b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    if-ne v1, v9, :cond_9

    .line 195
    .line 196
    :goto_4
    return-object v9

    .line 197
    :cond_9
    :goto_5
    return-object v6
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

.method public final h(Ld0/w;ZZ)V
    .locals 10

    .line 1
    iget-object v0, p1, Ld0/w;->i:Ld0/j;

    .line 2
    .line 3
    iget v1, p1, Ld0/w;->j:F

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-boolean v2, p0, Ld0/f0;->a:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Ld0/f0;->b:Ld0/w;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    iput-boolean v2, p0, Ld0/f0;->a:Z

    .line 18
    .line 19
    :cond_1
    iget-object p2, p0, Ld0/f0;->d:Ld0/y;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz p3, :cond_2

    .line 24
    .line 25
    iget-object p2, p2, Ld0/y;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p2, Lx0/a1;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Lx0/a1;->f(F)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p3, p1, Ld0/w;->a:Ljava/util/List;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v5, v0, Ld0/j;->d:Ljava/lang/Object;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move-object v5, v3

    .line 44
    :goto_0
    iput-object v5, p2, Ld0/y;->e:Ljava/lang/Object;

    .line 45
    .line 46
    iget-boolean v5, p2, Ld0/y;->a:Z

    .line 47
    .line 48
    if-nez v5, :cond_4

    .line 49
    .line 50
    move-object v5, p3

    .line 51
    check-cast v5, Ljava/util/Collection;

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_6

    .line 58
    .line 59
    :cond_4
    iput-boolean v2, p2, Ld0/y;->a:Z

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    iget v0, v0, Ld0/j;->a:I

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    const/4 v0, 0x0

    .line 67
    :goto_1
    iget-object v5, p2, Ld0/y;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, Lx0/b1;

    .line 70
    .line 71
    invoke-virtual {v5, v0}, Lx0/b1;->f(I)V

    .line 72
    .line 73
    .line 74
    iget-object v5, p2, Ld0/y;->f:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, Lb0/u0;

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Lb0/u0;->a(I)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p2, Ld0/y;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Lx0/a1;

    .line 84
    .line 85
    invoke-virtual {p2, v1}, Lx0/a1;->f(F)V

    .line 86
    .line 87
    .line 88
    :cond_6
    iget p2, p0, Ld0/f0;->m:I

    .line 89
    .line 90
    const/4 v0, -0x1

    .line 91
    if-eq p2, v0, :cond_9

    .line 92
    .line 93
    move-object p2, p3

    .line 94
    check-cast p2, Ljava/util/Collection;

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-nez p2, :cond_9

    .line 101
    .line 102
    iget-boolean p2, p0, Ld0/f0;->o:Z

    .line 103
    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-static {p3}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Ld0/j;

    .line 111
    .line 112
    iget p2, p2, Ld0/j;->a:I

    .line 113
    .line 114
    add-int/2addr p2, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    invoke-static {p3}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    check-cast p2, Ld0/j;

    .line 121
    .line 122
    iget p2, p2, Ld0/j;->a:I

    .line 123
    .line 124
    sub-int/2addr p2, v2

    .line 125
    :goto_2
    iget p3, p0, Ld0/f0;->m:I

    .line 126
    .line 127
    if-eq p3, p2, :cond_9

    .line 128
    .line 129
    iput v0, p0, Ld0/f0;->m:I

    .line 130
    .line 131
    iget-object p2, p0, Ld0/f0;->n:Lb0/y0;

    .line 132
    .line 133
    if-eqz p2, :cond_8

    .line 134
    .line 135
    invoke-interface {p2}, Lb0/y0;->cancel()V

    .line 136
    .line 137
    .line 138
    :cond_8
    iput-object v3, p0, Ld0/f0;->n:Lb0/y0;

    .line 139
    .line 140
    :cond_9
    :goto_3
    iget-object p2, p0, Ld0/f0;->p:Lx0/e1;

    .line 141
    .line 142
    invoke-virtual {p2, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-boolean p2, p1, Ld0/w;->l:Z

    .line 146
    .line 147
    iget p3, p1, Ld0/w;->k:I

    .line 148
    .line 149
    iget-object v0, p1, Ld0/w;->h:Ld0/j;

    .line 150
    .line 151
    iget-object v1, p0, Ld0/f0;->D:Lx0/e1;

    .line 152
    .line 153
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-virtual {v1, p2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    iget p2, v0, Ld0/j;->a:I

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_a
    const/4 p2, 0x0

    .line 166
    :goto_4
    if-nez p2, :cond_c

    .line 167
    .line 168
    if-eqz p3, :cond_b

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_b
    const/4 p2, 0x0

    .line 172
    goto :goto_6

    .line 173
    :cond_c
    :goto_5
    const/4 p2, 0x1

    .line 174
    :goto_6
    iget-object v1, p0, Ld0/f0;->E:Lx0/e1;

    .line 175
    .line 176
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {v1, p2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    if-eqz v0, :cond_d

    .line 184
    .line 185
    iget p2, v0, Ld0/j;->a:I

    .line 186
    .line 187
    iput p2, p0, Ld0/f0;->e:I

    .line 188
    .line 189
    :cond_d
    iput p3, p0, Ld0/f0;->f:I

    .line 190
    .line 191
    invoke-static {}, Lh1/t;->d()Lh1/g;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    if-eqz p2, :cond_e

    .line 196
    .line 197
    invoke-virtual {p2}, Lh1/g;->e()Lic/k;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    :cond_e
    invoke-static {p2}, Lh1/t;->g(Lh1/g;)Lh1/g;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    :try_start_0
    iget v0, p0, Ld0/f0;->j:F

    .line 206
    .line 207
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    const/high16 v1, 0x3f000000    # 0.5f

    .line 212
    .line 213
    const/16 v5, 0x20

    .line 214
    .line 215
    const-wide v6, 0xffffffffL

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    cmpl-float v0, v0, v1

    .line 221
    .line 222
    if-lez v0, :cond_12

    .line 223
    .line 224
    iget-boolean v0, p0, Ld0/f0;->l:Z

    .line 225
    .line 226
    if-eqz v0, :cond_12

    .line 227
    .line 228
    iget v0, p0, Ld0/f0;->j:F

    .line 229
    .line 230
    invoke-virtual {p0}, Ld0/f0;->k()Ld0/w;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-object v1, v1, Ld0/w;->e:Lu/e1;

    .line 235
    .line 236
    sget-object v8, Lu/e1;->a:Lu/e1;

    .line 237
    .line 238
    if-ne v1, v8, :cond_f

    .line 239
    .line 240
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    invoke-virtual {p0}, Ld0/f0;->o()J

    .line 245
    .line 246
    .line 247
    move-result-wide v8

    .line 248
    and-long/2addr v8, v6

    .line 249
    long-to-int v1, v8

    .line 250
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    neg-float v1, v1

    .line 255
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    cmpg-float v0, v0, v1

    .line 260
    .line 261
    if-nez v0, :cond_10

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_f
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-virtual {p0}, Ld0/f0;->o()J

    .line 269
    .line 270
    .line 271
    move-result-wide v8

    .line 272
    shr-long/2addr v8, v5

    .line 273
    long-to-int v1, v8

    .line 274
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    neg-float v1, v1

    .line 279
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    cmpg-float v0, v0, v1

    .line 284
    .line 285
    if-nez v0, :cond_10

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_10
    invoke-virtual {p0}, Ld0/f0;->p()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_11

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_11
    const/4 v2, 0x0

    .line 296
    :goto_7
    if-eqz v2, :cond_12

    .line 297
    .line 298
    iget v0, p0, Ld0/f0;->j:F

    .line 299
    .line 300
    invoke-virtual {p0, v0, p1}, Ld0/f0;->q(FLd0/w;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :catchall_0
    move-exception p1

    .line 305
    goto :goto_b

    .line 306
    :cond_12
    :goto_8
    invoke-static {p2, p3, v3}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0}, Ld0/f0;->l()I

    .line 310
    .line 311
    .line 312
    move-result p2

    .line 313
    invoke-static {p1, p2}, Ld0/j0;->a(Ld0/w;I)J

    .line 314
    .line 315
    .line 316
    move-result-wide p2

    .line 317
    iput-wide p2, p0, Ld0/f0;->g:J

    .line 318
    .line 319
    invoke-virtual {p0}, Ld0/f0;->l()I

    .line 320
    .line 321
    .line 322
    iget-object p2, p1, Ld0/w;->e:Lu/e1;

    .line 323
    .line 324
    sget-object p3, Lu/e1;->b:Lu/e1;

    .line 325
    .line 326
    if-ne p2, p3, :cond_13

    .line 327
    .line 328
    invoke-virtual {p1}, Ld0/w;->c()J

    .line 329
    .line 330
    .line 331
    move-result-wide p2

    .line 332
    shr-long/2addr p2, v5

    .line 333
    :goto_9
    long-to-int p3, p2

    .line 334
    goto :goto_a

    .line 335
    :cond_13
    invoke-virtual {p1}, Ld0/w;->c()J

    .line 336
    .line 337
    .line 338
    move-result-wide p2

    .line 339
    and-long/2addr p2, v6

    .line 340
    goto :goto_9

    .line 341
    :goto_a
    iget-object p1, p1, Ld0/w;->m:Lv/k;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {v4, v4, p3}, Lnh/b;->k(III)I

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    int-to-long p1, p1

    .line 351
    iput-wide p1, p0, Ld0/f0;->h:J

    .line 352
    .line 353
    return-void

    .line 354
    :goto_b
    invoke-static {p2, p3, v3}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 355
    .line 356
    .line 357
    throw p1
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

.method public final i(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld0/f0;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ld0/f0;->l()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, Lnh/b;->k(III)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    return v1
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

.method public final j()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->d:Ld0/y;

    .line 2
    .line 3
    iget-object v0, v0, Ld0/y;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lx0/b1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public final k()Ld0/w;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->p:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld0/w;

    .line 8
    .line 9
    return-object v0
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

.method public abstract l()I
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/f0;->p:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld0/w;

    .line 8
    .line 9
    iget v0, v0, Ld0/w;->b:I

    .line 10
    .line 11
    return v0
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

.method public final n()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld0/f0;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ld0/f0;->p:Lx0/e1;

    .line 6
    .line 7
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ld0/w;

    .line 12
    .line 13
    iget v1, v1, Ld0/w;->c:I

    .line 14
    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
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

.method public final o()J
    .locals 2

    .line 1
    iget-object v0, p0, Ld0/f0;->c:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp1/b;

    .line 8
    .line 9
    iget-wide v0, v0, Lp1/b;->a:J

    .line 10
    .line 11
    return-wide v0
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

.method public final p()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld0/f0;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v1, v0

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ld0/f0;->o()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide v2, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    long-to-int v1, v0

    .line 27
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    float-to-int v0, v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    return v0
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

.method public final q(FLd0/w;)V
    .locals 6

    .line 1
    iget-object v0, p2, Ld0/w;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-boolean v1, p0, Ld0/f0;->l:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_6

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    cmpl-float v1, p1, v1

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ld0/j;

    .line 34
    .line 35
    iget v3, v3, Ld0/j;->a:I

    .line 36
    .line 37
    add-int/2addr v3, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {v0}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ld0/j;

    .line 44
    .line 45
    iget v3, v3, Ld0/j;->a:I

    .line 46
    .line 47
    sub-int/2addr v3, v2

    .line 48
    :goto_1
    if-ltz v3, :cond_6

    .line 49
    .line 50
    invoke-virtual {p0}, Ld0/f0;->l()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-ge v3, v2, :cond_6

    .line 55
    .line 56
    iget v2, p0, Ld0/f0;->m:I

    .line 57
    .line 58
    if-eq v3, v2, :cond_4

    .line 59
    .line 60
    iget-boolean v2, p0, Ld0/f0;->o:Z

    .line 61
    .line 62
    if-eq v2, v1, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, Ld0/f0;->n:Lb0/y0;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-interface {v2}, Lb0/y0;->cancel()V

    .line 69
    .line 70
    .line 71
    :cond_3
    iput-boolean v1, p0, Ld0/f0;->o:Z

    .line 72
    .line 73
    iput v3, p0, Ld0/f0;->m:I

    .line 74
    .line 75
    iget-object v2, p0, Ld0/f0;->u:Lb0/z0;

    .line 76
    .line 77
    iget-wide v4, p0, Ld0/f0;->z:J

    .line 78
    .line 79
    invoke-virtual {v2, v3, v4, v5}, Lb0/z0;->a(IJ)Lb0/y0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput-object v2, p0, Ld0/f0;->n:Lb0/y0;

    .line 84
    .line 85
    :cond_4
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-static {v0}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ld0/j;

    .line 92
    .line 93
    iget v1, p2, Ld0/w;->b:I

    .line 94
    .line 95
    iget v2, p2, Ld0/w;->c:I

    .line 96
    .line 97
    add-int/2addr v1, v2

    .line 98
    iget v0, v0, Ld0/j;->l:I

    .line 99
    .line 100
    add-int/2addr v0, v1

    .line 101
    iget p2, p2, Ld0/w;->g:I

    .line 102
    .line 103
    sub-int/2addr v0, p2

    .line 104
    int-to-float p2, v0

    .line 105
    cmpg-float p1, p2, p1

    .line 106
    .line 107
    if-gez p1, :cond_6

    .line 108
    .line 109
    iget-object p1, p0, Ld0/f0;->n:Lb0/y0;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    invoke-interface {p1}, Lb0/y0;->a()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    invoke-static {v0}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Ld0/j;

    .line 122
    .line 123
    iget p2, p2, Ld0/w;->f:I

    .line 124
    .line 125
    iget v0, v0, Ld0/j;->l:I

    .line 126
    .line 127
    sub-int/2addr p2, v0

    .line 128
    int-to-float p2, p2

    .line 129
    neg-float p1, p1

    .line 130
    cmpg-float p1, p2, p1

    .line 131
    .line 132
    if-gez p1, :cond_6

    .line 133
    .line 134
    iget-object p1, p0, Ld0/f0;->n:Lb0/y0;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-interface {p1}, Lb0/y0;->a()V

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_2
    return-void
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

.method public final s(FIZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld0/f0;->d:Ld0/y;

    .line 2
    .line 3
    iget-object v1, v0, Ld0/y;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lx0/b1;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Lx0/b1;->f(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Ld0/y;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lb0/u0;

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Lb0/u0;->a(I)V

    .line 15
    .line 16
    .line 17
    iget-object p2, v0, Ld0/y;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Lx0/a1;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lx0/a1;->f(F)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, v0, Ld0/y;->e:Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Ld0/f0;->x:Lx0/e1;

    .line 30
    .line 31
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Li2/j0;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Li2/j0;->k()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :cond_1
    iget-object p1, p0, Ld0/f0;->C:Lx0/w0;

    .line 44
    .line 45
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 46
    .line 47
    invoke-interface {p1, p2}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
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
