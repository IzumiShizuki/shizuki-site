.class public final Lx0/h1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx0/h1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lx0/h1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final b()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lx0/h1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lx0/h1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lzc/j;

    .line 10
    .line 11
    iget-object v0, v2, Lzc/j;->a:Lvc/i;

    .line 12
    .line 13
    iget-object v1, v2, Lzc/j;->b:Lbe/c;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lvc/i;->j(Lbe/c;)Lyc/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lyc/e;->E()Lse/a0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_0
    check-cast v2, Lyc/l0;

    .line 25
    .line 26
    iget-object v0, v2, Lyc/l0;->b:Lic/k;

    .line 27
    .line 28
    sget-object v1, Lte/f;->a:Lte/f;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lle/o;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    check-cast v2, Lxc/i;

    .line 38
    .line 39
    iget-object v0, v2, Lxc/i;->f:Lbd/g0;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lbd/g0;->b()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lxc/h;

    .line 48
    .line 49
    iput-object v1, v2, Lxc/i;->f:Lbd/g0;

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 53
    .line 54
    const-string v1, "JvmBuiltins instance has not been initialized properly"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :pswitch_2
    check-cast v2, Lx0/i1;

    .line 61
    .line 62
    iget-object v0, v2, Lx0/i1;->a:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    new-instance v3, Lo/k0;

    .line 69
    .line 70
    invoke-direct {v3, v2}, Lo/k0;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    :goto_0
    if-ge v5, v2, :cond_7

    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Lx0/o0;

    .line 86
    .line 87
    iget-object v7, v6, Lx0/o0;->b:Ljava/lang/Object;

    .line 88
    .line 89
    iget v8, v6, Lx0/o0;->a:I

    .line 90
    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    new-instance v7, Lx0/n0;

    .line 94
    .line 95
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    iget-object v9, v6, Lx0/o0;->b:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-direct {v7, v8, v9}, Lx0/n0;-><init>(Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :goto_1
    invoke-virtual {v3, v7}, Lo/k0;->f(Ljava/lang/Object;)I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-gez v8, :cond_2

    .line 114
    .line 115
    const/4 v9, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    const/4 v9, 0x0

    .line 118
    :goto_2
    if-eqz v9, :cond_3

    .line 119
    .line 120
    move-object v10, v1

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    iget-object v10, v3, Lo/k0;->c:[Ljava/lang/Object;

    .line 123
    .line 124
    aget-object v10, v10, v8

    .line 125
    .line 126
    :goto_3
    if-nez v10, :cond_4

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    instance-of v11, v10, Lo/g0;

    .line 130
    .line 131
    if-eqz v11, :cond_5

    .line 132
    .line 133
    check-cast v10, Lo/g0;

    .line 134
    .line 135
    invoke-virtual {v10, v6}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    move-object v6, v10

    .line 139
    goto :goto_4

    .line 140
    :cond_5
    sget-object v11, Lo/q0;->a:[Ljava/lang/Object;

    .line 141
    .line 142
    new-instance v11, Lo/g0;

    .line 143
    .line 144
    const/4 v12, 0x2

    .line 145
    invoke-direct {v11, v12}, Lo/g0;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v10}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11, v6}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v6, v11

    .line 155
    :goto_4
    if-eqz v9, :cond_6

    .line 156
    .line 157
    not-int v8, v8

    .line 158
    iget-object v9, v3, Lo/k0;->b:[Ljava/lang/Object;

    .line 159
    .line 160
    aput-object v7, v9, v8

    .line 161
    .line 162
    iget-object v7, v3, Lo/k0;->c:[Ljava/lang/Object;

    .line 163
    .line 164
    aput-object v6, v7, v8

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_6
    iget-object v7, v3, Lo/k0;->c:[Ljava/lang/Object;

    .line 168
    .line 169
    aput-object v6, v7, v8

    .line 170
    .line 171
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_7
    new-instance v0, Lz0/a;

    .line 175
    .line 176
    invoke-direct {v0, v3}, Lz0/a;-><init>(Lo/k0;)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
