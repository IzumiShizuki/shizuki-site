.class public final Ld0/c0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ld0/f0;


# direct methods
.method public synthetic constructor <init>(Ld0/f0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld0/c0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Ld0/c0;->c:Ld0/f0;

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
    .locals 13

    .line 1
    iget v0, p0, Ld0/c0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Ld0/c0;->c:Ld0/f0;

    .line 13
    .line 14
    invoke-static {v0}, Lgh/g;->r(Ld0/f0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iget v3, v0, Ld0/f0;->i:F

    .line 19
    .line 20
    add-float/2addr v3, p1

    .line 21
    float-to-double v4, v3

    .line 22
    invoke-static {v4, v5}, Llc/b;->S(D)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    long-to-float v6, v4

    .line 27
    sub-float/2addr v3, v6

    .line 28
    iput v3, v0, Ld0/f0;->i:F

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const v6, 0x38d1b717    # 1.0E-4f

    .line 35
    .line 36
    .line 37
    cmpg-float v3, v3, v6

    .line 38
    .line 39
    if-gez v3, :cond_0

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_0
    add-long v6, v1, v4

    .line 44
    .line 45
    iget-wide v8, v0, Ld0/f0;->h:J

    .line 46
    .line 47
    iget-wide v10, v0, Ld0/f0;->g:J

    .line 48
    .line 49
    invoke-static/range {v6 .. v11}, Lnh/b;->l(JJJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v8, 0x1

    .line 55
    cmp-long v9, v6, v3

    .line 56
    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    const/4 v6, 0x1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v6, 0x0

    .line 62
    :goto_0
    sub-long/2addr v3, v1

    .line 63
    long-to-float v1, v3

    .line 64
    iput v1, v0, Ld0/f0;->j:F

    .line 65
    .line 66
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    const-wide/16 v11, 0x0

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    cmp-long v7, v9, v11

    .line 74
    .line 75
    if-eqz v7, :cond_4

    .line 76
    .line 77
    iget-object v7, v0, Ld0/f0;->F:Lx0/e1;

    .line 78
    .line 79
    cmpl-float v9, v1, v2

    .line 80
    .line 81
    if-lez v9, :cond_2

    .line 82
    .line 83
    const/4 v9, 0x1

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/4 v9, 0x0

    .line 86
    :goto_1
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-virtual {v7, v9}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v7, v0, Ld0/f0;->G:Lx0/e1;

    .line 94
    .line 95
    cmpg-float v1, v1, v2

    .line 96
    .line 97
    if-gez v1, :cond_3

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    :cond_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v7, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v1, v0, Ld0/f0;->p:Lx0/e1;

    .line 108
    .line 109
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ld0/w;

    .line 114
    .line 115
    long-to-int v5, v3

    .line 116
    neg-int v7, v5

    .line 117
    invoke-virtual {v1, v7}, Ld0/w;->a(I)Ld0/w;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    iget-object v9, v0, Ld0/f0;->b:Ld0/w;

    .line 124
    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    invoke-virtual {v9, v7}, Ld0/w;->a(I)Ld0/w;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-eqz v7, :cond_5

    .line 132
    .line 133
    iput-object v7, v0, Ld0/f0;->b:Ld0/w;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/4 v1, 0x0

    .line 137
    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    .line 138
    .line 139
    iget-boolean v2, v0, Ld0/f0;->a:Z

    .line 140
    .line 141
    invoke-virtual {v0, v1, v2, v8}, Ld0/f0;->h(Ld0/w;ZZ)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, Ld0/f0;->B:Lx0/w0;

    .line 145
    .line 146
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 147
    .line 148
    invoke-interface {v0, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    iget-object v1, v0, Ld0/f0;->d:Ld0/y;

    .line 153
    .line 154
    iget-object v7, v1, Ld0/y;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v7, Ld0/f0;

    .line 157
    .line 158
    iget-object v1, v1, Ld0/y;->d:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Lx0/a1;

    .line 161
    .line 162
    invoke-virtual {v7}, Ld0/f0;->n()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-nez v8, :cond_8

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    int-to-float v2, v5

    .line 170
    invoke-virtual {v7}, Ld0/f0;->n()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    int-to-float v5, v5

    .line 175
    div-float/2addr v2, v5

    .line 176
    :goto_3
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    add-float/2addr v5, v2

    .line 181
    invoke-virtual {v1, v5}, Lx0/a1;->f(F)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v0, Ld0/f0;->x:Lx0/e1;

    .line 185
    .line 186
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Li2/j0;

    .line 191
    .line 192
    if-eqz v0, :cond_9

    .line 193
    .line 194
    invoke-virtual {v0}, Li2/j0;->k()V

    .line 195
    .line 196
    .line 197
    :cond_9
    :goto_4
    if-eqz v6, :cond_a

    .line 198
    .line 199
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    goto :goto_5

    .line 204
    :cond_a
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    :goto_6
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :pswitch_0
    check-cast p1, Lb0/x0;

    .line 218
    .line 219
    iget-object v0, p0, Ld0/c0;->c:Ld0/f0;

    .line 220
    .line 221
    invoke-static {}, Lh1/t;->d()Lh1/g;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    if-eqz v1, :cond_b

    .line 226
    .line 227
    invoke-virtual {v1}, Lh1/g;->e()Lic/k;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    goto :goto_7

    .line 232
    :cond_b
    const/4 v2, 0x0

    .line 233
    :goto_7
    invoke-static {v1}, Lh1/t;->g(Lh1/g;)Lh1/g;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    :try_start_0
    iget v6, v0, Ld0/f0;->e:I

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    sget-wide v7, Lb0/a1;->a:J

    .line 243
    .line 244
    iget-object v0, p1, Lb0/x0;->b:Lb0/z0;

    .line 245
    .line 246
    iget-object v5, v0, Lb0/z0;->c:Lc7/e1;

    .line 247
    .line 248
    if-nez v5, :cond_c

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_c
    iget-object p1, p1, Lb0/x0;->a:Ljava/util/ArrayList;

    .line 252
    .line 253
    iget-object v9, v0, Lb0/z0;->b:Lb0/w1;

    .line 254
    .line 255
    new-instance v4, Lb0/v1;

    .line 256
    .line 257
    invoke-direct/range {v4 .. v9}, Lb0/v1;-><init>(Lc7/e1;IJLb0/w1;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    .line 262
    .line 263
    :goto_8
    invoke-static {v1, v3, v2}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 264
    .line 265
    .line 266
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 267
    .line 268
    return-object p1

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    move-object p1, v0

    .line 271
    invoke-static {v1, v3, v2}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 272
    .line 273
    .line 274
    throw p1

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
