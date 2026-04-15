.class public final Lte/s;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lte/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lte/s;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lte/s;->a:Lte/s;

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

.method public static a(Ljava/util/AbstractCollection;Lic/n;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "iterator(...)"

    .line 11
    .line 12
    invoke-static {p0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lse/a0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lse/a0;

    .line 49
    .line 50
    if-eq v3, v1, :cond_2

    .line 51
    .line 52
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v3, v1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return-object v0
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
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;)Lse/a0;
    .locals 19

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/16 v4, 0xa

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lse/a0;

    .line 27
    .line 28
    invoke-virtual {v2}, Lse/w;->t()Lse/k0;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    instance-of v5, v5, Lse/v;

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Lse/w;->t()Lse/k0;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v5}, Lse/k0;->i()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const-string v6, "getSupertypes(...)"

    .line 45
    .line 46
    invoke-static {v5, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v5, Ljava/lang/Iterable;

    .line 50
    .line 51
    new-instance v6, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {v5, v4}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lse/w;

    .line 75
    .line 76
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lse/c;->G(Lse/w;)Lse/a0;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v2}, Lse/w;->u()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_0

    .line 88
    .line 89
    invoke-virtual {v5, v3}, Lse/a0;->D(Z)Lse/a0;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    :cond_0
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v2, Lte/r;->a:Lte/p;

    .line 110
    .line 111
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Lse/w0;

    .line 122
    .line 123
    invoke-virtual {v2, v5}, Lte/r;->a(Lse/w0;)Lte/r;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    const-string v6, "<this>"

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    if-eqz v5, :cond_9

    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Lse/a0;

    .line 151
    .line 152
    sget-object v8, Lte/r;->d:Lte/o;

    .line 153
    .line 154
    if-ne v2, v8, :cond_8

    .line 155
    .line 156
    instance-of v8, v5, Lte/h;

    .line 157
    .line 158
    if-eqz v8, :cond_5

    .line 159
    .line 160
    check-cast v5, Lte/h;

    .line 161
    .line 162
    new-instance v8, Lte/h;

    .line 163
    .line 164
    iget-object v9, v5, Lte/h;->b:Lve/b;

    .line 165
    .line 166
    iget-object v10, v5, Lte/h;->c:Lte/i;

    .line 167
    .line 168
    iget-object v11, v5, Lte/h;->d:Lse/w0;

    .line 169
    .line 170
    iget-object v12, v5, Lte/h;->e:Lse/h0;

    .line 171
    .line 172
    iget-boolean v13, v5, Lte/h;->f:Z

    .line 173
    .line 174
    const/4 v14, 0x1

    .line 175
    invoke-direct/range {v8 .. v14}, Lte/h;-><init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZZ)V

    .line 176
    .line 177
    .line 178
    move-object v5, v8

    .line 179
    :cond_5
    invoke-static {v5, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v5, v7}, Lse/d;->p(Lse/w0;Z)Lse/l;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-eqz v6, :cond_7

    .line 187
    .line 188
    :cond_6
    move-object v5, v6

    .line 189
    goto :goto_4

    .line 190
    :cond_7
    invoke-static {v5}, Lse/c;->p(Lse/w0;)Lse/a0;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    if-nez v6, :cond_6

    .line 195
    .line 196
    invoke-virtual {v5, v7}, Lse/a0;->D(Z)Lse/a0;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    :cond_8
    :goto_4
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 205
    .line 206
    move-object/from16 v2, p1

    .line 207
    .line 208
    invoke-static {v2, v4}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Lse/a0;

    .line 230
    .line 231
    invoke-virtual {v4}, Lse/w;->r()Lse/h0;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    const-string v4, "Empty collection can\'t be reduced."

    .line 248
    .line 249
    if-eqz v2, :cond_1b

    .line 250
    .line 251
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    const/4 v8, 0x0

    .line 260
    const-string v9, "other"

    .line 261
    .line 262
    if-eqz v5, :cond_10

    .line 263
    .line 264
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    check-cast v5, Lse/h0;

    .line 269
    .line 270
    check-cast v2, Lse/h0;

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    sget-object v10, Lse/h0;->b:Lm0/w;

    .line 276
    .line 277
    invoke-static {v5, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Lye/d;->isEmpty()Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-eqz v9, :cond_b

    .line 285
    .line 286
    invoke-virtual {v5}, Lye/d;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_b

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_b
    new-instance v9, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    iget-object v10, v10, Lm0/w;->b:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v10, Ljava/util/concurrent/ConcurrentHashMap;

    .line 301
    .line 302
    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    const-string v11, "<get-values>(...)"

    .line 307
    .line 308
    invoke-static {v10, v11}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    if-eqz v11, :cond_f

    .line 320
    .line 321
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    check-cast v11, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    iget-object v12, v2, Lye/d;->a:Lye/a;

    .line 332
    .line 333
    invoke-virtual {v12, v11}, Lye/a;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v12

    .line 337
    check-cast v12, Lse/g;

    .line 338
    .line 339
    iget-object v13, v5, Lye/d;->a:Lye/a;

    .line 340
    .line 341
    invoke-virtual {v13, v11}, Lye/a;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    check-cast v11, Lse/g;

    .line 346
    .line 347
    if-nez v12, :cond_d

    .line 348
    .line 349
    if-eqz v11, :cond_c

    .line 350
    .line 351
    invoke-static {v12, v11}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v12

    .line 355
    if-eqz v12, :cond_c

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_c
    move-object v11, v8

    .line 359
    goto :goto_9

    .line 360
    :cond_d
    invoke-static {v11, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    if-eqz v11, :cond_e

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_e
    move-object v12, v8

    .line 368
    :goto_8
    move-object v11, v12

    .line 369
    :goto_9
    invoke-static {v9, v11}, Lbf/m;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_f
    invoke-static {v9}, Lm0/w;->u(Ljava/util/List;)Lse/h0;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    goto :goto_6

    .line 378
    :cond_10
    check-cast v2, Lse/h0;

    .line 379
    .line 380
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-ne v0, v3, :cond_11

    .line 385
    .line 386
    invoke-static {v1}, Lvb/m;->w0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, Lse/a0;

    .line 391
    .line 392
    goto/16 :goto_d

    .line 393
    .line 394
    :cond_11
    new-instance v10, Lc0/x;

    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const/16 v18, 0x5

    .line 399
    .line 400
    const/4 v11, 0x2

    .line 401
    const-class v13, Lte/s;

    .line 402
    .line 403
    const-string v14, "isStrictSupertype"

    .line 404
    .line 405
    const-string v15, "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z"

    .line 406
    .line 407
    const/16 v16, 0x0

    .line 408
    .line 409
    move-object/from16 v12, p0

    .line 410
    .line 411
    invoke-direct/range {v10 .. v18}, Lc0/x;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 412
    .line 413
    .line 414
    invoke-static {v1, v10}, Lte/s;->a(Ljava/util/AbstractCollection;Lic/n;)Ljava/util/ArrayList;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_12

    .line 426
    .line 427
    goto/16 :goto_c

    .line 428
    .line 429
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    if-eqz v10, :cond_1a

    .line 438
    .line 439
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 444
    .line 445
    .line 446
    move-result v10

    .line 447
    if-eqz v10, :cond_17

    .line 448
    .line 449
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    check-cast v10, Lse/a0;

    .line 454
    .line 455
    check-cast v4, Lse/a0;

    .line 456
    .line 457
    if-eqz v4, :cond_15

    .line 458
    .line 459
    if-nez v10, :cond_13

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_13
    invoke-virtual {v4}, Lse/w;->t()Lse/k0;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    invoke-virtual {v10}, Lse/w;->t()Lse/k0;

    .line 467
    .line 468
    .line 469
    move-result-object v12

    .line 470
    instance-of v13, v11, Lge/n;

    .line 471
    .line 472
    if-eqz v13, :cond_14

    .line 473
    .line 474
    instance-of v14, v12, Lge/n;

    .line 475
    .line 476
    if-eqz v14, :cond_14

    .line 477
    .line 478
    check-cast v11, Lge/n;

    .line 479
    .line 480
    iget-object v4, v11, Lge/n;->a:Ljava/util/Set;

    .line 481
    .line 482
    check-cast v12, Lge/n;

    .line 483
    .line 484
    iget-object v10, v12, Lge/n;->a:Ljava/util/Set;

    .line 485
    .line 486
    check-cast v4, Ljava/lang/Iterable;

    .line 487
    .line 488
    check-cast v10, Ljava/lang/Iterable;

    .line 489
    .line 490
    invoke-static {v4, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v10, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v4}, Lvb/m;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    invoke-static {v4, v10}, Lvb/m;->P(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 501
    .line 502
    .line 503
    new-instance v10, Lge/n;

    .line 504
    .line 505
    invoke-direct {v10, v4}, Lge/n;-><init>(Ljava/util/Set;)V

    .line 506
    .line 507
    .line 508
    sget-object v4, Lse/h0;->b:Lm0/w;

    .line 509
    .line 510
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    sget-object v4, Lse/h0;->c:Lse/h0;

    .line 514
    .line 515
    const-string v11, "attributes"

    .line 516
    .line 517
    invoke-static {v4, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    const-string v11, "unknown integer literal type"

    .line 521
    .line 522
    filled-new-array {v11}, [Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v11

    .line 526
    sget-object v12, Lue/h;->c:Lue/h;

    .line 527
    .line 528
    invoke-static {v12, v3, v11}, Lue/l;->a(Lue/h;Z[Ljava/lang/String;)Lue/g;

    .line 529
    .line 530
    .line 531
    move-result-object v11

    .line 532
    sget-object v12, Lvb/r;->a:Lvb/r;

    .line 533
    .line 534
    invoke-static {v12, v11, v4, v10, v7}, Lse/c;->w(Ljava/util/List;Lle/o;Lse/h0;Lse/k0;Z)Lse/a0;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    goto :goto_a

    .line 539
    :cond_14
    if-eqz v13, :cond_16

    .line 540
    .line 541
    check-cast v11, Lge/n;

    .line 542
    .line 543
    iget-object v4, v11, Lge/n;->a:Ljava/util/Set;

    .line 544
    .line 545
    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v4

    .line 549
    if-eqz v4, :cond_15

    .line 550
    .line 551
    move-object v4, v10

    .line 552
    goto :goto_a

    .line 553
    :cond_15
    :goto_b
    move-object v4, v8

    .line 554
    goto :goto_a

    .line 555
    :cond_16
    instance-of v10, v12, Lge/n;

    .line 556
    .line 557
    if-eqz v10, :cond_15

    .line 558
    .line 559
    check-cast v12, Lge/n;

    .line 560
    .line 561
    iget-object v10, v12, Lge/n;->a:Ljava/util/Set;

    .line 562
    .line 563
    invoke-interface {v10, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    if-eqz v10, :cond_15

    .line 568
    .line 569
    goto :goto_a

    .line 570
    :cond_17
    move-object v8, v4

    .line 571
    check-cast v8, Lse/a0;

    .line 572
    .line 573
    :goto_c
    if-eqz v8, :cond_18

    .line 574
    .line 575
    move-object v0, v8

    .line 576
    goto :goto_d

    .line 577
    :cond_18
    new-instance v9, Lc0/x;

    .line 578
    .line 579
    sget-object v3, Lte/k;->b:Lte/j;

    .line 580
    .line 581
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    sget-object v11, Lte/j;->b:Lte/l;

    .line 585
    .line 586
    const/16 v16, 0x0

    .line 587
    .line 588
    const/16 v17, 0x6

    .line 589
    .line 590
    const/4 v10, 0x2

    .line 591
    const-class v12, Lte/l;

    .line 592
    .line 593
    const-string v13, "equalTypes"

    .line 594
    .line 595
    const-string v14, "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z"

    .line 596
    .line 597
    const/4 v15, 0x0

    .line 598
    invoke-direct/range {v9 .. v17}, Lc0/x;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 599
    .line 600
    .line 601
    invoke-static {v0, v9}, Lte/s;->a(Ljava/util/AbstractCollection;Lic/n;)Ljava/util/ArrayList;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    const/4 v4, 0x2

    .line 613
    if-ge v3, v4, :cond_19

    .line 614
    .line 615
    invoke-static {v0}, Lvb/m;->w0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    check-cast v0, Lse/a0;

    .line 620
    .line 621
    goto :goto_d

    .line 622
    :cond_19
    new-instance v0, Lse/v;

    .line 623
    .line 624
    invoke-direct {v0, v1}, Lse/v;-><init>(Ljava/util/AbstractCollection;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Lse/v;->b()Lse/a0;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    :goto_d
    invoke-virtual {v0, v2}, Lse/a0;->F(Lse/h0;)Lse/a0;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    return-object v0

    .line 636
    :cond_1a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 637
    .line 638
    invoke-direct {v0, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    throw v0

    .line 642
    :cond_1b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 643
    .line 644
    invoke-direct {v0, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    throw v0
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
