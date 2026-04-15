.class public final Lvc/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvc/i;


# direct methods
.method public synthetic constructor <init>(Lvc/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvc/f;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lvc/f;->b:Lvc/i;

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
    iget v0, p0, Lvc/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lvc/f;->b:Lvc/i;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/EnumMap;

    .line 10
    .line 11
    const-class v3, Lvc/k;

    .line 12
    .line 13
    invoke-direct {v0, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v4, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lvc/k;->values()[Lvc/k;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    array-length v6, v5

    .line 31
    :goto_0
    if-ge v1, v6, :cond_4

    .line 32
    .line 33
    aget-object v7, v5, v1

    .line 34
    .line 35
    iget-object v8, v7, Lvc/k;->a:Lbe/e;

    .line 36
    .line 37
    invoke-virtual {v8}, Lbe/e;->b()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    const/16 v9, 0x2f

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    if-eqz v8, :cond_3

    .line 45
    .line 46
    invoke-virtual {v2, v8}, Lvc/i;->k(Ljava/lang/String;)Lyc/e;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-interface {v8}, Lyc/e;->E()Lse/a0;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/16 v11, 0x30

    .line 55
    .line 56
    if-eqz v8, :cond_2

    .line 57
    .line 58
    iget-object v12, v7, Lvc/k;->b:Lbe/e;

    .line 59
    .line 60
    invoke-virtual {v12}, Lbe/e;->b()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    if-eqz v12, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2, v12}, Lvc/i;->k(Ljava/lang/String;)Lyc/e;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-interface {v9}, Lyc/e;->E()Lse/a0;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    if-eqz v9, :cond_0

    .line 75
    .line 76
    invoke-virtual {v0, v7, v9}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-static {v11}, Lvc/i;->a(I)V

    .line 89
    .line 90
    .line 91
    throw v10

    .line 92
    :cond_1
    invoke-static {v9}, Lvc/i;->a(I)V

    .line 93
    .line 94
    .line 95
    throw v10

    .line 96
    :cond_2
    invoke-static {v11}, Lvc/i;->a(I)V

    .line 97
    .line 98
    .line 99
    throw v10

    .line 100
    :cond_3
    invoke-static {v9}, Lvc/i;->a(I)V

    .line 101
    .line 102
    .line 103
    throw v10

    .line 104
    :cond_4
    new-instance v1, Lvc/h;

    .line 105
    .line 106
    invoke-direct {v1, v0, v3, v4}, Lvc/h;-><init>(Ljava/util/EnumMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :pswitch_0
    invoke-virtual {v2}, Lvc/i;->l()Lbd/h0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v3, Lvc/o;->k:Lbe/c;

    .line 115
    .line 116
    invoke-virtual {v0, v3}, Lbd/h0;->K0(Lbe/c;)Lyc/h0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v2}, Lvc/i;->l()Lbd/h0;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    sget-object v4, Lvc/o;->m:Lbe/c;

    .line 125
    .line 126
    invoke-virtual {v3, v4}, Lbd/h0;->K0(Lbe/c;)Lyc/h0;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v2}, Lvc/i;->l()Lbd/h0;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    sget-object v5, Lvc/o;->n:Lbe/c;

    .line 135
    .line 136
    invoke-virtual {v4, v5}, Lbd/h0;->K0(Lbe/c;)Lyc/h0;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v2}, Lvc/i;->l()Lbd/h0;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    sget-object v5, Lvc/o;->l:Lbe/c;

    .line 145
    .line 146
    invoke-virtual {v2, v5}, Lbd/h0;->K0(Lbe/c;)Lyc/h0;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const/4 v5, 0x4

    .line 151
    new-array v5, v5, [Lyc/h0;

    .line 152
    .line 153
    aput-object v0, v5, v1

    .line 154
    .line 155
    const/4 v0, 0x1

    .line 156
    aput-object v3, v5, v0

    .line 157
    .line 158
    const/4 v0, 0x2

    .line 159
    aput-object v4, v5, v0

    .line 160
    .line 161
    const/4 v0, 0x3

    .line 162
    aput-object v2, v5, v0

    .line 163
    .line 164
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
