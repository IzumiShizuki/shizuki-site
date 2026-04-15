.class public final Lb0/g1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lb0/g1;->b:I

    iput p1, p0, Lb0/g1;->c:F

    iput-object p2, p0, Lb0/g1;->d:Ljava/lang/Object;

    iput-object p3, p0, Lb0/g1;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lu/q2;FLic/k;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb0/g1;->b:I

    .line 2
    iput-object p1, p0, Lb0/g1;->d:Ljava/lang/Object;

    iput p2, p0, Lb0/g1;->c:F

    iput-object p3, p0, Lb0/g1;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lb0/g1;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Lb0/g1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lu/q2;

    .line 15
    .line 16
    iget-wide v2, p1, Lu/q2;->b:J

    .line 17
    .line 18
    const-wide/high16 v4, -0x8000000000000000L

    .line 19
    .line 20
    cmp-long v6, v2, v4

    .line 21
    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    iput-wide v0, p1, Lu/q2;->b:J

    .line 25
    .line 26
    :cond_0
    new-instance v10, Lr/l;

    .line 27
    .line 28
    iget v2, p1, Lu/q2;->e:F

    .line 29
    .line 30
    invoke-direct {v10, v2}, Lr/l;-><init>(F)V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    sget-object v11, Lu/q2;->f:Lr/l;

    .line 35
    .line 36
    iget v4, p0, Lb0/g1;->c:F

    .line 37
    .line 38
    cmpg-float v3, v4, v3

    .line 39
    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    iget-object v3, p1, Lu/q2;->a:Lr/x1;

    .line 43
    .line 44
    new-instance v4, Lr/l;

    .line 45
    .line 46
    invoke-direct {v4, v2}, Lr/l;-><init>(F)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p1, Lu/q2;->c:Lr/l;

    .line 50
    .line 51
    invoke-interface {v3, v4, v11, v2}, Lr/x1;->n(Lr/p;Lr/p;Lr/p;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    :goto_0
    move-wide v8, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-wide v2, p1, Lu/q2;->b:J

    .line 58
    .line 59
    sub-long v2, v0, v2

    .line 60
    .line 61
    long-to-float v2, v2

    .line 62
    div-float/2addr v2, v4

    .line 63
    float-to-double v2, v2

    .line 64
    invoke-static {v2, v3}, Llc/b;->S(D)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    goto :goto_0

    .line 69
    :goto_1
    iget-object v7, p1, Lu/q2;->a:Lr/x1;

    .line 70
    .line 71
    iget-object v12, p1, Lu/q2;->c:Lr/l;

    .line 72
    .line 73
    invoke-interface/range {v7 .. v12}, Lr/x1;->g(JLr/p;Lr/p;Lr/p;)Lr/p;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lr/l;

    .line 78
    .line 79
    iget v2, v2, Lr/l;->a:F

    .line 80
    .line 81
    iget-object v7, p1, Lu/q2;->a:Lr/x1;

    .line 82
    .line 83
    iget-object v12, p1, Lu/q2;->c:Lr/l;

    .line 84
    .line 85
    invoke-interface/range {v7 .. v12}, Lr/x1;->H(JLr/p;Lr/p;Lr/p;)Lr/p;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Lr/l;

    .line 90
    .line 91
    iput-object v3, p1, Lu/q2;->c:Lr/l;

    .line 92
    .line 93
    iput-wide v0, p1, Lu/q2;->b:J

    .line 94
    .line 95
    iget v0, p1, Lu/q2;->e:F

    .line 96
    .line 97
    sub-float/2addr v0, v2

    .line 98
    iput v2, p1, Lu/q2;->e:F

    .line 99
    .line 100
    iget-object p1, p0, Lb0/g1;->e:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Lic/k;

    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {p1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_0
    check-cast p1, Li2/l0;

    .line 115
    .line 116
    invoke-virtual {p1}, Li2/l0;->b()V

    .line 117
    .line 118
    .line 119
    iget v0, p0, Lb0/g1;->c:F

    .line 120
    .line 121
    iget-object v1, p0, Lb0/g1;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lq1/f;

    .line 124
    .line 125
    iget-object v2, p0, Lb0/g1;->e:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Lq1/k;

    .line 128
    .line 129
    iget-object p1, p1, Li2/l0;->a:Ls1/b;

    .line 130
    .line 131
    iget-object v3, p1, Ls1/b;->b:Lc7/e1;

    .line 132
    .line 133
    invoke-virtual {v3}, Lc7/e1;->D()J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    invoke-virtual {v3}, Lc7/e1;->z()Lq1/o;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-interface {v6}, Lq1/o;->f()V

    .line 142
    .line 143
    .line 144
    :try_start_0
    iget-object v6, v3, Lc7/e1;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v6, Lr/y1;

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-virtual {v6, v0, v7}, Lr/y1;->i0(FF)V

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x42340000    # 45.0f

    .line 153
    .line 154
    const-wide/16 v7, 0x0

    .line 155
    .line 156
    invoke-virtual {v6, v0, v7, v8}, Lr/y1;->f0(FJ)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v1, v2}, Ls1/b;->f(Lq1/f;Lq1/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    invoke-static {v3, v4, v5}, Lq/t0;->L(Lc7/e1;J)V

    .line 163
    .line 164
    .line 165
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 166
    .line 167
    return-object p1

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    move-object p1, v0

    .line 170
    invoke-static {v3, v4, v5}, Lq/t0;->L(Lc7/e1;J)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :pswitch_1
    check-cast p1, Lr/i;

    .line 175
    .line 176
    iget-object v0, p0, Lb0/g1;->d:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Ljc/v;

    .line 179
    .line 180
    iget v1, p0, Lb0/g1;->c:F

    .line 181
    .line 182
    const/4 v2, 0x0

    .line 183
    cmpl-float v3, v1, v2

    .line 184
    .line 185
    if-lez v3, :cond_3

    .line 186
    .line 187
    iget-object v2, p1, Lr/i;->e:Lx0/e1;

    .line 188
    .line 189
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Ljava/lang/Number;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    cmpl-float v3, v2, v1

    .line 200
    .line 201
    if-lez v3, :cond_2

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_2
    move v1, v2

    .line 205
    :goto_2
    move v2, v1

    .line 206
    goto :goto_3

    .line 207
    :cond_3
    cmpg-float v3, v1, v2

    .line 208
    .line 209
    if-gez v3, :cond_4

    .line 210
    .line 211
    iget-object v2, p1, Lr/i;->e:Lx0/e1;

    .line 212
    .line 213
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    cmpg-float v3, v2, v1

    .line 224
    .line 225
    if-gez v3, :cond_2

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_4
    :goto_3
    iget v1, v0, Ljc/v;->a:F

    .line 229
    .line 230
    sub-float v1, v2, v1

    .line 231
    .line 232
    iget-object v3, p0, Lb0/g1;->e:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, La0/w;

    .line 235
    .line 236
    invoke-interface {v3, v1}, Lu/k1;->a(F)F

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    cmpg-float v3, v1, v3

    .line 241
    .line 242
    if-nez v3, :cond_5

    .line 243
    .line 244
    iget-object v3, p1, Lr/i;->e:Lx0/e1;

    .line 245
    .line 246
    invoke-virtual {v3}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    check-cast v3, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    cmpg-float v2, v2, v3

    .line 257
    .line 258
    if-nez v2, :cond_5

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_5
    invoke-virtual {p1}, Lr/i;->a()V

    .line 262
    .line 263
    .line 264
    :goto_4
    iget p1, v0, Ljc/v;->a:F

    .line 265
    .line 266
    add-float/2addr p1, v1

    .line 267
    iput p1, v0, Ljc/v;->a:F

    .line 268
    .line 269
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 270
    .line 271
    return-object p1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
