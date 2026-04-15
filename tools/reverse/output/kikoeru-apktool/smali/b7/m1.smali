.class public final synthetic Lb7/m1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb7/n;Lb7/u1;ZLb7/t1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb7/m1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/m1;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb7/m1;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Lb7/m1;->b:Z

    iput-object p4, p0, Lb7/m1;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lb7/p1;Lb7/v1;Lb7/m;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lb7/m1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/m1;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb7/m1;->d:Ljava/lang/Object;

    iput-object p3, p0, Lb7/m1;->e:Ljava/lang/Object;

    iput-boolean p4, p0, Lb7/m1;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lb7/m1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/m1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb7/n;

    .line 9
    .line 10
    iget-object v1, p0, Lb7/m1;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lb7/u1;

    .line 13
    .line 14
    iget-object v2, p0, Lb7/m1;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lb7/t1;

    .line 17
    .line 18
    iget-object v0, v0, Lb7/n;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lb7/o2;

    .line 21
    .line 22
    iget-object v0, v0, Lb7/o2;->g:Lb7/c2;

    .line 23
    .line 24
    iget-object v3, v0, Lb7/c2;->t:Lb7/z3;

    .line 25
    .line 26
    invoke-static {v3, v1}, Lb7/s3;->i(Lm4/y0;Lb7/u1;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lb7/z3;->i()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-ne v1, v5, :cond_0

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Lb7/z3;->B0(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3}, Lb7/z3;->c()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v6, 0x4

    .line 48
    if-ne v1, v6, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3, v6}, Lb7/z3;->B0(I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v3}, Lb7/z3;->v()V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    iget-boolean v1, p0, Lb7/m1;->b:Z

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3, v5}, Lb7/z3;->B0(I)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    invoke-virtual {v3}, Lb7/z3;->k()V

    .line 70
    .line 71
    .line 72
    :cond_2
    new-instance v3, Landroid/util/SparseBooleanArray;

    .line 73
    .line 74
    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 75
    .line 76
    .line 77
    const/16 v6, 0x1f

    .line 78
    .line 79
    filled-new-array {v6, v4}, [I

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    array-length v6, v4

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    :goto_1
    if-ge v8, v6, :cond_3

    .line 87
    .line 88
    aget v9, v4, v8

    .line 89
    .line 90
    const/4 v10, 0x0

    .line 91
    xor-int/2addr v10, v5

    .line 92
    invoke-static {v10}, Lp4/c;->i(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v9, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v8, v8, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    xor-int/2addr v1, v5

    .line 105
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v5, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 109
    .line 110
    .line 111
    :cond_4
    new-instance v1, Lm4/u0;

    .line 112
    .line 113
    xor-int/lit8 v1, v7, 0x1

    .line 114
    .line 115
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, Lb7/c2;->o(Lb7/t1;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_0
    iget-object v0, p0, Lb7/m1;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lb7/p1;

    .line 125
    .line 126
    iget-object v1, p0, Lb7/m1;->d:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Lb7/v1;

    .line 129
    .line 130
    iget-object v2, p0, Lb7/m1;->e:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Lb7/m;

    .line 133
    .line 134
    iget-boolean v3, p0, Lb7/m1;->b:Z

    .line 135
    .line 136
    invoke-virtual {v0, v1, v2, v3}, Lb7/p1;->d(Lb7/v1;Lb7/m;Z)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
