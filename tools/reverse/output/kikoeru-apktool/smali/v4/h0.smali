.class public final Lv4/h0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Lj5/c1;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lv4/i0;

.field public h:Z

.field public final i:[Z

.field public final j:[Lv4/e;

.field public final k:Lj2/b;

.field public final l:Lv4/t0;

.field public m:Lv4/h0;

.field public n:Lj5/o1;

.field public o:Lm5/u;

.field public p:J


# direct methods
.method public constructor <init>([Lv4/e;JLj2/b;Ln5/f;Lv4/t0;Lv4/i0;Lm5/u;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/h0;->j:[Lv4/e;

    .line 5
    .line 6
    iput-wide p2, p0, Lv4/h0;->p:J

    .line 7
    .line 8
    iput-object p4, p0, Lv4/h0;->k:Lj2/b;

    .line 9
    .line 10
    iput-object p6, p0, Lv4/h0;->l:Lv4/t0;

    .line 11
    .line 12
    iget-object p2, p7, Lv4/i0;->a:Lj5/d0;

    .line 13
    .line 14
    iget-object p3, p2, Lj5/d0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p3, p0, Lv4/h0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p7, p0, Lv4/h0;->g:Lv4/i0;

    .line 19
    .line 20
    sget-object p3, Lj5/o1;->d:Lj5/o1;

    .line 21
    .line 22
    iput-object p3, p0, Lv4/h0;->n:Lj5/o1;

    .line 23
    .line 24
    iput-object p8, p0, Lv4/h0;->o:Lm5/u;

    .line 25
    .line 26
    array-length p3, p1

    .line 27
    new-array p3, p3, [Lj5/c1;

    .line 28
    .line 29
    iput-object p3, p0, Lv4/h0;->c:[Lj5/c1;

    .line 30
    .line 31
    array-length p1, p1

    .line 32
    new-array p1, p1, [Z

    .line 33
    .line 34
    iput-object p1, p0, Lv4/h0;->i:[Z

    .line 35
    .line 36
    iget-wide p3, p7, Lv4/i0;->b:J

    .line 37
    .line 38
    iget-wide v5, p7, Lv4/i0;->d:J

    .line 39
    .line 40
    iget-boolean p1, p7, Lv4/i0;->f:Z

    .line 41
    .line 42
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p7, p2, Lj5/d0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    sget p8, Lv4/y0;->n:I

    .line 48
    .line 49
    check-cast p7, Landroid/util/Pair;

    .line 50
    .line 51
    iget-object p8, p7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object p7, p7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {p2, p7}, Lj5/d0;->a(Ljava/lang/Object;)Lj5/d0;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object p7, p6, Lv4/t0;->d:Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-virtual {p7, p8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p7

    .line 65
    check-cast p7, Lv4/s0;

    .line 66
    .line 67
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p8, p6, Lv4/t0;->g:Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-virtual {p8, p7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object p8, p6, Lv4/t0;->f:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {p8, p7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p8

    .line 81
    check-cast p8, Lv4/r0;

    .line 82
    .line 83
    if-eqz p8, :cond_0

    .line 84
    .line 85
    iget-object v0, p8, Lv4/r0;->a:Lj5/a;

    .line 86
    .line 87
    iget-object p8, p8, Lv4/r0;->b:Lv4/l0;

    .line 88
    .line 89
    invoke-virtual {v0, p8}, Lj5/a;->f(Lj5/e0;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    iget-object p8, p7, Lv4/s0;->c:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {p8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    iget-object p8, p7, Lv4/s0;->a:Lj5/y;

    .line 98
    .line 99
    invoke-virtual {p8, p2, p5, p3, p4}, Lj5/y;->C(Lj5/d0;Ln5/f;J)Lj5/v;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object p2, p6, Lv4/t0;->c:Ljava/util/IdentityHashMap;

    .line 104
    .line 105
    invoke-virtual {p2, v1, p7}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p6}, Lv4/t0;->c()V

    .line 109
    .line 110
    .line 111
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    cmp-long p4, v5, p2

    .line 117
    .line 118
    if-eqz p4, :cond_1

    .line 119
    .line 120
    new-instance v0, Lj5/d;

    .line 121
    .line 122
    xor-int/lit8 v2, p1, 0x1

    .line 123
    .line 124
    const-wide/16 v3, 0x0

    .line 125
    .line 126
    invoke-direct/range {v0 .. v6}, Lj5/d;-><init>(Lj5/b0;ZJJ)V

    .line 127
    .line 128
    .line 129
    move-object v1, v0

    .line 130
    :cond_1
    iput-object v1, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 131
    .line 132
    return-void
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
.end method


# virtual methods
.method public final a(Lm5/u;JZ[Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_0
    iget v4, v1, Lm5/u;->a:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-ge v3, v4, :cond_1

    .line 11
    .line 12
    if-nez p4, :cond_0

    .line 13
    .line 14
    iget-object v4, v0, Lv4/h0;->o:Lm5/u;

    .line 15
    .line 16
    invoke-virtual {v1, v4, v3}, Lm5/u;->a(Lm5/u;I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v5, 0x0

    .line 24
    :goto_1
    iget-object v4, v0, Lv4/h0;->i:[Z

    .line 25
    .line 26
    aput-boolean v5, v4, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    :goto_2
    iget-object v4, v0, Lv4/h0;->j:[Lv4/e;

    .line 33
    .line 34
    array-length v6, v4

    .line 35
    const/4 v7, -0x2

    .line 36
    iget-object v8, v0, Lv4/h0;->c:[Lj5/c1;

    .line 37
    .line 38
    if-ge v3, v6, :cond_3

    .line 39
    .line 40
    aget-object v4, v4, v3

    .line 41
    .line 42
    iget v4, v4, Lv4/e;->b:I

    .line 43
    .line 44
    if-ne v4, v7, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aput-object v4, v8, v3

    .line 48
    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {v0}, Lv4/h0;->b()V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Lv4/h0;->o:Lm5/u;

    .line 56
    .line 57
    invoke-virtual {v0}, Lv4/h0;->c()V

    .line 58
    .line 59
    .line 60
    iget-object v10, v1, Lm5/u;->c:[Lm5/r;

    .line 61
    .line 62
    iget-object v11, v0, Lv4/h0;->i:[Z

    .line 63
    .line 64
    iget-object v12, v0, Lv4/h0;->c:[Lj5/c1;

    .line 65
    .line 66
    iget-object v9, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    move-wide/from16 v14, p2

    .line 69
    .line 70
    move-object/from16 v13, p5

    .line 71
    .line 72
    invoke-interface/range {v9 .. v15}, Lj5/b0;->l([Lm5/r;[Z[Lj5/c1;[ZJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    const/4 v3, 0x0

    .line 77
    :goto_3
    array-length v6, v4

    .line 78
    if-ge v3, v6, :cond_5

    .line 79
    .line 80
    aget-object v6, v4, v3

    .line 81
    .line 82
    iget v6, v6, Lv4/e;->b:I

    .line 83
    .line 84
    if-ne v6, v7, :cond_4

    .line 85
    .line 86
    iget-object v6, v0, Lv4/h0;->o:Lm5/u;

    .line 87
    .line 88
    invoke-virtual {v6, v3}, Lm5/u;->b(I)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_4

    .line 93
    .line 94
    new-instance v6, Lj5/r;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    aput-object v6, v8, v3

    .line 100
    .line 101
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    iput-boolean v2, v0, Lv4/h0;->f:Z

    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    :goto_4
    array-length v6, v8

    .line 108
    if-ge v3, v6, :cond_9

    .line 109
    .line 110
    aget-object v6, v8, v3

    .line 111
    .line 112
    if-eqz v6, :cond_6

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Lm5/u;->b(I)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 119
    .line 120
    .line 121
    aget-object v6, v4, v3

    .line 122
    .line 123
    iget v6, v6, Lv4/e;->b:I

    .line 124
    .line 125
    if-eq v6, v7, :cond_8

    .line 126
    .line 127
    iput-boolean v5, v0, Lv4/h0;->f:Z

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_6
    iget-object v6, v1, Lm5/u;->c:[Lm5/r;

    .line 131
    .line 132
    aget-object v6, v6, v3

    .line 133
    .line 134
    if-nez v6, :cond_7

    .line 135
    .line 136
    const/4 v6, 0x1

    .line 137
    goto :goto_5

    .line 138
    :cond_7
    const/4 v6, 0x0

    .line 139
    :goto_5
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 140
    .line 141
    .line 142
    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    return-wide v9
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

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/h0;->m:Lv4/h0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lv4/h0;->o:Lm5/u;

    .line 7
    .line 8
    iget v2, v1, Lm5/u;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lm5/u;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lv4/h0;->o:Lm5/u;

    .line 17
    .line 18
    iget-object v2, v2, Lm5/u;->c:[Lm5/r;

    .line 19
    .line 20
    aget-object v2, v2, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, Lm5/r;->k()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
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

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/h0;->m:Lv4/h0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lv4/h0;->o:Lm5/u;

    .line 7
    .line 8
    iget v2, v1, Lm5/u;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lm5/u;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lv4/h0;->o:Lm5/u;

    .line 17
    .line 18
    iget-object v2, v2, Lm5/u;->c:[Lm5/r;

    .line 19
    .line 20
    aget-object v2, v2, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, Lm5/r;->h()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
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
    .locals 5

    .line 1
    iget-boolean v0, p0, Lv4/h0;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv4/h0;->g:Lv4/i0;

    .line 6
    .line 7
    iget-wide v0, v0, Lv4/i0;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Lv4/h0;->f:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Lj5/e1;->t()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v3, v1

    .line 24
    :goto_0
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lv4/h0;->g:Lv4/i0;

    .line 29
    .line 30
    iget-wide v0, v0, Lv4/i0;->e:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    return-wide v3
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

.method public final e()J
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/h0;->g:Lv4/i0;

    .line 2
    .line 3
    iget-wide v0, v0, Lv4/i0;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, Lv4/h0;->p:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
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

.method public final f(FLm4/i1;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lv4/h0;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lj5/b0;->q()Lj5/o1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lv4/h0;->n:Lj5/o1;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lv4/h0;->j(FLm4/i1;Z)Lm5/u;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p1, p0, Lv4/h0;->g:Lv4/i0;

    .line 17
    .line 18
    iget-wide p2, p1, Lv4/i0;->b:J

    .line 19
    .line 20
    iget-wide v0, p1, Lv4/i0;->e:J

    .line 21
    .line 22
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p1, v0, v3

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    cmp-long p1, p2, v0

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    const-wide/16 p1, 0x1

    .line 36
    .line 37
    sub-long/2addr v0, p1

    .line 38
    const-wide/16 p1, 0x0

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    :cond_0
    move-wide v3, p2

    .line 45
    iget-object p1, p0, Lv4/h0;->j:[Lv4/e;

    .line 46
    .line 47
    array-length p1, p1

    .line 48
    new-array v6, p1, [Z

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-virtual/range {v1 .. v6}, Lv4/h0;->a(Lm5/u;JZ[Z)J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    iget-wide v2, v1, Lv4/h0;->p:J

    .line 57
    .line 58
    iget-object p3, v1, Lv4/h0;->g:Lv4/i0;

    .line 59
    .line 60
    iget-wide v4, p3, Lv4/i0;->b:J

    .line 61
    .line 62
    sub-long/2addr v4, p1

    .line 63
    add-long/2addr v4, v2

    .line 64
    iput-wide v4, v1, Lv4/h0;->p:J

    .line 65
    .line 66
    invoke-virtual {p3, p1, p2}, Lv4/i0;->b(J)Lv4/i0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, v1, Lv4/h0;->g:Lv4/i0;

    .line 71
    .line 72
    return-void
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

.method public final g()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lv4/h0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lv4/h0;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lj5/e1;->t()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v4, v0, v2

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final h()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lv4/h0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lv4/h0;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lv4/h0;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lv4/h0;->g:Lv4/i0;

    .line 16
    .line 17
    iget-wide v2, v2, Lv4/i0;->b:J

    .line 18
    .line 19
    sub-long/2addr v0, v2

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v4, v0, v2

    .line 26
    .line 27
    if-ltz v4, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    return v0
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

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv4/h0;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    :try_start_0
    instance-of v1, v0, Lj5/d;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    iget-object v2, p0, Lv4/h0;->l:Lv4/t0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    check-cast v0, Lj5/d;

    .line 13
    .line 14
    iget-object v0, v0, Lj5/d;->a:Lj5/b0;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lv4/t0;->f(Lj5/b0;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, v0}, Lv4/t0;->f(Lj5/b0;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_0
    const-string v1, "MediaPeriodHolder"

    .line 27
    .line 28
    const-string v2, "Period release failed."

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public final j(FLm4/i1;Z)Lm5/u;
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lv4/h0;->k:Lj2/b;

    .line 4
    .line 5
    iget-object v2, v1, Lv4/h0;->j:[Lv4/e;

    .line 6
    .line 7
    iget-object v3, v1, Lv4/h0;->n:Lj5/o1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v4, v2

    .line 13
    const/4 v5, 0x1

    .line 14
    add-int/2addr v4, v5

    .line 15
    new-array v4, v4, [I

    .line 16
    .line 17
    array-length v6, v2

    .line 18
    add-int/2addr v6, v5

    .line 19
    new-array v7, v6, [[Lm4/j1;

    .line 20
    .line 21
    array-length v8, v2

    .line 22
    add-int/2addr v8, v5

    .line 23
    new-array v13, v8, [[[I

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    :goto_0
    if-ge v9, v6, :cond_0

    .line 27
    .line 28
    iget v10, v3, Lj5/o1;->a:I

    .line 29
    .line 30
    new-array v11, v10, [Lm4/j1;

    .line 31
    .line 32
    aput-object v11, v7, v9

    .line 33
    .line 34
    new-array v10, v10, [[I

    .line 35
    .line 36
    aput-object v10, v13, v9

    .line 37
    .line 38
    add-int/lit8 v9, v9, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    array-length v6, v2

    .line 42
    new-array v12, v6, [I

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    :goto_1
    if-ge v9, v6, :cond_1

    .line 46
    .line 47
    aget-object v10, v2, v9

    .line 48
    .line 49
    invoke-virtual {v10}, Lv4/e;->z()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    aput v10, v12, v9

    .line 54
    .line 55
    add-int/lit8 v9, v9, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v6, 0x0

    .line 59
    :goto_2
    iget v9, v3, Lj5/o1;->a:I

    .line 60
    .line 61
    const/4 v15, 0x5

    .line 62
    if-ge v6, v9, :cond_a

    .line 63
    .line 64
    invoke-virtual {v3, v6}, Lj5/o1;->a(I)Lm4/j1;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    iget v10, v9, Lm4/j1;->c:I

    .line 69
    .line 70
    if-ne v10, v15, :cond_2

    .line 71
    .line 72
    const/4 v10, 0x1

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    const/4 v10, 0x0

    .line 75
    :goto_3
    array-length v11, v2

    .line 76
    const/16 p2, 0x0

    .line 77
    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x1

    .line 81
    .line 82
    :goto_4
    array-length v8, v2

    .line 83
    if-ge v14, v8, :cond_7

    .line 84
    .line 85
    aget-object v8, v2, v14

    .line 86
    .line 87
    move-object/from16 v18, v0

    .line 88
    .line 89
    move-object/from16 v19, v3

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const/16 v17, 0x1

    .line 94
    .line 95
    :goto_5
    iget v3, v9, Lm4/j1;->a:I

    .line 96
    .line 97
    if-ge v5, v3, :cond_3

    .line 98
    .line 99
    iget-object v3, v9, Lm4/j1;->d:[Lm4/q;

    .line 100
    .line 101
    aget-object v3, v3, v5

    .line 102
    .line 103
    invoke-virtual {v8, v3}, Lv4/e;->y(Lm4/q;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    and-int/lit8 v3, v3, 0x7

    .line 108
    .line 109
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_3
    aget v3, v4, v14

    .line 117
    .line 118
    if-nez v3, :cond_4

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    goto :goto_6

    .line 122
    :cond_4
    const/4 v3, 0x0

    .line 123
    :goto_6
    if-gt v0, v15, :cond_5

    .line 124
    .line 125
    if-ne v0, v15, :cond_6

    .line 126
    .line 127
    if-eqz v10, :cond_6

    .line 128
    .line 129
    if-nez v16, :cond_6

    .line 130
    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    :cond_5
    move v15, v0

    .line 134
    move/from16 v16, v3

    .line 135
    .line 136
    move v11, v14

    .line 137
    :cond_6
    add-int/lit8 v14, v14, 0x1

    .line 138
    .line 139
    move-object/from16 v0, v18

    .line 140
    .line 141
    move-object/from16 v3, v19

    .line 142
    .line 143
    const/4 v5, 0x1

    .line 144
    goto :goto_4

    .line 145
    :cond_7
    move-object/from16 v18, v0

    .line 146
    .line 147
    move-object/from16 v19, v3

    .line 148
    .line 149
    const/16 v17, 0x1

    .line 150
    .line 151
    array-length v0, v2

    .line 152
    if-ne v11, v0, :cond_8

    .line 153
    .line 154
    iget v0, v9, Lm4/j1;->a:I

    .line 155
    .line 156
    new-array v0, v0, [I

    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_8
    aget-object v0, v2, v11

    .line 160
    .line 161
    iget v3, v9, Lm4/j1;->a:I

    .line 162
    .line 163
    new-array v3, v3, [I

    .line 164
    .line 165
    const/4 v5, 0x0

    .line 166
    :goto_7
    iget v8, v9, Lm4/j1;->a:I

    .line 167
    .line 168
    if-ge v5, v8, :cond_9

    .line 169
    .line 170
    iget-object v8, v9, Lm4/j1;->d:[Lm4/q;

    .line 171
    .line 172
    aget-object v8, v8, v5

    .line 173
    .line 174
    invoke-virtual {v0, v8}, Lv4/e;->y(Lm4/q;)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    aput v8, v3, v5

    .line 179
    .line 180
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_9
    move-object v0, v3

    .line 184
    :goto_8
    aget v3, v4, v11

    .line 185
    .line 186
    aget-object v5, v7, v11

    .line 187
    .line 188
    aput-object v9, v5, v3

    .line 189
    .line 190
    aget-object v5, v13, v11

    .line 191
    .line 192
    aput-object v0, v5, v3

    .line 193
    .line 194
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    aput v3, v4, v11

    .line 197
    .line 198
    add-int/lit8 v6, v6, 0x1

    .line 199
    .line 200
    move-object/from16 v0, v18

    .line 201
    .line 202
    move-object/from16 v3, v19

    .line 203
    .line 204
    const/4 v5, 0x1

    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_a
    move-object/from16 v18, v0

    .line 208
    .line 209
    const/16 p2, 0x0

    .line 210
    .line 211
    const/16 v17, 0x1

    .line 212
    .line 213
    array-length v0, v2

    .line 214
    new-array v11, v0, [Lj5/o1;

    .line 215
    .line 216
    array-length v0, v2

    .line 217
    new-array v0, v0, [Ljava/lang/String;

    .line 218
    .line 219
    array-length v3, v2

    .line 220
    new-array v10, v3, [I

    .line 221
    .line 222
    const/4 v3, 0x0

    .line 223
    :goto_9
    array-length v5, v2

    .line 224
    if-ge v3, v5, :cond_b

    .line 225
    .line 226
    aget v5, v4, v3

    .line 227
    .line 228
    new-instance v6, Lj5/o1;

    .line 229
    .line 230
    aget-object v8, v7, v3

    .line 231
    .line 232
    invoke-static {v5, v8}, Lp4/c0;->P(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    check-cast v8, [Lm4/j1;

    .line 237
    .line 238
    invoke-direct {v6, v8}, Lj5/o1;-><init>([Lm4/j1;)V

    .line 239
    .line 240
    .line 241
    aput-object v6, v11, v3

    .line 242
    .line 243
    aget-object v6, v13, v3

    .line 244
    .line 245
    invoke-static {v5, v6}, Lp4/c0;->P(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    check-cast v5, [[I

    .line 250
    .line 251
    aput-object v5, v13, v3

    .line 252
    .line 253
    aget-object v5, v2, v3

    .line 254
    .line 255
    invoke-virtual {v5}, Lv4/e;->i()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    aput-object v5, v0, v3

    .line 260
    .line 261
    aget-object v5, v2, v3

    .line 262
    .line 263
    iget v5, v5, Lv4/e;->b:I

    .line 264
    .line 265
    aput v5, v10, v3

    .line 266
    .line 267
    add-int/lit8 v3, v3, 0x1

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_b
    array-length v0, v2

    .line 271
    aget v0, v4, v0

    .line 272
    .line 273
    new-instance v14, Lj5/o1;

    .line 274
    .line 275
    array-length v2, v2

    .line 276
    aget-object v2, v7, v2

    .line 277
    .line 278
    invoke-static {v0, v2}, Lp4/c0;->P(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, [Lm4/j1;

    .line 283
    .line 284
    invoke-direct {v14, v0}, Lj5/o1;-><init>([Lm4/j1;)V

    .line 285
    .line 286
    .line 287
    new-instance v9, Lm5/t;

    .line 288
    .line 289
    invoke-direct/range {v9 .. v14}, Lm5/t;-><init>([I[Lj5/o1;[I[[[ILj5/o1;)V

    .line 290
    .line 291
    .line 292
    move-object/from16 v0, v18

    .line 293
    .line 294
    check-cast v0, Lm5/p;

    .line 295
    .line 296
    iget-object v2, v0, Lm5/p;->c:Ljava/lang/Object;

    .line 297
    .line 298
    monitor-enter v2

    .line 299
    :try_start_0
    iget-object v3, v0, Lm5/p;->g:Lm5/j;

    .line 300
    .line 301
    iget-boolean v4, v3, Lm5/j;->o0:Z

    .line 302
    .line 303
    if-eqz v4, :cond_d

    .line 304
    .line 305
    sget v4, Lp4/c0;->a:I

    .line 306
    .line 307
    const/16 v5, 0x20

    .line 308
    .line 309
    if-lt v4, v5, :cond_d

    .line 310
    .line 311
    iget-object v4, v0, Lm5/p;->h:Lb5/d0;

    .line 312
    .line 313
    if-eqz v4, :cond_d

    .line 314
    .line 315
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-static {v5}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    iget-object v6, v4, Lb5/d0;->d:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v6, Lm5/k;

    .line 325
    .line 326
    if-nez v6, :cond_d

    .line 327
    .line 328
    iget-object v6, v4, Lb5/d0;->c:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v6, Landroid/os/Handler;

    .line 331
    .line 332
    if-eqz v6, :cond_c

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_c
    new-instance v6, Lm5/k;

    .line 336
    .line 337
    invoke-direct {v6, v0}, Lm5/k;-><init>(Lm5/p;)V

    .line 338
    .line 339
    .line 340
    iput-object v6, v4, Lb5/d0;->d:Ljava/lang/Object;

    .line 341
    .line 342
    new-instance v6, Landroid/os/Handler;

    .line 343
    .line 344
    invoke-direct {v6, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 345
    .line 346
    .line 347
    iput-object v6, v4, Lb5/d0;->c:Ljava/lang/Object;

    .line 348
    .line 349
    iget-object v5, v4, Lb5/d0;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v5, Landroid/media/Spatializer;

    .line 352
    .line 353
    new-instance v7, Lb7/k1;

    .line 354
    .line 355
    const/4 v8, 0x1

    .line 356
    invoke-direct {v7, v6, v8}, Lb7/k1;-><init>(Landroid/os/Handler;I)V

    .line 357
    .line 358
    .line 359
    iget-object v4, v4, Lb5/d0;->d:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v4, Lm5/k;

    .line 362
    .line 363
    invoke-static {v5, v7, v4}, Lm4/c;->e(Landroid/media/Spatializer;Lb7/k1;Lm5/k;)V

    .line 364
    .line 365
    .line 366
    goto :goto_a

    .line 367
    :catchall_0
    move-exception v0

    .line 368
    goto/16 :goto_53

    .line 369
    .line 370
    :cond_d
    :goto_a
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    iget v2, v9, Lm5/t;->a:I

    .line 372
    .line 373
    new-array v4, v2, [Lm5/q;

    .line 374
    .line 375
    const/4 v5, 0x0

    .line 376
    :goto_b
    iget v6, v9, Lm5/t;->a:I

    .line 377
    .line 378
    const/4 v8, 0x2

    .line 379
    if-ge v5, v6, :cond_f

    .line 380
    .line 381
    aget v6, v10, v5

    .line 382
    .line 383
    if-ne v8, v6, :cond_e

    .line 384
    .line 385
    aget-object v6, v11, v5

    .line 386
    .line 387
    iget v6, v6, Lj5/o1;->a:I

    .line 388
    .line 389
    if-lez v6, :cond_e

    .line 390
    .line 391
    const/4 v5, 0x1

    .line 392
    goto :goto_c

    .line 393
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_f
    const/4 v5, 0x0

    .line 397
    :goto_c
    new-instance v6, Lm5/d;

    .line 398
    .line 399
    invoke-direct {v6, v0, v3, v5, v12}, Lm5/d;-><init>(Lm5/p;Lm5/j;Z[I)V

    .line 400
    .line 401
    .line 402
    new-instance v5, Landroidx/media3/exoplayer/offline/i;

    .line 403
    .line 404
    const/16 v7, 0xb

    .line 405
    .line 406
    invoke-direct {v5, v7}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 407
    .line 408
    .line 409
    const/4 v7, 0x1

    .line 410
    invoke-static {v7, v9, v13, v6, v5}, Lm5/p;->m(ILm5/t;[[[ILm5/m;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    if-eqz v5, :cond_10

    .line 415
    .line 416
    iget-object v6, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v6, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v7, Lm5/q;

    .line 427
    .line 428
    aput-object v7, v4, v6

    .line 429
    .line 430
    :cond_10
    if-nez v5, :cond_11

    .line 431
    .line 432
    const/4 v5, 0x0

    .line 433
    goto :goto_d

    .line 434
    :cond_11
    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v5, Lm5/q;

    .line 437
    .line 438
    iget-object v7, v5, Lm5/q;->a:Lm4/j1;

    .line 439
    .line 440
    iget-object v5, v5, Lm5/q;->b:[I

    .line 441
    .line 442
    aget v5, v5, p2

    .line 443
    .line 444
    iget-object v7, v7, Lm4/j1;->d:[Lm4/q;

    .line 445
    .line 446
    aget-object v5, v7, v5

    .line 447
    .line 448
    iget-object v5, v5, Lm4/q;->d:Ljava/lang/String;

    .line 449
    .line 450
    :goto_d
    iget-object v7, v3, Lm4/o1;->t:Lm4/m1;

    .line 451
    .line 452
    iget v14, v7, Lm4/m1;->a:I

    .line 453
    .line 454
    if-ne v14, v8, :cond_12

    .line 455
    .line 456
    const/4 v12, 0x0

    .line 457
    goto :goto_e

    .line 458
    :cond_12
    new-instance v14, Lb7/w0;

    .line 459
    .line 460
    invoke-direct {v14, v3, v5, v12, v15}, Lb7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 461
    .line 462
    .line 463
    new-instance v12, Landroidx/media3/exoplayer/offline/i;

    .line 464
    .line 465
    const/16 v15, 0xa

    .line 466
    .line 467
    invoke-direct {v12, v15}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 468
    .line 469
    .line 470
    invoke-static {v8, v9, v13, v14, v12}, Lm5/p;->m(ILm5/t;[[[ILm5/m;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 471
    .line 472
    .line 473
    move-result-object v12

    .line 474
    :goto_e
    iget-boolean v14, v3, Lm4/o1;->y:Z

    .line 475
    .line 476
    const/16 v15, 0xf

    .line 477
    .line 478
    const/16 v16, 0x0

    .line 479
    .line 480
    const/4 v6, 0x4

    .line 481
    if-nez v14, :cond_14

    .line 482
    .line 483
    if-nez v12, :cond_13

    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_13
    :goto_f
    move-object/from16 v8, v16

    .line 487
    .line 488
    goto :goto_11

    .line 489
    :cond_14
    :goto_10
    iget v14, v7, Lm4/m1;->a:I

    .line 490
    .line 491
    if-ne v14, v8, :cond_15

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_15
    new-instance v14, Landroidx/media3/exoplayer/offline/g;

    .line 495
    .line 496
    invoke-direct {v14, v15, v3}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    new-instance v15, Landroidx/media3/exoplayer/offline/i;

    .line 500
    .line 501
    const/16 v8, 0x9

    .line 502
    .line 503
    invoke-direct {v15, v8}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 504
    .line 505
    .line 506
    invoke-static {v6, v9, v13, v14, v15}, Lm5/p;->m(ILm5/t;[[[ILm5/m;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    :goto_11
    if-eqz v8, :cond_16

    .line 511
    .line 512
    iget-object v12, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v12, Ljava/lang/Integer;

    .line 515
    .line 516
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 517
    .line 518
    .line 519
    move-result v12

    .line 520
    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v8, Lm5/q;

    .line 523
    .line 524
    aput-object v8, v4, v12

    .line 525
    .line 526
    goto :goto_12

    .line 527
    :cond_16
    if-eqz v12, :cond_17

    .line 528
    .line 529
    iget-object v8, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v8, Ljava/lang/Integer;

    .line 532
    .line 533
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result v8

    .line 537
    iget-object v12, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v12, Lm5/q;

    .line 540
    .line 541
    aput-object v12, v4, v8

    .line 542
    .line 543
    :cond_17
    :goto_12
    iget v8, v7, Lm4/m1;->a:I

    .line 544
    .line 545
    const/4 v12, 0x3

    .line 546
    const/4 v14, 0x2

    .line 547
    if-ne v8, v14, :cond_18

    .line 548
    .line 549
    move-object/from16 v5, v16

    .line 550
    .line 551
    goto :goto_13

    .line 552
    :cond_18
    new-instance v8, Lb7/i0;

    .line 553
    .line 554
    const/16 v14, 0xf

    .line 555
    .line 556
    invoke-direct {v8, v14, v3, v5}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    new-instance v5, Landroidx/media3/exoplayer/offline/i;

    .line 560
    .line 561
    const/16 v14, 0xc

    .line 562
    .line 563
    invoke-direct {v5, v14}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 564
    .line 565
    .line 566
    invoke-static {v12, v9, v13, v8, v5}, Lm5/p;->m(ILm5/t;[[[ILm5/m;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    :goto_13
    if-eqz v5, :cond_19

    .line 571
    .line 572
    iget-object v8, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v8, Ljava/lang/Integer;

    .line 575
    .line 576
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v5, Lm5/q;

    .line 583
    .line 584
    aput-object v5, v4, v8

    .line 585
    .line 586
    :cond_19
    const/4 v5, 0x0

    .line 587
    :goto_14
    if-ge v5, v2, :cond_22

    .line 588
    .line 589
    aget v8, v10, v5

    .line 590
    .line 591
    const/4 v14, 0x2

    .line 592
    if-eq v8, v14, :cond_21

    .line 593
    .line 594
    const/4 v15, 0x1

    .line 595
    if-eq v8, v15, :cond_21

    .line 596
    .line 597
    if-eq v8, v12, :cond_21

    .line 598
    .line 599
    if-eq v8, v6, :cond_21

    .line 600
    .line 601
    aget-object v8, v11, v5

    .line 602
    .line 603
    aget-object v15, v13, v5

    .line 604
    .line 605
    iget v12, v7, Lm4/m1;->a:I

    .line 606
    .line 607
    if-ne v12, v14, :cond_1a

    .line 608
    .line 609
    move/from16 v21, v5

    .line 610
    .line 611
    move-object/from16 v23, v7

    .line 612
    .line 613
    move-object/from16 v27, v10

    .line 614
    .line 615
    :goto_15
    move-object/from16 v5, v16

    .line 616
    .line 617
    goto/16 :goto_1a

    .line 618
    .line 619
    :cond_1a
    move/from16 v21, v5

    .line 620
    .line 621
    move-object/from16 v6, v16

    .line 622
    .line 623
    move-object/from16 v20, v6

    .line 624
    .line 625
    const/4 v12, 0x0

    .line 626
    const/4 v14, 0x0

    .line 627
    :goto_16
    iget v5, v8, Lj5/o1;->a:I

    .line 628
    .line 629
    if-ge v12, v5, :cond_1f

    .line 630
    .line 631
    invoke-virtual {v8, v12}, Lj5/o1;->a(I)Lm4/j1;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    aget-object v22, v15, v12

    .line 636
    .line 637
    move-object/from16 v23, v7

    .line 638
    .line 639
    move-object/from16 v24, v8

    .line 640
    .line 641
    move-object/from16 v7, v20

    .line 642
    .line 643
    move/from16 v20, v14

    .line 644
    .line 645
    move-object v14, v6

    .line 646
    const/4 v6, 0x0

    .line 647
    :goto_17
    iget v8, v5, Lm4/j1;->a:I

    .line 648
    .line 649
    if-ge v6, v8, :cond_1e

    .line 650
    .line 651
    aget v8, v22, v6

    .line 652
    .line 653
    move/from16 v25, v6

    .line 654
    .line 655
    iget-boolean v6, v3, Lm5/j;->p0:Z

    .line 656
    .line 657
    invoke-static {v8, v6}, Lq/t0;->v(IZ)Z

    .line 658
    .line 659
    .line 660
    move-result v6

    .line 661
    if-eqz v6, :cond_1c

    .line 662
    .line 663
    iget-object v6, v5, Lm4/j1;->d:[Lm4/q;

    .line 664
    .line 665
    aget-object v6, v6, v25

    .line 666
    .line 667
    new-instance v8, Lm5/h;

    .line 668
    .line 669
    move-object/from16 v26, v5

    .line 670
    .line 671
    aget v5, v22, v25

    .line 672
    .line 673
    invoke-direct {v8, v6, v5}, Lm5/h;-><init>(Lm4/q;I)V

    .line 674
    .line 675
    .line 676
    if-eqz v7, :cond_1b

    .line 677
    .line 678
    sget-object v5, Lya/y;->a:Lya/w;

    .line 679
    .line 680
    iget-boolean v6, v8, Lm5/h;->b:Z

    .line 681
    .line 682
    move-object/from16 v27, v10

    .line 683
    .line 684
    iget-boolean v10, v7, Lm5/h;->b:Z

    .line 685
    .line 686
    invoke-virtual {v5, v6, v10}, Lya/w;->c(ZZ)Lya/y;

    .line 687
    .line 688
    .line 689
    move-result-object v5

    .line 690
    iget-boolean v6, v8, Lm5/h;->a:Z

    .line 691
    .line 692
    iget-boolean v10, v7, Lm5/h;->a:Z

    .line 693
    .line 694
    invoke-virtual {v5, v6, v10}, Lya/y;->c(ZZ)Lya/y;

    .line 695
    .line 696
    .line 697
    move-result-object v5

    .line 698
    invoke-virtual {v5}, Lya/y;->e()I

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    if-lez v5, :cond_1d

    .line 703
    .line 704
    goto :goto_18

    .line 705
    :cond_1b
    move-object/from16 v27, v10

    .line 706
    .line 707
    :goto_18
    move-object v7, v8

    .line 708
    move/from16 v20, v25

    .line 709
    .line 710
    move-object/from16 v14, v26

    .line 711
    .line 712
    goto :goto_19

    .line 713
    :cond_1c
    move-object/from16 v26, v5

    .line 714
    .line 715
    move-object/from16 v27, v10

    .line 716
    .line 717
    :cond_1d
    :goto_19
    add-int/lit8 v6, v25, 0x1

    .line 718
    .line 719
    move-object/from16 v5, v26

    .line 720
    .line 721
    move-object/from16 v10, v27

    .line 722
    .line 723
    goto :goto_17

    .line 724
    :cond_1e
    move-object/from16 v27, v10

    .line 725
    .line 726
    add-int/lit8 v12, v12, 0x1

    .line 727
    .line 728
    move-object v6, v14

    .line 729
    move/from16 v14, v20

    .line 730
    .line 731
    move-object/from16 v8, v24

    .line 732
    .line 733
    move-object/from16 v20, v7

    .line 734
    .line 735
    move-object/from16 v7, v23

    .line 736
    .line 737
    goto :goto_16

    .line 738
    :cond_1f
    move-object/from16 v23, v7

    .line 739
    .line 740
    move-object/from16 v27, v10

    .line 741
    .line 742
    if-nez v6, :cond_20

    .line 743
    .line 744
    goto/16 :goto_15

    .line 745
    .line 746
    :cond_20
    new-instance v5, Lm5/q;

    .line 747
    .line 748
    filled-new-array {v14}, [I

    .line 749
    .line 750
    .line 751
    move-result-object v7

    .line 752
    const/4 v8, 0x0

    .line 753
    invoke-direct {v5, v8, v6, v7}, Lm5/q;-><init>(ILm4/j1;[I)V

    .line 754
    .line 755
    .line 756
    :goto_1a
    aput-object v5, v4, v21

    .line 757
    .line 758
    goto :goto_1b

    .line 759
    :cond_21
    move/from16 v21, v5

    .line 760
    .line 761
    move-object/from16 v23, v7

    .line 762
    .line 763
    move-object/from16 v27, v10

    .line 764
    .line 765
    :goto_1b
    add-int/lit8 v5, v21, 0x1

    .line 766
    .line 767
    move-object/from16 v7, v23

    .line 768
    .line 769
    move-object/from16 v10, v27

    .line 770
    .line 771
    const/16 p2, 0x0

    .line 772
    .line 773
    const/4 v6, 0x4

    .line 774
    const/4 v12, 0x3

    .line 775
    goto/16 :goto_14

    .line 776
    .line 777
    :cond_22
    iget v5, v9, Lm5/t;->a:I

    .line 778
    .line 779
    iget-object v6, v9, Lm5/t;->c:[Lj5/o1;

    .line 780
    .line 781
    new-instance v7, Ljava/util/HashMap;

    .line 782
    .line 783
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 784
    .line 785
    .line 786
    const/4 v8, 0x0

    .line 787
    :goto_1c
    if-ge v8, v5, :cond_23

    .line 788
    .line 789
    aget-object v10, v6, v8

    .line 790
    .line 791
    invoke-static {v10, v3, v7}, Lm5/p;->f(Lj5/o1;Lm5/j;Ljava/util/HashMap;)V

    .line 792
    .line 793
    .line 794
    add-int/lit8 v8, v8, 0x1

    .line 795
    .line 796
    goto :goto_1c

    .line 797
    :cond_23
    iget-object v8, v9, Lm5/t;->f:Lj5/o1;

    .line 798
    .line 799
    invoke-static {v8, v3, v7}, Lm5/p;->f(Lj5/o1;Lm5/j;Ljava/util/HashMap;)V

    .line 800
    .line 801
    .line 802
    const/4 v8, 0x0

    .line 803
    :goto_1d
    const/4 v10, -0x1

    .line 804
    if-ge v8, v5, :cond_26

    .line 805
    .line 806
    iget-object v11, v9, Lm5/t;->b:[I

    .line 807
    .line 808
    aget v11, v11, v8

    .line 809
    .line 810
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 811
    .line 812
    .line 813
    move-result-object v11

    .line 814
    invoke-virtual {v7, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v11

    .line 818
    check-cast v11, Lm4/k1;

    .line 819
    .line 820
    if-nez v11, :cond_24

    .line 821
    .line 822
    goto :goto_1f

    .line 823
    :cond_24
    iget-object v12, v11, Lm4/k1;->a:Lm4/j1;

    .line 824
    .line 825
    iget-object v11, v11, Lm4/k1;->b:Lya/i0;

    .line 826
    .line 827
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 828
    .line 829
    .line 830
    move-result v14

    .line 831
    if-nez v14, :cond_25

    .line 832
    .line 833
    aget-object v14, v6, v8

    .line 834
    .line 835
    invoke-virtual {v14, v12}, Lj5/o1;->b(Lm4/j1;)I

    .line 836
    .line 837
    .line 838
    move-result v14

    .line 839
    if-eq v14, v10, :cond_25

    .line 840
    .line 841
    new-instance v10, Lm5/q;

    .line 842
    .line 843
    invoke-static {v11}, Lg8/a;->a0(Ljava/util/Collection;)[I

    .line 844
    .line 845
    .line 846
    move-result-object v11

    .line 847
    const/4 v14, 0x0

    .line 848
    invoke-direct {v10, v14, v12, v11}, Lm5/q;-><init>(ILm4/j1;[I)V

    .line 849
    .line 850
    .line 851
    goto :goto_1e

    .line 852
    :cond_25
    move-object/from16 v10, v16

    .line 853
    .line 854
    :goto_1e
    aput-object v10, v4, v8

    .line 855
    .line 856
    :goto_1f
    add-int/lit8 v8, v8, 0x1

    .line 857
    .line 858
    goto :goto_1d

    .line 859
    :cond_26
    iget v5, v9, Lm5/t;->a:I

    .line 860
    .line 861
    const/4 v6, 0x0

    .line 862
    :goto_20
    if-ge v6, v5, :cond_2a

    .line 863
    .line 864
    iget-object v7, v9, Lm5/t;->c:[Lj5/o1;

    .line 865
    .line 866
    aget-object v7, v7, v6

    .line 867
    .line 868
    iget-object v8, v3, Lm5/j;->r0:Landroid/util/SparseArray;

    .line 869
    .line 870
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v8

    .line 874
    check-cast v8, Ljava/util/Map;

    .line 875
    .line 876
    if-eqz v8, :cond_29

    .line 877
    .line 878
    invoke-interface {v8, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v8

    .line 882
    if-eqz v8, :cond_29

    .line 883
    .line 884
    iget-object v8, v3, Lm5/j;->r0:Landroid/util/SparseArray;

    .line 885
    .line 886
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v8

    .line 890
    check-cast v8, Ljava/util/Map;

    .line 891
    .line 892
    if-eqz v8, :cond_28

    .line 893
    .line 894
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v7

    .line 898
    if-nez v7, :cond_27

    .line 899
    .line 900
    goto :goto_21

    .line 901
    :cond_27
    new-instance v0, Ljava/lang/ClassCastException;

    .line 902
    .line 903
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 904
    .line 905
    .line 906
    throw v0

    .line 907
    :cond_28
    :goto_21
    aput-object v16, v4, v6

    .line 908
    .line 909
    :cond_29
    add-int/lit8 v6, v6, 0x1

    .line 910
    .line 911
    goto :goto_20

    .line 912
    :cond_2a
    const/4 v5, 0x0

    .line 913
    :goto_22
    if-ge v5, v2, :cond_2d

    .line 914
    .line 915
    iget-object v6, v9, Lm5/t;->b:[I

    .line 916
    .line 917
    aget v6, v6, v5

    .line 918
    .line 919
    iget-object v7, v3, Lm5/j;->s0:Landroid/util/SparseBooleanArray;

    .line 920
    .line 921
    invoke-virtual {v7, v5}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 922
    .line 923
    .line 924
    move-result v7

    .line 925
    if-nez v7, :cond_2b

    .line 926
    .line 927
    iget-object v7, v3, Lm4/o1;->C:Lya/m0;

    .line 928
    .line 929
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 930
    .line 931
    .line 932
    move-result-object v6

    .line 933
    invoke-virtual {v7, v6}, Lya/d0;->contains(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v6

    .line 937
    if-eqz v6, :cond_2c

    .line 938
    .line 939
    :cond_2b
    aput-object v16, v4, v5

    .line 940
    .line 941
    :cond_2c
    add-int/lit8 v5, v5, 0x1

    .line 942
    .line 943
    goto :goto_22

    .line 944
    :cond_2d
    iget-object v5, v0, Lm5/p;->e:Lm3/l;

    .line 945
    .line 946
    iget-object v0, v0, Lj2/b;->b:Ljava/lang/Object;

    .line 947
    .line 948
    move-object/from16 v23, v0

    .line 949
    .line 950
    check-cast v23, Ln5/e;

    .line 951
    .line 952
    invoke-static/range {v23 .. v23}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    new-instance v0, Ljava/util/ArrayList;

    .line 959
    .line 960
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 961
    .line 962
    .line 963
    const/4 v5, 0x0

    .line 964
    :goto_23
    array-length v6, v4

    .line 965
    const-wide/16 v7, 0x0

    .line 966
    .line 967
    if-ge v5, v6, :cond_2f

    .line 968
    .line 969
    aget-object v6, v4, v5

    .line 970
    .line 971
    if-eqz v6, :cond_2e

    .line 972
    .line 973
    iget-object v6, v6, Lm5/q;->b:[I

    .line 974
    .line 975
    array-length v6, v6

    .line 976
    const/4 v15, 0x1

    .line 977
    if-le v6, v15, :cond_2e

    .line 978
    .line 979
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 980
    .line 981
    .line 982
    move-result-object v6

    .line 983
    new-instance v11, Lm5/a;

    .line 984
    .line 985
    invoke-direct {v11, v7, v8, v7, v8}, Lm5/a;-><init>(JJ)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v6, v11}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-object/from16 v6, v16

    .line 995
    .line 996
    goto :goto_24

    .line 997
    :cond_2e
    move-object/from16 v6, v16

    .line 998
    .line 999
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    :goto_24
    add-int/lit8 v5, v5, 0x1

    .line 1003
    .line 1004
    move-object/from16 v16, v6

    .line 1005
    .line 1006
    goto :goto_23

    .line 1007
    :cond_2f
    move-object/from16 v6, v16

    .line 1008
    .line 1009
    array-length v5, v4

    .line 1010
    new-array v11, v5, [[J

    .line 1011
    .line 1012
    const/4 v12, 0x0

    .line 1013
    :goto_25
    array-length v14, v4

    .line 1014
    const-wide/16 v15, -0x1

    .line 1015
    .line 1016
    if-ge v12, v14, :cond_33

    .line 1017
    .line 1018
    aget-object v14, v4, v12

    .line 1019
    .line 1020
    if-nez v14, :cond_30

    .line 1021
    .line 1022
    const/4 v6, 0x0

    .line 1023
    new-array v14, v6, [J

    .line 1024
    .line 1025
    aput-object v14, v11, v12

    .line 1026
    .line 1027
    move-object/from16 v22, v11

    .line 1028
    .line 1029
    goto :goto_27

    .line 1030
    :cond_30
    iget-object v6, v14, Lm5/q;->b:[I

    .line 1031
    .line 1032
    array-length v7, v6

    .line 1033
    new-array v7, v7, [J

    .line 1034
    .line 1035
    aput-object v7, v11, v12

    .line 1036
    .line 1037
    const/4 v7, 0x0

    .line 1038
    :goto_26
    array-length v8, v6

    .line 1039
    if-ge v7, v8, :cond_32

    .line 1040
    .line 1041
    iget-object v8, v14, Lm5/q;->a:Lm4/j1;

    .line 1042
    .line 1043
    aget v22, v6, v7

    .line 1044
    .line 1045
    iget-object v8, v8, Lm4/j1;->d:[Lm4/q;

    .line 1046
    .line 1047
    aget-object v8, v8, v22

    .line 1048
    .line 1049
    iget v8, v8, Lm4/q;->j:I

    .line 1050
    .line 1051
    move-object/from16 v22, v11

    .line 1052
    .line 1053
    int-to-long v10, v8

    .line 1054
    aget-object v8, v22, v12

    .line 1055
    .line 1056
    cmp-long v24, v10, v15

    .line 1057
    .line 1058
    if-nez v24, :cond_31

    .line 1059
    .line 1060
    const-wide/16 v10, 0x0

    .line 1061
    .line 1062
    :cond_31
    aput-wide v10, v8, v7

    .line 1063
    .line 1064
    add-int/lit8 v7, v7, 0x1

    .line 1065
    .line 1066
    move-object/from16 v11, v22

    .line 1067
    .line 1068
    const/4 v10, -0x1

    .line 1069
    goto :goto_26

    .line 1070
    :cond_32
    move-object/from16 v22, v11

    .line 1071
    .line 1072
    aget-object v6, v22, v12

    .line 1073
    .line 1074
    invoke-static {v6}, Ljava/util/Arrays;->sort([J)V

    .line 1075
    .line 1076
    .line 1077
    :goto_27
    add-int/lit8 v12, v12, 0x1

    .line 1078
    .line 1079
    move-object/from16 v11, v22

    .line 1080
    .line 1081
    const/4 v6, 0x0

    .line 1082
    const-wide/16 v7, 0x0

    .line 1083
    .line 1084
    const/4 v10, -0x1

    .line 1085
    goto :goto_25

    .line 1086
    :cond_33
    move-object/from16 v22, v11

    .line 1087
    .line 1088
    new-array v6, v5, [I

    .line 1089
    .line 1090
    new-array v7, v5, [J

    .line 1091
    .line 1092
    const/4 v8, 0x0

    .line 1093
    :goto_28
    if-ge v8, v5, :cond_35

    .line 1094
    .line 1095
    aget-object v10, v22, v8

    .line 1096
    .line 1097
    array-length v11, v10

    .line 1098
    if-nez v11, :cond_34

    .line 1099
    .line 1100
    const-wide/16 v11, 0x0

    .line 1101
    .line 1102
    goto :goto_29

    .line 1103
    :cond_34
    const/4 v14, 0x0

    .line 1104
    aget-wide v11, v10, v14

    .line 1105
    .line 1106
    :goto_29
    aput-wide v11, v7, v8

    .line 1107
    .line 1108
    add-int/lit8 v8, v8, 0x1

    .line 1109
    .line 1110
    goto :goto_28

    .line 1111
    :cond_35
    invoke-static {v0, v7}, Lm5/b;->v(Ljava/util/ArrayList;[J)V

    .line 1112
    .line 1113
    .line 1114
    const-string v8, "expectedValuesPerKey"

    .line 1115
    .line 1116
    const/4 v14, 0x2

    .line 1117
    invoke-static {v14, v8}, Lya/q;->d(ILjava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    new-instance v8, Ljava/util/TreeMap;

    .line 1121
    .line 1122
    sget-object v10, Lya/x0;->b:Lya/x0;

    .line 1123
    .line 1124
    invoke-direct {v8, v10}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 1125
    .line 1126
    .line 1127
    new-instance v10, Lya/u0;

    .line 1128
    .line 1129
    invoke-direct {v10}, Lya/u0;-><init>()V

    .line 1130
    .line 1131
    .line 1132
    new-instance v11, Lya/v0;

    .line 1133
    .line 1134
    invoke-direct {v11, v8}, Lya/v0;-><init>(Ljava/util/Map;)V

    .line 1135
    .line 1136
    .line 1137
    iput-object v10, v11, Lya/v0;->f:Lya/u0;

    .line 1138
    .line 1139
    const/4 v8, 0x0

    .line 1140
    :goto_2a
    if-ge v8, v5, :cond_3e

    .line 1141
    .line 1142
    aget-object v10, v22, v8

    .line 1143
    .line 1144
    array-length v12, v10

    .line 1145
    const/4 v14, 0x1

    .line 1146
    if-gt v12, v14, :cond_37

    .line 1147
    .line 1148
    move-object/from16 v26, v6

    .line 1149
    .line 1150
    move-wide/from16 v20, v15

    .line 1151
    .line 1152
    move/from16 v16, v5

    .line 1153
    .line 1154
    :cond_36
    move/from16 v30, v8

    .line 1155
    .line 1156
    goto/16 :goto_30

    .line 1157
    .line 1158
    :cond_37
    array-length v10, v10

    .line 1159
    new-array v12, v10, [D

    .line 1160
    .line 1161
    move-wide/from16 v20, v15

    .line 1162
    .line 1163
    const/4 v14, 0x0

    .line 1164
    :goto_2b
    aget-object v15, v22, v8

    .line 1165
    .line 1166
    move/from16 v16, v5

    .line 1167
    .line 1168
    array-length v5, v15

    .line 1169
    const-wide/16 v24, 0x0

    .line 1170
    .line 1171
    if-ge v14, v5, :cond_39

    .line 1172
    .line 1173
    move-object/from16 v26, v6

    .line 1174
    .line 1175
    aget-wide v5, v15, v14

    .line 1176
    .line 1177
    cmp-long v15, v5, v20

    .line 1178
    .line 1179
    if-nez v15, :cond_38

    .line 1180
    .line 1181
    goto :goto_2c

    .line 1182
    :cond_38
    long-to-double v5, v5

    .line 1183
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    .line 1184
    .line 1185
    .line 1186
    move-result-wide v24

    .line 1187
    :goto_2c
    aput-wide v24, v12, v14

    .line 1188
    .line 1189
    add-int/lit8 v14, v14, 0x1

    .line 1190
    .line 1191
    move/from16 v5, v16

    .line 1192
    .line 1193
    move-object/from16 v6, v26

    .line 1194
    .line 1195
    goto :goto_2b

    .line 1196
    :cond_39
    move-object/from16 v26, v6

    .line 1197
    .line 1198
    add-int/lit8 v10, v10, -0x1

    .line 1199
    .line 1200
    aget-wide v5, v12, v10

    .line 1201
    .line 1202
    const/4 v14, 0x0

    .line 1203
    aget-wide v27, v12, v14

    .line 1204
    .line 1205
    sub-double v5, v5, v27

    .line 1206
    .line 1207
    const/4 v14, 0x0

    .line 1208
    :goto_2d
    if-ge v14, v10, :cond_36

    .line 1209
    .line 1210
    aget-wide v27, v12, v14

    .line 1211
    .line 1212
    add-int/lit8 v14, v14, 0x1

    .line 1213
    .line 1214
    aget-wide v29, v12, v14

    .line 1215
    .line 1216
    add-double v27, v27, v29

    .line 1217
    .line 1218
    const-wide/high16 v29, 0x3fe0000000000000L    # 0.5

    .line 1219
    .line 1220
    mul-double v27, v27, v29

    .line 1221
    .line 1222
    cmpl-double v15, v5, v24

    .line 1223
    .line 1224
    if-nez v15, :cond_3a

    .line 1225
    .line 1226
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    .line 1227
    .line 1228
    goto :goto_2e

    .line 1229
    :cond_3a
    const/4 v15, 0x0

    .line 1230
    aget-wide v29, v12, v15

    .line 1231
    .line 1232
    sub-double v27, v27, v29

    .line 1233
    .line 1234
    div-double v27, v27, v5

    .line 1235
    .line 1236
    :goto_2e
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v15

    .line 1240
    move-wide/from16 v27, v5

    .line 1241
    .line 1242
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v5

    .line 1246
    iget-object v6, v11, Lya/v0;->d:Ljava/util/Map;

    .line 1247
    .line 1248
    invoke-interface {v6, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v29

    .line 1252
    move/from16 v30, v8

    .line 1253
    .line 1254
    move-object/from16 v8, v29

    .line 1255
    .line 1256
    check-cast v8, Ljava/util/Collection;

    .line 1257
    .line 1258
    if-nez v8, :cond_3c

    .line 1259
    .line 1260
    invoke-virtual {v11}, Lya/v0;->c()Ljava/util/Collection;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v8

    .line 1264
    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1265
    .line 1266
    .line 1267
    move-result v5

    .line 1268
    if-eqz v5, :cond_3b

    .line 1269
    .line 1270
    iget v5, v11, Lya/v0;->e:I

    .line 1271
    .line 1272
    const/16 v17, 0x1

    .line 1273
    .line 1274
    add-int/lit8 v5, v5, 0x1

    .line 1275
    .line 1276
    iput v5, v11, Lya/v0;->e:I

    .line 1277
    .line 1278
    invoke-interface {v6, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    goto :goto_2f

    .line 1282
    :cond_3b
    new-instance v0, Ljava/lang/AssertionError;

    .line 1283
    .line 1284
    const-string v2, "New Collection violated the Collection spec"

    .line 1285
    .line 1286
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1287
    .line 1288
    .line 1289
    throw v0

    .line 1290
    :cond_3c
    const/16 v17, 0x1

    .line 1291
    .line 1292
    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1293
    .line 1294
    .line 1295
    move-result v5

    .line 1296
    if-eqz v5, :cond_3d

    .line 1297
    .line 1298
    iget v5, v11, Lya/v0;->e:I

    .line 1299
    .line 1300
    add-int/lit8 v5, v5, 0x1

    .line 1301
    .line 1302
    iput v5, v11, Lya/v0;->e:I

    .line 1303
    .line 1304
    :cond_3d
    :goto_2f
    move-wide/from16 v5, v27

    .line 1305
    .line 1306
    move/from16 v8, v30

    .line 1307
    .line 1308
    goto :goto_2d

    .line 1309
    :goto_30
    add-int/lit8 v8, v30, 0x1

    .line 1310
    .line 1311
    move/from16 v5, v16

    .line 1312
    .line 1313
    move-wide/from16 v15, v20

    .line 1314
    .line 1315
    move-object/from16 v6, v26

    .line 1316
    .line 1317
    const/4 v14, 0x2

    .line 1318
    goto/16 :goto_2a

    .line 1319
    .line 1320
    :cond_3e
    move-object/from16 v26, v6

    .line 1321
    .line 1322
    iget-object v5, v11, Lya/o;->b:Lya/n;

    .line 1323
    .line 1324
    if-nez v5, :cond_3f

    .line 1325
    .line 1326
    new-instance v5, Lya/n;

    .line 1327
    .line 1328
    const/4 v14, 0x0

    .line 1329
    invoke-direct {v5, v14, v11}, Lya/n;-><init>(ILjava/io/Serializable;)V

    .line 1330
    .line 1331
    .line 1332
    iput-object v5, v11, Lya/o;->b:Lya/n;

    .line 1333
    .line 1334
    :cond_3f
    invoke-static {v5}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v5

    .line 1338
    const/4 v6, 0x0

    .line 1339
    :goto_31
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    .line 1340
    .line 1341
    .line 1342
    move-result v8

    .line 1343
    if-ge v6, v8, :cond_40

    .line 1344
    .line 1345
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v8

    .line 1349
    check-cast v8, Ljava/lang/Integer;

    .line 1350
    .line 1351
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1352
    .line 1353
    .line 1354
    move-result v8

    .line 1355
    aget v10, v26, v8

    .line 1356
    .line 1357
    const/16 v17, 0x1

    .line 1358
    .line 1359
    add-int/lit8 v10, v10, 0x1

    .line 1360
    .line 1361
    aput v10, v26, v8

    .line 1362
    .line 1363
    aget-object v11, v22, v8

    .line 1364
    .line 1365
    aget-wide v10, v11, v10

    .line 1366
    .line 1367
    aput-wide v10, v7, v8

    .line 1368
    .line 1369
    invoke-static {v0, v7}, Lm5/b;->v(Ljava/util/ArrayList;[J)V

    .line 1370
    .line 1371
    .line 1372
    add-int/lit8 v6, v6, 0x1

    .line 1373
    .line 1374
    goto :goto_31

    .line 1375
    :cond_40
    const/4 v5, 0x0

    .line 1376
    :goto_32
    array-length v6, v4

    .line 1377
    if-ge v5, v6, :cond_42

    .line 1378
    .line 1379
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v6

    .line 1383
    if-eqz v6, :cond_41

    .line 1384
    .line 1385
    aget-wide v10, v7, v5

    .line 1386
    .line 1387
    const-wide/16 v14, 0x2

    .line 1388
    .line 1389
    mul-long v10, v10, v14

    .line 1390
    .line 1391
    aput-wide v10, v7, v5

    .line 1392
    .line 1393
    :cond_41
    add-int/lit8 v5, v5, 0x1

    .line 1394
    .line 1395
    goto :goto_32

    .line 1396
    :cond_42
    invoke-static {v0, v7}, Lm5/b;->v(Ljava/util/ArrayList;[J)V

    .line 1397
    .line 1398
    .line 1399
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v5

    .line 1403
    const/4 v6, 0x0

    .line 1404
    :goto_33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1405
    .line 1406
    .line 1407
    move-result v7

    .line 1408
    if-ge v6, v7, :cond_44

    .line 1409
    .line 1410
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v7

    .line 1414
    check-cast v7, Lya/f0;

    .line 1415
    .line 1416
    if-nez v7, :cond_43

    .line 1417
    .line 1418
    sget-object v7, Lya/a1;->e:Lya/a1;

    .line 1419
    .line 1420
    goto :goto_34

    .line 1421
    :cond_43
    invoke-virtual {v7}, Lya/f0;->f()Lya/a1;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v7

    .line 1425
    :goto_34
    invoke-virtual {v5, v7}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    add-int/lit8 v6, v6, 0x1

    .line 1429
    .line 1430
    goto :goto_33

    .line 1431
    :cond_44
    invoke-virtual {v5}, Lya/f0;->f()Lya/a1;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    array-length v5, v4

    .line 1436
    new-array v5, v5, [Lm5/r;

    .line 1437
    .line 1438
    const/4 v6, 0x0

    .line 1439
    :goto_35
    array-length v7, v4

    .line 1440
    if-ge v6, v7, :cond_48

    .line 1441
    .line 1442
    aget-object v7, v4, v6

    .line 1443
    .line 1444
    if-eqz v7, :cond_47

    .line 1445
    .line 1446
    iget-object v8, v7, Lm5/q;->b:[I

    .line 1447
    .line 1448
    array-length v10, v8

    .line 1449
    if-nez v10, :cond_45

    .line 1450
    .line 1451
    goto :goto_37

    .line 1452
    :cond_45
    array-length v10, v8

    .line 1453
    const/4 v15, 0x1

    .line 1454
    if-ne v10, v15, :cond_46

    .line 1455
    .line 1456
    new-instance v10, Lm5/s;

    .line 1457
    .line 1458
    iget-object v7, v7, Lm5/q;->a:Lm4/j1;

    .line 1459
    .line 1460
    const/4 v14, 0x0

    .line 1461
    aget v8, v8, v14

    .line 1462
    .line 1463
    filled-new-array {v8}, [I

    .line 1464
    .line 1465
    .line 1466
    move-result-object v8

    .line 1467
    invoke-direct {v10, v7, v8}, Lm5/c;-><init>(Lm4/j1;[I)V

    .line 1468
    .line 1469
    .line 1470
    goto :goto_36

    .line 1471
    :cond_46
    iget-object v7, v7, Lm5/q;->a:Lm4/j1;

    .line 1472
    .line 1473
    invoke-virtual {v0, v6}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v10

    .line 1477
    move-object/from16 v30, v10

    .line 1478
    .line 1479
    check-cast v30, Lya/i0;

    .line 1480
    .line 1481
    new-instance v20, Lm5/b;

    .line 1482
    .line 1483
    const/16 v10, 0x2710

    .line 1484
    .line 1485
    int-to-long v10, v10

    .line 1486
    const/16 v12, 0x61a8

    .line 1487
    .line 1488
    int-to-long v14, v12

    .line 1489
    move-wide/from16 v28, v14

    .line 1490
    .line 1491
    move-object/from16 v21, v7

    .line 1492
    .line 1493
    move-object/from16 v22, v8

    .line 1494
    .line 1495
    move-wide/from16 v24, v10

    .line 1496
    .line 1497
    move-wide/from16 v26, v14

    .line 1498
    .line 1499
    invoke-direct/range {v20 .. v30}, Lm5/b;-><init>(Lm4/j1;[ILn5/e;JJJLya/i0;)V

    .line 1500
    .line 1501
    .line 1502
    move-object/from16 v10, v20

    .line 1503
    .line 1504
    :goto_36
    aput-object v10, v5, v6

    .line 1505
    .line 1506
    :cond_47
    :goto_37
    add-int/lit8 v6, v6, 0x1

    .line 1507
    .line 1508
    goto :goto_35

    .line 1509
    :cond_48
    new-array v0, v2, [Lv4/z0;

    .line 1510
    .line 1511
    const/4 v4, 0x0

    .line 1512
    :goto_38
    const/4 v6, -0x2

    .line 1513
    if-ge v4, v2, :cond_4c

    .line 1514
    .line 1515
    iget-object v7, v9, Lm5/t;->b:[I

    .line 1516
    .line 1517
    aget v7, v7, v4

    .line 1518
    .line 1519
    iget-object v8, v3, Lm5/j;->s0:Landroid/util/SparseBooleanArray;

    .line 1520
    .line 1521
    invoke-virtual {v8, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1522
    .line 1523
    .line 1524
    move-result v8

    .line 1525
    if-nez v8, :cond_4b

    .line 1526
    .line 1527
    iget-object v8, v3, Lm4/o1;->C:Lya/m0;

    .line 1528
    .line 1529
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v7

    .line 1533
    invoke-virtual {v8, v7}, Lya/d0;->contains(Ljava/lang/Object;)Z

    .line 1534
    .line 1535
    .line 1536
    move-result v7

    .line 1537
    if-eqz v7, :cond_49

    .line 1538
    .line 1539
    goto :goto_39

    .line 1540
    :cond_49
    iget-object v7, v9, Lm5/t;->b:[I

    .line 1541
    .line 1542
    aget v7, v7, v4

    .line 1543
    .line 1544
    if-eq v7, v6, :cond_4a

    .line 1545
    .line 1546
    aget-object v6, v5, v4

    .line 1547
    .line 1548
    if-eqz v6, :cond_4b

    .line 1549
    .line 1550
    :cond_4a
    sget-object v6, Lv4/z0;->c:Lv4/z0;

    .line 1551
    .line 1552
    goto :goto_3a

    .line 1553
    :cond_4b
    :goto_39
    const/4 v6, 0x0

    .line 1554
    :goto_3a
    aput-object v6, v0, v4

    .line 1555
    .line 1556
    add-int/lit8 v4, v4, 0x1

    .line 1557
    .line 1558
    goto :goto_38

    .line 1559
    :cond_4c
    iget-object v2, v3, Lm4/o1;->t:Lm4/m1;

    .line 1560
    .line 1561
    iget v2, v2, Lm4/m1;->a:I

    .line 1562
    .line 1563
    if-eqz v2, :cond_52

    .line 1564
    .line 1565
    const/4 v2, 0x0

    .line 1566
    const/4 v4, -0x1

    .line 1567
    const/4 v8, 0x0

    .line 1568
    :goto_3b
    iget v7, v9, Lm5/t;->a:I

    .line 1569
    .line 1570
    if-ge v8, v7, :cond_4f

    .line 1571
    .line 1572
    iget-object v7, v9, Lm5/t;->b:[I

    .line 1573
    .line 1574
    aget v7, v7, v8

    .line 1575
    .line 1576
    aget-object v10, v5, v8

    .line 1577
    .line 1578
    const/4 v15, 0x1

    .line 1579
    if-eq v7, v15, :cond_4d

    .line 1580
    .line 1581
    if-eqz v10, :cond_4d

    .line 1582
    .line 1583
    goto :goto_3e

    .line 1584
    :cond_4d
    if-ne v7, v15, :cond_4e

    .line 1585
    .line 1586
    if-eqz v10, :cond_4e

    .line 1587
    .line 1588
    invoke-interface {v10}, Lm5/r;->length()I

    .line 1589
    .line 1590
    .line 1591
    move-result v7

    .line 1592
    if-ne v7, v15, :cond_4e

    .line 1593
    .line 1594
    iget-object v7, v9, Lm5/t;->c:[Lj5/o1;

    .line 1595
    .line 1596
    aget-object v7, v7, v8

    .line 1597
    .line 1598
    invoke-interface {v10}, Lm5/r;->b()Lm4/j1;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v11

    .line 1602
    invoke-virtual {v7, v11}, Lj5/o1;->b(Lm4/j1;)I

    .line 1603
    .line 1604
    .line 1605
    move-result v7

    .line 1606
    aget-object v11, v13, v8

    .line 1607
    .line 1608
    aget-object v7, v11, v7

    .line 1609
    .line 1610
    const/4 v14, 0x0

    .line 1611
    invoke-interface {v10, v14}, Lm5/r;->i(I)I

    .line 1612
    .line 1613
    .line 1614
    move-result v11

    .line 1615
    aget v7, v7, v11

    .line 1616
    .line 1617
    invoke-interface {v10}, Lm5/r;->m()Lm4/q;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v10

    .line 1621
    invoke-static {v3, v7, v10}, Lm5/p;->l(Lm5/j;ILm4/q;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v7

    .line 1625
    if-eqz v7, :cond_4e

    .line 1626
    .line 1627
    add-int/lit8 v2, v2, 0x1

    .line 1628
    .line 1629
    move v4, v8

    .line 1630
    :cond_4e
    add-int/lit8 v8, v8, 0x1

    .line 1631
    .line 1632
    goto :goto_3b

    .line 1633
    :cond_4f
    const/4 v15, 0x1

    .line 1634
    if-ne v2, v15, :cond_52

    .line 1635
    .line 1636
    new-instance v2, Lv4/z0;

    .line 1637
    .line 1638
    iget-object v3, v3, Lm4/o1;->t:Lm4/m1;

    .line 1639
    .line 1640
    iget-boolean v3, v3, Lm4/m1;->b:Z

    .line 1641
    .line 1642
    if-eqz v3, :cond_50

    .line 1643
    .line 1644
    const/4 v8, 0x1

    .line 1645
    goto :goto_3c

    .line 1646
    :cond_50
    const/4 v8, 0x2

    .line 1647
    :goto_3c
    aget-object v3, v0, v4

    .line 1648
    .line 1649
    if-eqz v3, :cond_51

    .line 1650
    .line 1651
    iget-boolean v3, v3, Lv4/z0;->b:Z

    .line 1652
    .line 1653
    if-eqz v3, :cond_51

    .line 1654
    .line 1655
    const/4 v3, 0x1

    .line 1656
    goto :goto_3d

    .line 1657
    :cond_51
    const/4 v3, 0x0

    .line 1658
    :goto_3d
    invoke-direct {v2, v8, v3}, Lv4/z0;-><init>(IZ)V

    .line 1659
    .line 1660
    .line 1661
    aput-object v2, v0, v4

    .line 1662
    .line 1663
    :cond_52
    :goto_3e
    invoke-static {v0, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v0

    .line 1667
    iget-object v2, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v2, [Lm5/r;

    .line 1670
    .line 1671
    array-length v3, v2

    .line 1672
    new-array v3, v3, [Ljava/util/List;

    .line 1673
    .line 1674
    const/4 v8, 0x0

    .line 1675
    :goto_3f
    array-length v4, v2

    .line 1676
    if-ge v8, v4, :cond_54

    .line 1677
    .line 1678
    aget-object v4, v2, v8

    .line 1679
    .line 1680
    if-eqz v4, :cond_53

    .line 1681
    .line 1682
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v4

    .line 1686
    goto :goto_40

    .line 1687
    :cond_53
    sget-object v4, Lya/i0;->b:Lya/g0;

    .line 1688
    .line 1689
    sget-object v4, Lya/a1;->e:Lya/a1;

    .line 1690
    .line 1691
    :goto_40
    aput-object v4, v3, v8

    .line 1692
    .line 1693
    add-int/lit8 v8, v8, 0x1

    .line 1694
    .line 1695
    goto :goto_3f

    .line 1696
    :cond_54
    new-instance v2, Lya/f0;

    .line 1697
    .line 1698
    const/4 v4, 0x4

    .line 1699
    invoke-direct {v2, v4}, Lya/c0;-><init>(I)V

    .line 1700
    .line 1701
    .line 1702
    const/4 v8, 0x0

    .line 1703
    :goto_41
    iget v4, v9, Lm5/t;->a:I

    .line 1704
    .line 1705
    iget-object v5, v9, Lm5/t;->c:[Lj5/o1;

    .line 1706
    .line 1707
    if-ge v8, v4, :cond_60

    .line 1708
    .line 1709
    aget-object v4, v5, v8

    .line 1710
    .line 1711
    aget-object v7, v3, v8

    .line 1712
    .line 1713
    const/4 v10, 0x0

    .line 1714
    :goto_42
    iget v11, v4, Lj5/o1;->a:I

    .line 1715
    .line 1716
    if-ge v10, v11, :cond_5f

    .line 1717
    .line 1718
    invoke-virtual {v4, v10}, Lj5/o1;->a(I)Lm4/j1;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v11

    .line 1722
    aget-object v12, v5, v8

    .line 1723
    .line 1724
    invoke-virtual {v12, v10}, Lj5/o1;->a(I)Lm4/j1;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v12

    .line 1728
    iget v12, v12, Lm4/j1;->a:I

    .line 1729
    .line 1730
    new-array v13, v12, [I

    .line 1731
    .line 1732
    const/4 v14, 0x0

    .line 1733
    const/4 v15, 0x0

    .line 1734
    :goto_43
    if-ge v14, v12, :cond_56

    .line 1735
    .line 1736
    iget-object v6, v9, Lm5/t;->e:[[[I

    .line 1737
    .line 1738
    aget-object v6, v6, v8

    .line 1739
    .line 1740
    aget-object v6, v6, v10

    .line 1741
    .line 1742
    aget v6, v6, v14

    .line 1743
    .line 1744
    and-int/lit8 v6, v6, 0x7

    .line 1745
    .line 1746
    move-object/from16 v19, v3

    .line 1747
    .line 1748
    const/4 v3, 0x4

    .line 1749
    if-eq v6, v3, :cond_55

    .line 1750
    .line 1751
    goto :goto_44

    .line 1752
    :cond_55
    add-int/lit8 v6, v15, 0x1

    .line 1753
    .line 1754
    aput v14, v13, v15

    .line 1755
    .line 1756
    move v15, v6

    .line 1757
    :goto_44
    add-int/lit8 v14, v14, 0x1

    .line 1758
    .line 1759
    move-object/from16 v3, v19

    .line 1760
    .line 1761
    const/4 v6, -0x2

    .line 1762
    goto :goto_43

    .line 1763
    :cond_56
    move-object/from16 v19, v3

    .line 1764
    .line 1765
    const/4 v3, 0x4

    .line 1766
    invoke-static {v13, v15}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1767
    .line 1768
    .line 1769
    move-result-object v6

    .line 1770
    const/16 v12, 0x10

    .line 1771
    .line 1772
    move-object/from16 v20, v4

    .line 1773
    .line 1774
    const/4 v3, 0x0

    .line 1775
    const/4 v12, 0x0

    .line 1776
    const/4 v13, 0x0

    .line 1777
    const/4 v14, 0x0

    .line 1778
    const/16 v15, 0x10

    .line 1779
    .line 1780
    :goto_45
    array-length v4, v6

    .line 1781
    if-ge v12, v4, :cond_58

    .line 1782
    .line 1783
    aget v4, v6, v12

    .line 1784
    .line 1785
    move/from16 v21, v4

    .line 1786
    .line 1787
    aget-object v4, v5, v8

    .line 1788
    .line 1789
    invoke-virtual {v4, v10}, Lj5/o1;->a(I)Lm4/j1;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v4

    .line 1793
    iget-object v4, v4, Lm4/j1;->d:[Lm4/q;

    .line 1794
    .line 1795
    aget-object v4, v4, v21

    .line 1796
    .line 1797
    iget-object v4, v4, Lm4/q;->n:Ljava/lang/String;

    .line 1798
    .line 1799
    add-int/lit8 v21, v14, 0x1

    .line 1800
    .line 1801
    if-nez v14, :cond_57

    .line 1802
    .line 1803
    move-object v3, v4

    .line 1804
    const/16 v17, 0x1

    .line 1805
    .line 1806
    goto :goto_46

    .line 1807
    :cond_57
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v4

    .line 1811
    const/16 v17, 0x1

    .line 1812
    .line 1813
    xor-int/lit8 v4, v4, 0x1

    .line 1814
    .line 1815
    or-int/2addr v4, v13

    .line 1816
    move v13, v4

    .line 1817
    :goto_46
    iget-object v4, v9, Lm5/t;->e:[[[I

    .line 1818
    .line 1819
    aget-object v4, v4, v8

    .line 1820
    .line 1821
    aget-object v4, v4, v10

    .line 1822
    .line 1823
    aget v4, v4, v12

    .line 1824
    .line 1825
    and-int/lit8 v4, v4, 0x18

    .line 1826
    .line 1827
    invoke-static {v15, v4}, Ljava/lang/Math;->min(II)I

    .line 1828
    .line 1829
    .line 1830
    move-result v15

    .line 1831
    add-int/lit8 v12, v12, 0x1

    .line 1832
    .line 1833
    move/from16 v14, v21

    .line 1834
    .line 1835
    goto :goto_45

    .line 1836
    :cond_58
    const/16 v17, 0x1

    .line 1837
    .line 1838
    if-eqz v13, :cond_59

    .line 1839
    .line 1840
    iget-object v3, v9, Lm5/t;->d:[I

    .line 1841
    .line 1842
    aget v3, v3, v8

    .line 1843
    .line 1844
    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    .line 1845
    .line 1846
    .line 1847
    move-result v15

    .line 1848
    :cond_59
    if-eqz v15, :cond_5a

    .line 1849
    .line 1850
    const/4 v3, 0x1

    .line 1851
    goto :goto_47

    .line 1852
    :cond_5a
    const/4 v3, 0x0

    .line 1853
    :goto_47
    iget v4, v11, Lm4/j1;->a:I

    .line 1854
    .line 1855
    new-array v6, v4, [I

    .line 1856
    .line 1857
    new-array v4, v4, [Z

    .line 1858
    .line 1859
    const/4 v12, 0x0

    .line 1860
    :goto_48
    iget v13, v11, Lm4/j1;->a:I

    .line 1861
    .line 1862
    if-ge v12, v13, :cond_5e

    .line 1863
    .line 1864
    iget-object v13, v9, Lm5/t;->e:[[[I

    .line 1865
    .line 1866
    aget-object v13, v13, v8

    .line 1867
    .line 1868
    aget-object v13, v13, v10

    .line 1869
    .line 1870
    aget v13, v13, v12

    .line 1871
    .line 1872
    and-int/lit8 v13, v13, 0x7

    .line 1873
    .line 1874
    aput v13, v6, v12

    .line 1875
    .line 1876
    const/4 v13, 0x0

    .line 1877
    :goto_49
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1878
    .line 1879
    .line 1880
    move-result v14

    .line 1881
    if-ge v13, v14, :cond_5d

    .line 1882
    .line 1883
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v14

    .line 1887
    check-cast v14, Lm5/r;

    .line 1888
    .line 1889
    invoke-interface {v14}, Lm5/r;->b()Lm4/j1;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v15

    .line 1893
    invoke-virtual {v15, v11}, Lm4/j1;->equals(Ljava/lang/Object;)Z

    .line 1894
    .line 1895
    .line 1896
    move-result v15

    .line 1897
    if-eqz v15, :cond_5b

    .line 1898
    .line 1899
    invoke-interface {v14, v12}, Lm5/r;->u(I)I

    .line 1900
    .line 1901
    .line 1902
    move-result v14

    .line 1903
    const/4 v15, -0x1

    .line 1904
    if-eq v14, v15, :cond_5c

    .line 1905
    .line 1906
    const/4 v13, 0x1

    .line 1907
    goto :goto_4a

    .line 1908
    :cond_5b
    const/4 v15, -0x1

    .line 1909
    :cond_5c
    add-int/lit8 v13, v13, 0x1

    .line 1910
    .line 1911
    goto :goto_49

    .line 1912
    :cond_5d
    const/4 v15, -0x1

    .line 1913
    const/4 v13, 0x0

    .line 1914
    :goto_4a
    aput-boolean v13, v4, v12

    .line 1915
    .line 1916
    add-int/lit8 v12, v12, 0x1

    .line 1917
    .line 1918
    goto :goto_48

    .line 1919
    :cond_5e
    const/4 v15, -0x1

    .line 1920
    new-instance v12, Lm4/p1;

    .line 1921
    .line 1922
    invoke-direct {v12, v11, v3, v6, v4}, Lm4/p1;-><init>(Lm4/j1;Z[I[Z)V

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v2, v12}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1926
    .line 1927
    .line 1928
    add-int/lit8 v10, v10, 0x1

    .line 1929
    .line 1930
    move-object/from16 v3, v19

    .line 1931
    .line 1932
    move-object/from16 v4, v20

    .line 1933
    .line 1934
    const/4 v6, -0x2

    .line 1935
    goto/16 :goto_42

    .line 1936
    .line 1937
    :cond_5f
    move-object/from16 v19, v3

    .line 1938
    .line 1939
    const/4 v15, -0x1

    .line 1940
    const/16 v17, 0x1

    .line 1941
    .line 1942
    add-int/lit8 v8, v8, 0x1

    .line 1943
    .line 1944
    const/4 v6, -0x2

    .line 1945
    goto/16 :goto_41

    .line 1946
    .line 1947
    :cond_60
    const/16 v17, 0x1

    .line 1948
    .line 1949
    iget-object v3, v9, Lm5/t;->f:Lj5/o1;

    .line 1950
    .line 1951
    const/4 v8, 0x0

    .line 1952
    :goto_4b
    iget v4, v3, Lj5/o1;->a:I

    .line 1953
    .line 1954
    if-ge v8, v4, :cond_61

    .line 1955
    .line 1956
    invoke-virtual {v3, v8}, Lj5/o1;->a(I)Lm4/j1;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v4

    .line 1960
    iget v5, v4, Lm4/j1;->a:I

    .line 1961
    .line 1962
    new-array v5, v5, [I

    .line 1963
    .line 1964
    const/4 v14, 0x0

    .line 1965
    invoke-static {v5, v14}, Ljava/util/Arrays;->fill([II)V

    .line 1966
    .line 1967
    .line 1968
    iget v6, v4, Lm4/j1;->a:I

    .line 1969
    .line 1970
    new-array v6, v6, [Z

    .line 1971
    .line 1972
    new-instance v7, Lm4/p1;

    .line 1973
    .line 1974
    invoke-direct {v7, v4, v14, v5, v6}, Lm4/p1;-><init>(Lm4/j1;Z[I[Z)V

    .line 1975
    .line 1976
    .line 1977
    invoke-virtual {v2, v7}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1978
    .line 1979
    .line 1980
    add-int/lit8 v8, v8, 0x1

    .line 1981
    .line 1982
    goto :goto_4b

    .line 1983
    :cond_61
    const/4 v14, 0x0

    .line 1984
    new-instance v3, Lm4/q1;

    .line 1985
    .line 1986
    invoke-virtual {v2}, Lya/f0;->f()Lya/a1;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v2

    .line 1990
    invoke-direct {v3, v2}, Lm4/q1;-><init>(Lya/a1;)V

    .line 1991
    .line 1992
    .line 1993
    new-instance v2, Lm5/u;

    .line 1994
    .line 1995
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1996
    .line 1997
    check-cast v4, [Lv4/z0;

    .line 1998
    .line 1999
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2000
    .line 2001
    check-cast v0, [Lm5/r;

    .line 2002
    .line 2003
    invoke-direct {v2, v4, v0, v3, v9}, Lm5/u;-><init>([Lv4/z0;[Lm5/r;Lm4/q1;Ljava/lang/Object;)V

    .line 2004
    .line 2005
    .line 2006
    const/4 v8, 0x0

    .line 2007
    :goto_4c
    iget v0, v2, Lm5/u;->a:I

    .line 2008
    .line 2009
    if-ge v8, v0, :cond_66

    .line 2010
    .line 2011
    invoke-virtual {v2, v8}, Lm5/u;->b(I)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v0

    .line 2015
    if-eqz v0, :cond_64

    .line 2016
    .line 2017
    iget-object v0, v2, Lm5/u;->c:[Lm5/r;

    .line 2018
    .line 2019
    aget-object v0, v0, v8

    .line 2020
    .line 2021
    if-nez v0, :cond_63

    .line 2022
    .line 2023
    iget-object v0, v1, Lv4/h0;->j:[Lv4/e;

    .line 2024
    .line 2025
    aget-object v0, v0, v8

    .line 2026
    .line 2027
    iget v0, v0, Lv4/e;->b:I

    .line 2028
    .line 2029
    const/4 v3, -0x2

    .line 2030
    if-ne v0, v3, :cond_62

    .line 2031
    .line 2032
    goto :goto_4d

    .line 2033
    :cond_62
    const/4 v0, 0x0

    .line 2034
    goto :goto_4e

    .line 2035
    :cond_63
    const/4 v3, -0x2

    .line 2036
    :goto_4d
    const/4 v0, 0x1

    .line 2037
    :goto_4e
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 2038
    .line 2039
    .line 2040
    goto :goto_50

    .line 2041
    :cond_64
    const/4 v3, -0x2

    .line 2042
    iget-object v0, v2, Lm5/u;->c:[Lm5/r;

    .line 2043
    .line 2044
    aget-object v0, v0, v8

    .line 2045
    .line 2046
    if-nez v0, :cond_65

    .line 2047
    .line 2048
    const/4 v0, 0x1

    .line 2049
    goto :goto_4f

    .line 2050
    :cond_65
    const/4 v0, 0x0

    .line 2051
    :goto_4f
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 2052
    .line 2053
    .line 2054
    :goto_50
    add-int/lit8 v8, v8, 0x1

    .line 2055
    .line 2056
    goto :goto_4c

    .line 2057
    :cond_66
    iget-object v0, v2, Lm5/u;->c:[Lm5/r;

    .line 2058
    .line 2059
    array-length v3, v0

    .line 2060
    const/4 v8, 0x0

    .line 2061
    :goto_51
    if-ge v8, v3, :cond_68

    .line 2062
    .line 2063
    aget-object v4, v0, v8

    .line 2064
    .line 2065
    move/from16 v5, p1

    .line 2066
    .line 2067
    if-eqz v4, :cond_67

    .line 2068
    .line 2069
    invoke-interface {v4, v5}, Lm5/r;->p(F)V

    .line 2070
    .line 2071
    .line 2072
    move/from16 v6, p3

    .line 2073
    .line 2074
    invoke-interface {v4, v6}, Lm5/r;->e(Z)V

    .line 2075
    .line 2076
    .line 2077
    goto :goto_52

    .line 2078
    :cond_67
    move/from16 v6, p3

    .line 2079
    .line 2080
    :goto_52
    add-int/lit8 v8, v8, 0x1

    .line 2081
    .line 2082
    goto :goto_51

    .line 2083
    :cond_68
    return-object v2

    .line 2084
    :goto_53
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2085
    throw v0
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
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lj5/d;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lv4/h0;->g:Lv4/i0;

    .line 8
    .line 9
    iget-wide v1, v1, Lv4/i0;->d:J

    .line 10
    .line 11
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v5, v1, v3

    .line 17
    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    const-wide/high16 v1, -0x8000000000000000L

    .line 21
    .line 22
    :cond_0
    check-cast v0, Lj5/d;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    iput-wide v3, v0, Lj5/d;->e:J

    .line 27
    .line 28
    iput-wide v1, v0, Lj5/d;->f:J

    .line 29
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
