.class public final synthetic Lm0/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lg2/x0;FILjava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lm0/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g;->d:Ljava/lang/Object;

    iput-object p2, p0, Lm0/g;->f:Ljava/lang/Object;

    iput p3, p0, Lm0/g;->c:F

    iput p4, p0, Lm0/g;->b:I

    iput-object p5, p0, Lm0/g;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Loc/a;IFLic/k;Lic/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lm0/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g;->d:Ljava/lang/Object;

    iput p2, p0, Lm0/g;->b:I

    iput p3, p0, Lm0/g;->c:F

    iput-object p4, p0, Lm0/g;->e:Ljava/lang/Object;

    iput-object p5, p0, Lm0/g;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm0/g;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lm0/g;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, Lm0/g;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iget v5, v0, Lm0/g;->c:F

    .line 11
    .line 12
    iget v6, v0, Lm0/g;->b:I

    .line 13
    .line 14
    iget-object v7, v0, Lm0/g;->d:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, Loc/a;

    .line 20
    .line 21
    check-cast v4, Lic/k;

    .line 22
    .line 23
    check-cast v3, Lic/a;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Float;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget v8, v7, Loc/a;->a:F

    .line 34
    .line 35
    iget v9, v7, Loc/a;->b:F

    .line 36
    .line 37
    invoke-static {v1, v8, v9}, Lnh/b;->j(FFF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v8, 0x1

    .line 42
    if-lez v6, :cond_2

    .line 43
    .line 44
    add-int/2addr v6, v8

    .line 45
    if-ltz v6, :cond_2

    .line 46
    .line 47
    move v11, v1

    .line 48
    move v12, v11

    .line 49
    const/4 v10, 0x0

    .line 50
    :goto_0
    iget v13, v7, Loc/a;->a:F

    .line 51
    .line 52
    int-to-float v14, v10

    .line 53
    int-to-float v15, v6

    .line 54
    div-float/2addr v14, v15

    .line 55
    invoke-static {v13, v9, v14}, Landroid/support/v4/media/session/b;->L(FFF)F

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    sub-float v14, v13, v1

    .line 60
    .line 61
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    cmpg-float v15, v15, v11

    .line 66
    .line 67
    if-gtz v15, :cond_0

    .line 68
    .line 69
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    move v12, v13

    .line 74
    :cond_0
    if-eq v10, v6, :cond_1

    .line 75
    .line 76
    add-int/lit8 v10, v10, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    move v1, v12

    .line 80
    :cond_2
    cmpg-float v5, v1, v5

    .line 81
    .line 82
    if-nez v5, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v4, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    invoke-interface {v3}, Lic/a;->b()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_4
    const/4 v2, 0x1

    .line 98
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    return-object v1

    .line 103
    :pswitch_0
    check-cast v7, Ljava/util/ArrayList;

    .line 104
    .line 105
    check-cast v3, Lg2/x0;

    .line 106
    .line 107
    check-cast v4, Ljava/util/ArrayList;

    .line 108
    .line 109
    move-object/from16 v1, p1

    .line 110
    .line 111
    check-cast v1, Lg2/f1;

    .line 112
    .line 113
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    const/4 v9, 0x0

    .line 118
    :goto_2
    if-ge v9, v8, :cond_8

    .line 119
    .line 120
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    check-cast v10, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    new-array v12, v11, [I

    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    :goto_3
    if-ge v13, v11, :cond_6

    .line 134
    .line 135
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    check-cast v14, Lg2/g1;

    .line 140
    .line 141
    iget v14, v14, Lg2/g1;->a:I

    .line 142
    .line 143
    invoke-static {v10}, Lud/b;->r(Ljava/util/List;)I

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-ge v13, v15, :cond_5

    .line 148
    .line 149
    invoke-interface {v3, v5}, Lf3/c;->a0(F)I

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    goto :goto_4

    .line 154
    :cond_5
    const/4 v15, 0x0

    .line 155
    :goto_4
    add-int/2addr v14, v15

    .line 156
    aput v14, v12, v13

    .line 157
    .line 158
    add-int/lit8 v13, v13, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    sget-object v13, Ly/k;->a:Ly/o0;

    .line 162
    .line 163
    new-array v11, v11, [I

    .line 164
    .line 165
    invoke-static {v6, v12, v11, v2}, Ly/k;->c(I[I[IZ)V

    .line 166
    .line 167
    .line 168
    move-object v12, v10

    .line 169
    check-cast v12, Ljava/util/Collection;

    .line 170
    .line 171
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    const/4 v13, 0x0

    .line 176
    :goto_5
    if-ge v13, v12, :cond_7

    .line 177
    .line 178
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    check-cast v14, Lg2/g1;

    .line 183
    .line 184
    aget v15, v11, v13

    .line 185
    .line 186
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v16

    .line 190
    check-cast v16, Ljava/lang/Number;

    .line 191
    .line 192
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-static {v1, v14, v15, v2}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v13, v13, 0x1

    .line 200
    .line 201
    const/4 v2, 0x0

    .line 202
    goto :goto_5

    .line 203
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    goto :goto_2

    .line 207
    :cond_8
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 208
    .line 209
    return-object v1

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
