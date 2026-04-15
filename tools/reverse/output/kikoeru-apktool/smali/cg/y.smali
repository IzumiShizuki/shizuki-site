.class public final Lcg/y;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcg/v;


# direct methods
.method public synthetic constructor <init>(Lcg/v;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcg/y;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lcg/y;->c:Lcg/v;

    .line 4
    .line 5
    const/4 p1, 0x0

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
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcg/y;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcg/v;->z()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lcg/v;->w()Lcg/o;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lcg/o;->b:Lcg/o;

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcg/v;->A()V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcg/v;->A()V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_2
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcg/v;->A()V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_3
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcg/v;->A()V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_4
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcg/v;->w()Lcg/o;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const/4 v2, 0x2

    .line 75
    if-eq v1, v2, :cond_1

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iget-object v0, v0, Lcg/v;->f:Lx0/a1;

    .line 80
    .line 81
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object v0, v0, Lcg/v;->j:Lx0/e1;

    .line 87
    .line 88
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    long-to-float v0, v0

    .line 99
    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_5
    const-string v0, "onValueChangeFinish"

    .line 105
    .line 106
    const-string v1, "EasyPlayerExtends"

    .line 107
    .line 108
    invoke-static {v0, v1}, Lg8/a;->T(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcg/v;->A()V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_6
    iget-object v0, p0, Lcg/y;->c:Lcg/v;

    .line 120
    .line 121
    invoke-virtual {v0}, Lcg/v;->w()Lcg/o;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sget-object v2, Lcg/o;->b:Lcg/o;

    .line 126
    .line 127
    if-eq v1, v2, :cond_3

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    goto :goto_2

    .line 131
    :cond_3
    const/4 v1, 0x0

    .line 132
    :goto_2
    invoke-static {v0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v3, Lcg/t;

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    invoke-direct {v3, v1, v0, v4}, Lcg/t;-><init>(ZLcg/v;Lyb/c;)V

    .line 140
    .line 141
    .line 142
    const/4 v0, 0x3

    .line 143
    invoke-static {v2, v4, v4, v3, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 144
    .line 145
    .line 146
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
