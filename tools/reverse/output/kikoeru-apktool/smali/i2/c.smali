.class public final Li2/c;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/z;
.implements Li2/p;
.implements Li2/y1;
.implements Li2/u1;
.implements Lh2/e;
.implements Lh2/f;
.implements Li2/s1;
.implements Li2/y;
.implements Li2/q;
.implements Lo1/e;
.implements Lo1/p;
.implements Lo1/s;
.implements Li2/q1;
.implements Ln1/a;


# instance fields
.field public o:Lj1/o;

.field public p:Lh2/a;

.field public q:Ljava/util/HashSet;


# virtual methods
.method public final synthetic A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public final B(Lg2/c0;)V
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

.method public final B0(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "initializeModifier called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 11
    .line 12
    iget v1, p0, Lj1/p;->c:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x20

    .line 15
    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    instance-of v1, v0, Lh2/c;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    new-instance v1, Li2/b;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v2}, Li2/b;-><init>(Li2/c;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lj2/v;

    .line 33
    .line 34
    iget-object v2, v2, Lj2/v;->N0:Lo/g0;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lo/g0;->f(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ltz v3, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2, v1}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    instance-of v1, v0, Ly/s0;

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    move-object v1, v0

    .line 51
    check-cast v1, Ly/s0;

    .line 52
    .line 53
    iget-object v2, p0, Li2/c;->p:Lh2/a;

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    sget-object v3, Ly/u1;->a:Lh2/g;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lh2/a;->C(Lh2/g;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    iput-object v1, v2, Lh2/a;->d:Ly/s0;

    .line 66
    .line 67
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lj2/v;

    .line 72
    .line 73
    invoke-virtual {v1}, Lj2/v;->getModifierLocalManager()Lh2/d;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, v1, Lh2/d;->b:Lz0/e;

    .line 78
    .line 79
    invoke-virtual {v2, p0}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v2, v1, Lh2/d;->c:Lz0/e;

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lh2/d;->a()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    new-instance v2, Lh2/a;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v1, v2, Lh2/a;->d:Ly/s0;

    .line 97
    .line 98
    iput-object v2, p0, Li2/c;->p:Lh2/a;

    .line 99
    .line 100
    invoke-static {p0}, Li2/f;->d(Li2/c;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lj2/v;

    .line 111
    .line 112
    invoke-virtual {v1}, Lj2/v;->getModifierLocalManager()Lh2/d;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    sget-object v2, Ly/u1;->a:Lh2/g;

    .line 117
    .line 118
    iget-object v3, v1, Lh2/d;->b:Lz0/e;

    .line 119
    .line 120
    invoke-virtual {v3, p0}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, v1, Lh2/d;->c:Lz0/e;

    .line 124
    .line 125
    invoke-virtual {v3, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Lh2/d;->a()V

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_1
    iget v1, p0, Lj1/p;->c:I

    .line 132
    .line 133
    and-int/lit8 v1, v1, 0x4

    .line 134
    .line 135
    const/4 v2, 0x2

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    if-nez p1, :cond_5

    .line 139
    .line 140
    invoke-static {p0, v2}, Li2/f;->v(Li2/m;I)Li2/g1;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Li2/g1;->T0()V

    .line 145
    .line 146
    .line 147
    :cond_5
    iget v1, p0, Lj1/p;->c:I

    .line 148
    .line 149
    and-int/2addr v1, v2

    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    invoke-static {p0}, Li2/f;->d(Li2/c;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_6

    .line 157
    .line 158
    iget-object v1, p0, Lj1/p;->h:Li2/g1;

    .line 159
    .line 160
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object v3, v1

    .line 164
    check-cast v3, Li2/c0;

    .line 165
    .line 166
    invoke-virtual {v3, p0}, Li2/c0;->p1(Li2/z;)V

    .line 167
    .line 168
    .line 169
    iget-object v1, v1, Li2/g1;->K:Li2/o1;

    .line 170
    .line 171
    if-eqz v1, :cond_6

    .line 172
    .line 173
    invoke-interface {v1}, Li2/o1;->invalidate()V

    .line 174
    .line 175
    .line 176
    :cond_6
    if-nez p1, :cond_7

    .line 177
    .line 178
    invoke-static {p0, v2}, Li2/f;->v(Li2/m;I)Li2/g1;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Li2/g1;->T0()V

    .line 183
    .line 184
    .line 185
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p1}, Li2/j0;->E()V

    .line 190
    .line 191
    .line 192
    :cond_7
    instance-of p1, v0, La0/b0;

    .line 193
    .line 194
    if-eqz p1, :cond_8

    .line 195
    .line 196
    move-object p1, v0

    .line 197
    check-cast p1, La0/b0;

    .line 198
    .line 199
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget v2, p1, La0/b0;->a:I

    .line 204
    .line 205
    packed-switch v2, :pswitch_data_0

    .line 206
    .line 207
    .line 208
    iget-object p1, p1, La0/b0;->b:Lu/v1;

    .line 209
    .line 210
    check-cast p1, Ld0/f0;

    .line 211
    .line 212
    iget-object p1, p1, Ld0/f0;->x:Lx0/e1;

    .line 213
    .line 214
    invoke-virtual {p1, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :pswitch_0
    iget-object p1, p1, La0/b0;->b:Lu/v1;

    .line 219
    .line 220
    check-cast p1, Lc0/z;

    .line 221
    .line 222
    iput-object v1, p1, Lc0/z;->h:Li2/j0;

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :pswitch_1
    iget-object p1, p1, La0/b0;->b:Lu/v1;

    .line 226
    .line 227
    check-cast p1, La0/g0;

    .line 228
    .line 229
    iput-object v1, p1, La0/g0;->j:Li2/j0;

    .line 230
    .line 231
    :cond_8
    :goto_2
    iget p1, p0, Lj1/p;->c:I

    .line 232
    .line 233
    and-int/lit16 p1, p1, 0x100

    .line 234
    .line 235
    if-eqz p1, :cond_9

    .line 236
    .line 237
    instance-of p1, v0, Lb0/e;

    .line 238
    .line 239
    if-eqz p1, :cond_9

    .line 240
    .line 241
    invoke-static {p0}, Li2/f;->d(Li2/c;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_9

    .line 246
    .line 247
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, Li2/j0;->E()V

    .line 252
    .line 253
    .line 254
    :cond_9
    iget p1, p0, Lj1/p;->c:I

    .line 255
    .line 256
    and-int/lit8 v1, p1, 0x10

    .line 257
    .line 258
    if-eqz v1, :cond_a

    .line 259
    .line 260
    instance-of v1, v0, Lc2/z;

    .line 261
    .line 262
    if-eqz v1, :cond_a

    .line 263
    .line 264
    check-cast v0, Lc2/z;

    .line 265
    .line 266
    iget-object v0, v0, Lc2/z;->d:Lb0/w1;

    .line 267
    .line 268
    iget-object v1, p0, Lj1/p;->h:Li2/g1;

    .line 269
    .line 270
    iput-object v1, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 271
    .line 272
    :cond_a
    and-int/lit8 p1, p1, 0x8

    .line 273
    .line 274
    if-eqz p1, :cond_b

    .line 275
    .line 276
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    check-cast p1, Lj2/v;

    .line 281
    .line 282
    invoke-virtual {p1}, Lj2/v;->F()V

    .line 283
    .line 284
    .line 285
    :cond_b
    return-void

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final C0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "unInitializeModifier called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 11
    .line 12
    iget v1, p0, Lj1/p;->c:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x20

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    instance-of v1, v0, Ly/s0;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lj2/v;

    .line 27
    .line 28
    invoke-virtual {v1}, Lj2/v;->getModifierLocalManager()Lh2/d;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Ly/u1;->a:Lh2/g;

    .line 33
    .line 34
    iget-object v3, v1, Lh2/d;->d:Lz0/e;

    .line 35
    .line 36
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v3, v4}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v1, Lh2/d;->e:Lz0/e;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lh2/d;->a()V

    .line 49
    .line 50
    .line 51
    :cond_1
    instance-of v1, v0, Lh2/c;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    check-cast v0, Lh2/c;

    .line 56
    .line 57
    sget-object v1, Li2/f;->a:Li2/d;

    .line 58
    .line 59
    invoke-interface {v0, v1}, Lh2/c;->i(Lh2/f;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget v0, p0, Lj1/p;->c:I

    .line 63
    .line 64
    and-int/lit8 v0, v0, 0x8

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lj2/v;

    .line 73
    .line 74
    invoke-virtual {v0}, Lj2/v;->F()V

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void
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

.method public final D0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li2/c;->q:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lj2/v;

    .line 15
    .line 16
    invoke-virtual {v0}, Lj2/v;->getSnapshotObserver()Li2/r1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Li2/e;->c:Li2/e;

    .line 21
    .line 22
    new-instance v2, Li2/b;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, p0, v3}, Li2/b;-><init>(Li2/c;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v1, v2}, Li2/r1;->a(Li2/q1;Lic/k;Lic/a;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
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

.method public final G()V
    .locals 0

    .line 1
    invoke-static {p0}, Li2/f;->m(Li2/p;)V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method

.method public final H()V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lc2/z;

    .line 9
    .line 10
    iget-object v0, v0, Lc2/z;->d:Lb0/w1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final K()La2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c;->p:Lh2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, Lh2/b;->d:Lh2/b;

    .line 7
    .line 8
    return-object v0
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

.method public final L(Lq2/k;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li2/c;->o:Lj1/o;

    .line 6
    .line 7
    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    .line 8
    .line 9
    invoke-static {v2, v3}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v2, Lq2/l;

    .line 13
    .line 14
    invoke-interface {v2}, Lq2/l;->j()Lq2/k;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    .line 19
    .line 20
    invoke-static {v1, v3}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v1, Lq2/k;->a:Lo/k0;

    .line 24
    .line 25
    iget-boolean v4, v2, Lq2/k;->c:Z

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    iput-boolean v5, v1, Lq2/k;->c:Z

    .line 31
    .line 32
    :cond_0
    iget-boolean v4, v2, Lq2/k;->d:Z

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iput-boolean v5, v1, Lq2/k;->d:Z

    .line 37
    .line 38
    :cond_1
    iget-object v1, v2, Lq2/k;->a:Lo/k0;

    .line 39
    .line 40
    iget-object v2, v1, Lo/k0;->b:[Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v4, v1, Lo/k0;->c:[Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v1, v1, Lo/k0;->a:[J

    .line 45
    .line 46
    array-length v5, v1

    .line 47
    add-int/lit8 v5, v5, -0x2

    .line 48
    .line 49
    if-ltz v5, :cond_8

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    :goto_0
    aget-wide v8, v1, v7

    .line 53
    .line 54
    not-long v10, v8

    .line 55
    const/4 v12, 0x7

    .line 56
    shl-long/2addr v10, v12

    .line 57
    and-long/2addr v10, v8

    .line 58
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v10, v12

    .line 64
    cmp-long v14, v10, v12

    .line 65
    .line 66
    if-eqz v14, :cond_7

    .line 67
    .line 68
    sub-int v10, v7, v5

    .line 69
    .line 70
    not-int v10, v10

    .line 71
    ushr-int/lit8 v10, v10, 0x1f

    .line 72
    .line 73
    const/16 v11, 0x8

    .line 74
    .line 75
    rsub-int/lit8 v10, v10, 0x8

    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    :goto_1
    if-ge v12, v10, :cond_6

    .line 79
    .line 80
    const-wide/16 v13, 0xff

    .line 81
    .line 82
    and-long/2addr v13, v8

    .line 83
    const-wide/16 v15, 0x80

    .line 84
    .line 85
    cmp-long v17, v13, v15

    .line 86
    .line 87
    if-gez v17, :cond_5

    .line 88
    .line 89
    shl-int/lit8 v13, v7, 0x3

    .line 90
    .line 91
    add-int/2addr v13, v12

    .line 92
    aget-object v14, v2, v13

    .line 93
    .line 94
    aget-object v13, v4, v13

    .line 95
    .line 96
    check-cast v14, Lq2/w;

    .line 97
    .line 98
    invoke-virtual {v3, v14}, Lo/k0;->b(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    if-nez v15, :cond_2

    .line 103
    .line 104
    invoke-virtual {v3, v14, v13}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    instance-of v15, v13, Lq2/a;

    .line 109
    .line 110
    if-eqz v15, :cond_5

    .line 111
    .line 112
    invoke-virtual {v3, v14}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v15

    .line 116
    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    .line 117
    .line 118
    invoke-static {v15, v6}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    check-cast v15, Lq2/a;

    .line 122
    .line 123
    new-instance v6, Lq2/a;

    .line 124
    .line 125
    const/16 v16, 0x8

    .line 126
    .line 127
    iget-object v11, v15, Lq2/a;->a:Ljava/lang/String;

    .line 128
    .line 129
    if-nez v11, :cond_3

    .line 130
    .line 131
    move-object v11, v13

    .line 132
    check-cast v11, Lq2/a;

    .line 133
    .line 134
    iget-object v11, v11, Lq2/a;->a:Ljava/lang/String;

    .line 135
    .line 136
    :cond_3
    iget-object v15, v15, Lq2/a;->b:Lub/e;

    .line 137
    .line 138
    if-nez v15, :cond_4

    .line 139
    .line 140
    check-cast v13, Lq2/a;

    .line 141
    .line 142
    iget-object v15, v13, Lq2/a;->b:Lub/e;

    .line 143
    .line 144
    :cond_4
    invoke-direct {v6, v11, v15}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v14, v6}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    :goto_2
    const/16 v16, 0x8

    .line 152
    .line 153
    :goto_3
    shr-long v8, v8, v16

    .line 154
    .line 155
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    const/16 v11, 0x8

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_6
    const/16 v6, 0x8

    .line 161
    .line 162
    if-ne v10, v6, :cond_8

    .line 163
    .line 164
    :cond_7
    if-eq v7, v5, :cond_8

    .line 165
    .line 166
    add-int/lit8 v7, v7, 0x1

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_8
    return-void
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

.method public final R(Li2/l0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Ls/p0;

    .line 9
    .line 10
    iget-object v0, v0, Ls/p0;->a:Ls/n0;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ls/n0;->b(Li2/l0;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final Y(Lo1/l;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v0, "applyFocusProperties called on wrong node"

    .line 4
    .line 5
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1
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

.method public final a()Lf3/c;
    .locals 1

    .line 1
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Li2/j0;->y:Lf3/c;

    .line 6
    .line 7
    return-object v0
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

.method public final b(Li2/q0;Lg2/u0;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lg2/f0;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, Lg2/f0;->b(Li2/q0;Lg2/u0;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public final c(Li2/q0;Lg2/u0;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lg2/f0;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, Lg2/f0;->c(Li2/q0;Lg2/u0;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public final d(Li2/q0;Lg2/u0;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lg2/f0;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, Lg2/f0;->d(Li2/q0;Lg2/u0;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public final d0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lc2/z;

    .line 9
    .line 10
    iget-object v0, v0, Lc2/z;->d:Lb0/w1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0
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

.method public final e()J
    .locals 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {p0, v0}, Li2/f;->v(Li2/m;I)Li2/g1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v0, v0, Lg2/g1;->c:J

    .line 8
    .line 9
    invoke-static {v0, v1}, Lgh/g;->R(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
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

.method public final f(Li2/q0;Lg2/u0;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lg2/f0;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, Lg2/f0;->f(Li2/q0;Lg2/u0;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public final g(Lg2/x0;Lg2/u0;J)Lg2/w0;
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lg2/f0;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3, p4}, Lg2/f0;->g(Lg2/x0;Lg2/u0;J)Lg2/w0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public final getLayoutDirection()Lf3/m;
    .locals 1

    .line 1
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Li2/j0;->z:Lf3/m;

    .line 6
    .line 7
    return-object v0
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

.method public final synthetic h()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public final h0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li2/c;->z()V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method

.method public final j(Lc2/l;Lc2/m;J)V
    .locals 10

    .line 1
    iget-object p3, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string p4, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {p3, p4}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p3, Lc2/z;

    .line 9
    .line 10
    iget-object p3, p3, Lc2/z;->d:Lb0/w1;

    .line 11
    .line 12
    iget-object p4, p3, Lb0/w1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p4, Lc2/z;

    .line 15
    .line 16
    iget-object v0, p1, Lc2/l;->a:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    :goto_0
    const/4 v5, 0x1

    .line 28
    if-ge v4, v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, Lc2/t;

    .line 35
    .line 36
    invoke-static {v6}, Lc2/s;->a(Lc2/t;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_0

    .line 41
    .line 42
    invoke-static {v6}, Lc2/s;->c(Lc2/t;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_0

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v2, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v2, 0x1

    .line 54
    :goto_1
    if-eqz v2, :cond_4

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v6, 0x0

    .line 61
    :goto_2
    if-ge v6, v4, :cond_3

    .line 62
    .line 63
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    check-cast v7, Lc2/t;

    .line 68
    .line 69
    invoke-virtual {v7}, Lc2/t;->b()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const/4 v4, 0x1

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    :goto_3
    const/4 v4, 0x0

    .line 82
    :goto_4
    iget-boolean v6, p4, Lc2/z;->c:Z

    .line 83
    .line 84
    if-nez v6, :cond_8

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const/4 v7, 0x0

    .line 91
    :goto_5
    if-ge v7, v6, :cond_6

    .line 92
    .line 93
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Lc2/t;

    .line 98
    .line 99
    invoke-static {v8}, Lc2/s;->a(Lc2/t;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-nez v9, :cond_8

    .line 104
    .line 105
    invoke-static {v8}, Lc2/s;->c(Lc2/t;)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_5

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_6
    if-eqz v4, :cond_7

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_7
    const/4 v4, 0x0

    .line 119
    goto :goto_7

    .line 120
    :cond_8
    :goto_6
    const/4 v4, 0x1

    .line 121
    :goto_7
    iget-object v6, p3, Lb0/w1;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v6, Lc2/y;

    .line 124
    .line 125
    sget-object v7, Lc2/y;->c:Lc2/y;

    .line 126
    .line 127
    sget-object v8, Lc2/m;->c:Lc2/m;

    .line 128
    .line 129
    if-eq v6, v7, :cond_d

    .line 130
    .line 131
    sget-object v6, Lc2/m;->a:Lc2/m;

    .line 132
    .line 133
    if-ne p2, v6, :cond_b

    .line 134
    .line 135
    if-eqz v4, :cond_b

    .line 136
    .line 137
    iput-object p1, p3, Lb0/w1;->e:Ljava/lang/Object;

    .line 138
    .line 139
    if-eqz v2, :cond_a

    .line 140
    .line 141
    iget-boolean v6, p4, Lc2/z;->c:Z

    .line 142
    .line 143
    if-eqz v6, :cond_9

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_9
    const/4 v6, 0x0

    .line 147
    goto :goto_9

    .line 148
    :cond_a
    :goto_8
    const/4 v6, 0x1

    .line 149
    :goto_9
    invoke-virtual {p3, p1, v6}, Lb0/w1;->A(Lc2/l;Z)V

    .line 150
    .line 151
    .line 152
    :cond_b
    sget-object v6, Lc2/m;->b:Lc2/m;

    .line 153
    .line 154
    if-ne p2, v6, :cond_c

    .line 155
    .line 156
    if-eqz v2, :cond_c

    .line 157
    .line 158
    iget-object v6, p3, Lb0/w1;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v6, Lc2/l;

    .line 161
    .line 162
    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_c

    .line 167
    .line 168
    iget-boolean v6, p4, Lc2/z;->c:Z

    .line 169
    .line 170
    if-eqz v6, :cond_c

    .line 171
    .line 172
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    const/4 v7, 0x0

    .line 177
    :goto_a
    if-ge v7, v6, :cond_c

    .line 178
    .line 179
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    check-cast v9, Lc2/t;

    .line 184
    .line 185
    invoke-virtual {v9}, Lc2/t;->a()V

    .line 186
    .line 187
    .line 188
    add-int/lit8 v7, v7, 0x1

    .line 189
    .line 190
    goto :goto_a

    .line 191
    :cond_c
    if-ne p2, v8, :cond_d

    .line 192
    .line 193
    if-nez v4, :cond_d

    .line 194
    .line 195
    iget-object v4, p3, Lb0/w1;->e:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v4, Lc2/l;

    .line 198
    .line 199
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_d

    .line 204
    .line 205
    invoke-virtual {p3, p1, v5}, Lb0/w1;->A(Lc2/l;Z)V

    .line 206
    .line 207
    .line 208
    :cond_d
    if-ne p2, v8, :cond_12

    .line 209
    .line 210
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    const/4 v4, 0x0

    .line 215
    :goto_b
    if-ge v4, p2, :cond_f

    .line 216
    .line 217
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    check-cast v5, Lc2/t;

    .line 222
    .line 223
    invoke-static {v5}, Lc2/s;->c(Lc2/t;)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-nez v5, :cond_e

    .line 228
    .line 229
    goto :goto_c

    .line 230
    :cond_e
    add-int/lit8 v4, v4, 0x1

    .line 231
    .line 232
    goto :goto_b

    .line 233
    :cond_f
    sget-object p2, Lc2/y;->a:Lc2/y;

    .line 234
    .line 235
    iput-object p2, p3, Lb0/w1;->d:Ljava/lang/Object;

    .line 236
    .line 237
    iget-object p2, p3, Lb0/w1;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p2, Lc2/z;

    .line 240
    .line 241
    iput-boolean v3, p2, Lc2/z;->c:Z

    .line 242
    .line 243
    const/4 p2, 0x0

    .line 244
    iput-object p2, p3, Lb0/w1;->e:Ljava/lang/Object;

    .line 245
    .line 246
    :goto_c
    iget-object p2, p3, Lb0/w1;->e:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p2, Lc2/l;

    .line 249
    .line 250
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result p2

    .line 254
    if-eqz p2, :cond_12

    .line 255
    .line 256
    if-eqz v2, :cond_12

    .line 257
    .line 258
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    const/4 v2, 0x0

    .line 263
    :goto_d
    if-ge v2, p2, :cond_11

    .line 264
    .line 265
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    check-cast v4, Lc2/t;

    .line 270
    .line 271
    invoke-virtual {v4}, Lc2/t;->b()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_10

    .line 276
    .line 277
    iget-boolean p2, p4, Lc2/z;->c:Z

    .line 278
    .line 279
    if-nez p2, :cond_11

    .line 280
    .line 281
    invoke-virtual {p3, p1}, Lb0/w1;->f0(Lc2/l;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_10
    add-int/lit8 v2, v2, 0x1

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_11
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    :goto_e
    if-ge v3, p1, :cond_12

    .line 293
    .line 294
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    check-cast p2, Lc2/t;

    .line 299
    .line 300
    invoke-virtual {p2}, Lc2/t;->a()V

    .line 301
    .line 302
    .line 303
    add-int/lit8 v3, v3, 0x1

    .line 304
    .line 305
    goto :goto_e

    .line 306
    :cond_12
    return-void
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

.method public final synthetic k0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public final l()J
    .locals 2

    .line 1
    sget-wide v0, Li2/b2;->a:J

    .line 2
    .line 3
    return-wide v0
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
.end method

.method public final l0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Lq/i;

    .line 9
    .line 10
    return-object p1
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

.method public final m(J)V
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

.method public final o(Lo1/u;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v0, "onFocusEvent called on wrong node"

    .line 4
    .line 5
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1
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

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    return v0
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
.end method

.method public final r0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Li2/c;->B0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final s(Lh2/g;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Li2/c;->q:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj1/p;->a:Lj1/p;

    .line 7
    .line 8
    iget-boolean v0, v0, Lj1/p;->n:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "visitAncestors called on an unattached node"

    .line 13
    .line 14
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lj1/p;->a:Lj1/p;

    .line 18
    .line 19
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 20
    .line 21
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    if-eqz v1, :cond_b

    .line 26
    .line 27
    iget-object v2, v1, Li2/j0;->F:Li2/d1;

    .line 28
    .line 29
    iget-object v2, v2, Li2/d1;->f:Lj1/p;

    .line 30
    .line 31
    iget v2, v2, Lj1/p;->d:I

    .line 32
    .line 33
    and-int/lit8 v2, v2, 0x20

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_9

    .line 37
    .line 38
    :goto_1
    if-eqz v0, :cond_9

    .line 39
    .line 40
    iget v2, v0, Lj1/p;->c:I

    .line 41
    .line 42
    and-int/lit8 v2, v2, 0x20

    .line 43
    .line 44
    if-eqz v2, :cond_8

    .line 45
    .line 46
    move-object v2, v0

    .line 47
    move-object v4, v3

    .line 48
    :goto_2
    if-eqz v2, :cond_8

    .line 49
    .line 50
    instance-of v5, v2, Lh2/e;

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    check-cast v2, Lh2/e;

    .line 55
    .line 56
    invoke-interface {v2}, Lh2/e;->K()La2/c;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5, p1}, La2/c;->C(Lh2/g;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_7

    .line 65
    .line 66
    invoke-interface {v2}, Lh2/e;->K()La2/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0, p1}, La2/c;->I(Lh2/g;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_1
    iget v5, v2, Lj1/p;->c:I

    .line 76
    .line 77
    and-int/lit8 v5, v5, 0x20

    .line 78
    .line 79
    if-eqz v5, :cond_7

    .line 80
    .line 81
    instance-of v5, v2, Li2/n;

    .line 82
    .line 83
    if-eqz v5, :cond_7

    .line 84
    .line 85
    move-object v5, v2

    .line 86
    check-cast v5, Li2/n;

    .line 87
    .line 88
    iget-object v5, v5, Li2/n;->p:Lj1/p;

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    :goto_3
    const/4 v7, 0x1

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    iget v8, v5, Lj1/p;->c:I

    .line 95
    .line 96
    and-int/lit8 v8, v8, 0x20

    .line 97
    .line 98
    if-eqz v8, :cond_5

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    if-ne v6, v7, :cond_2

    .line 103
    .line 104
    move-object v2, v5

    .line 105
    goto :goto_4

    .line 106
    :cond_2
    if-nez v4, :cond_3

    .line 107
    .line 108
    new-instance v4, Lz0/e;

    .line 109
    .line 110
    const/16 v7, 0x10

    .line 111
    .line 112
    new-array v7, v7, [Lj1/p;

    .line 113
    .line 114
    invoke-direct {v4, v7}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    if-eqz v2, :cond_4

    .line 118
    .line 119
    invoke-virtual {v4, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v2, v3

    .line 123
    :cond_4
    invoke-virtual {v4, v5}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_4
    iget-object v5, v5, Lj1/p;->f:Lj1/p;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    if-ne v6, v7, :cond_7

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    invoke-static {v4}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_2

    .line 137
    :cond_8
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_9
    invoke-virtual {v1}, Li2/j0;->v()Li2/j0;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v1, :cond_a

    .line 145
    .line 146
    iget-object v0, v1, Li2/j0;->F:Li2/d1;

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    iget-object v0, v0, Li2/d1;->e:Li2/a2;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_a
    move-object v0, v3

    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_b
    iget-object p1, p1, Lh2/g;->a:Lic/a;

    .line 157
    .line 158
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1
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

.method public final s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    instance-of v0, v0, Lc2/z;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Li2/c;->z()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public final t0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li2/c;->C0()V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final u(Li2/g1;)V
    .locals 2

    .line 1
    iget-object p1, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Lb0/e;

    .line 9
    .line 10
    iget-boolean v0, p1, Lb0/e;->a:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p1, Lb0/e;->a:Z

    .line 16
    .line 17
    iget-object v0, p1, Lb0/e;->b:Lhf/k;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lhf/k;->h(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p1, Lb0/e;->b:Lhf/k;

    .line 28
    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final z()V
    .locals 12

    .line 1
    iget-object v0, p0, Li2/c;->o:Lj1/o;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lc2/z;

    .line 9
    .line 10
    iget-object v0, v0, Lc2/z;->d:Lb0/w1;

    .line 11
    .line 12
    iget-object v1, v0, Lb0/w1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lc2/y;

    .line 15
    .line 16
    iget-object v2, v0, Lb0/w1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lc2/z;

    .line 19
    .line 20
    sget-object v3, Lc2/y;->b:Lc2/y;

    .line 21
    .line 22
    if-ne v1, v3, :cond_0

    .line 23
    .line 24
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v8, 0x3

    .line 31
    const/4 v9, 0x0

    .line 32
    move-wide v6, v4

    .line 33
    invoke-static/range {v4 .. v11}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->setSource(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lc2/z;->h()Lic/k;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lc2/a0;

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Lc2/a0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 51
    .line 52
    .line 53
    sget-object v1, Lc2/y;->a:Lc2/y;

    .line 54
    .line 55
    iput-object v1, v0, Lb0/w1;->d:Ljava/lang/Object;

    .line 56
    .line 57
    iput-boolean v3, v2, Lc2/z;->c:Z

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    iput-object v1, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_0
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
.end method
