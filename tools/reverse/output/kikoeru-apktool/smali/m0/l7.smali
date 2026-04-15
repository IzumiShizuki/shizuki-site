.class public final Lm0/l7;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:F

.field public final synthetic i:Lr/j;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLr/j;Ljc/v;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm0/l7;->e:I

    .line 1
    iput p1, p0, Lm0/l7;->h:F

    iput-object p2, p0, Lm0/l7;->i:Lr/j;

    iput-object p3, p0, Lm0/l7;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lm0/c2;FLr/j;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm0/l7;->e:I

    .line 2
    iput-object p1, p0, Lm0/l7;->j:Ljava/lang/Object;

    iput p2, p0, Lm0/l7;->h:F

    iput-object p3, p0, Lm0/l7;->i:Lr/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 4

    .line 1
    iget v0, p0, Lm0/l7;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm0/l7;

    .line 7
    .line 8
    iget-object v1, p0, Lm0/l7;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljc/v;

    .line 11
    .line 12
    iget v2, p0, Lm0/l7;->h:F

    .line 13
    .line 14
    iget-object v3, p0, Lm0/l7;->i:Lr/j;

    .line 15
    .line 16
    invoke-direct {v0, v2, v3, v1, p2}, Lm0/l7;-><init>(FLr/j;Ljc/v;Lyb/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lm0/l7;->g:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, Lm0/l7;

    .line 23
    .line 24
    iget-object v1, p0, Lm0/l7;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lm0/c2;

    .line 27
    .line 28
    iget v2, p0, Lm0/l7;->h:F

    .line 29
    .line 30
    iget-object v3, p0, Lm0/l7;->i:Lr/j;

    .line 31
    .line 32
    invoke-direct {v0, v1, v2, v3, p2}, Lm0/l7;-><init>(Lm0/c2;FLr/j;Lyb/c;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Lm0/l7;->g:Ljava/lang/Object;

    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm0/l7;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu/k1;

    .line 7
    .line 8
    check-cast p2, Lyb/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lm0/l7;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm0/l7;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm0/l7;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lm0/v;

    .line 24
    .line 25
    check-cast p2, Lyb/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lm0/l7;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lm0/l7;

    .line 32
    .line 33
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lm0/l7;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lm0/l7;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lm0/l7;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object v4, p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lm0/l7;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lu/k1;

    .line 32
    .line 33
    new-instance v5, Lb0/i0;

    .line 34
    .line 35
    iget-object v0, p0, Lm0/l7;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljc/v;

    .line 38
    .line 39
    const/16 v2, 0x12

    .line 40
    .line 41
    invoke-direct {v5, v2, v0, p1}, Lb0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput v1, p0, Lm0/l7;->f:I

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    iget v3, p0, Lm0/l7;->h:F

    .line 48
    .line 49
    iget-object v4, p0, Lm0/l7;->i:Lr/j;

    .line 50
    .line 51
    const/4 v7, 0x4

    .line 52
    move-object v6, p0

    .line 53
    invoke-static/range {v2 .. v7}, Lr/d;->e(FFLr/j;Lic/n;Lac/i;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    move-object v4, v6

    .line 58
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 59
    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 64
    .line 65
    :goto_1
    return-object v0

    .line 66
    :pswitch_0
    move-object v4, p0

    .line 67
    iget-object v0, v4, Lm0/l7;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lm0/c2;

    .line 70
    .line 71
    iget-object v6, v0, Lm0/c2;->d:Lx0/e1;

    .line 72
    .line 73
    iget-object v7, v0, Lm0/c2;->h:Lx0/e1;

    .line 74
    .line 75
    iget v1, v4, Lm0/l7;->f:I

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v2, 0x1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    if-ne v1, v2, :cond_3

    .line 82
    .line 83
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p1, v0

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, v4, Lm0/l7;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Lm0/v;

    .line 104
    .line 105
    new-instance v1, Ljc/v;

    .line 106
    .line 107
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lm0/c2;->g:Lx0/a1;

    .line 111
    .line 112
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iput v0, v1, Ljc/v;->a:F

    .line 117
    .line 118
    new-instance v0, Ljava/lang/Float;

    .line 119
    .line 120
    iget v3, v4, Lm0/l7;->h:F

    .line 121
    .line 122
    invoke-direct {v0, v3}, Ljava/lang/Float;-><init>(F)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {v6, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :try_start_1
    iget v0, v1, Ljc/v;->a:F

    .line 134
    .line 135
    invoke-static {v0}, Lr/d;->a(F)Lr/c;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    move-object v5, v1

    .line 140
    new-instance v1, Ljava/lang/Float;

    .line 141
    .line 142
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 143
    .line 144
    .line 145
    const/4 v3, 0x1

    .line 146
    iget-object v2, v4, Lm0/l7;->i:Lr/j;

    .line 147
    .line 148
    const/4 v9, 0x1

    .line 149
    new-instance v3, Lm0/n6;

    .line 150
    .line 151
    const/4 v10, 0x1

    .line 152
    invoke-direct {v3, p1, v5, v10}, Lm0/n6;-><init>(Lm0/v;Ljc/v;I)V

    .line 153
    .line 154
    .line 155
    iput v9, v4, Lm0/l7;->f:I

    .line 156
    .line 157
    const/4 v5, 0x4

    .line 158
    invoke-static/range {v0 .. v5}, Lr/c;->d(Lr/c;Ljava/lang/Object;Lr/j;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 163
    .line 164
    if-ne p1, v0, :cond_5

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    :goto_2
    :try_start_2
    check-cast p1, Lr/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    .line 169
    invoke-virtual {v7, v8}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {v6, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 178
    .line 179
    :goto_3
    return-object v0

    .line 180
    :goto_4
    invoke-virtual {v7, v8}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {v6, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    throw p1

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
