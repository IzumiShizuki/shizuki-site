.class public final Lm0/j7;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:F

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lr/w0;Lr/q1;FLyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm0/j7;->e:I

    .line 1
    iput-object p1, p0, Lm0/j7;->i:Ljava/lang/Object;

    iput-object p2, p0, Lm0/j7;->j:Ljava/lang/Object;

    iput-object p3, p0, Lm0/j7;->k:Ljava/lang/Object;

    iput-object p4, p0, Lm0/j7;->l:Ljava/lang/Object;

    iput p5, p0, Lm0/j7;->g:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lm0/c2;Ljava/util/LinkedHashMap;Lm0/j5;Lf3/c;Lic/n;FLyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm0/j7;->e:I

    .line 2
    iput-object p1, p0, Lm0/j7;->h:Ljava/lang/Object;

    iput-object p2, p0, Lm0/j7;->i:Ljava/lang/Object;

    iput-object p3, p0, Lm0/j7;->j:Ljava/lang/Object;

    iput-object p4, p0, Lm0/j7;->k:Ljava/lang/Object;

    iput-object p5, p0, Lm0/j7;->l:Ljava/lang/Object;

    iput p6, p0, Lm0/j7;->g:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 10

    .line 1
    iget v0, p0, Lm0/j7;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lm0/j7;

    .line 7
    .line 8
    iget-object v0, p0, Lm0/j7;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v0

    .line 11
    check-cast v4, Lr/w0;

    .line 12
    .line 13
    iget-object v0, p0, Lm0/j7;->l:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Lr/q1;

    .line 17
    .line 18
    iget v6, p0, Lm0/j7;->g:F

    .line 19
    .line 20
    iget-object v2, p0, Lm0/j7;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v3, p0, Lm0/j7;->j:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v7, p2

    .line 25
    invoke-direct/range {v1 .. v7}, Lm0/j7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr/w0;Lr/q1;FLyb/c;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v1, Lm0/j7;->h:Ljava/lang/Object;

    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    move-object v7, p2

    .line 32
    new-instance v2, Lm0/j7;

    .line 33
    .line 34
    iget-object p1, p0, Lm0/j7;->h:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, Lm0/c2;

    .line 38
    .line 39
    iget-object p1, p0, Lm0/j7;->i:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    iget-object p1, p0, Lm0/j7;->j:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v5, p1

    .line 47
    check-cast v5, Lm0/j5;

    .line 48
    .line 49
    iget-object p1, p0, Lm0/j7;->k:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v6, p1

    .line 52
    check-cast v6, Lf3/c;

    .line 53
    .line 54
    iget-object p1, p0, Lm0/j7;->l:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lic/n;

    .line 57
    .line 58
    iget v8, p0, Lm0/j7;->g:F

    .line 59
    .line 60
    move-object v9, v7

    .line 61
    move-object v7, p1

    .line 62
    invoke-direct/range {v2 .. v9}, Lm0/j7;-><init>(Lm0/c2;Ljava/util/LinkedHashMap;Lm0/j5;Lf3/c;Lic/n;FLyb/c;)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm0/j7;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lm0/j7;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm0/j7;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm0/j7;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lm0/j7;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lm0/j7;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lm0/j7;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lm0/j7;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/j7;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr/q1;

    .line 9
    .line 10
    iget-object v1, p0, Lm0/j7;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lr/w0;

    .line 13
    .line 14
    iget v2, p0, Lm0/j7;->f:I

    .line 15
    .line 16
    sget-object v3, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lm0/j7;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lhf/y;

    .line 41
    .line 42
    iget-object v2, p0, Lm0/j7;->i:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v5, p0, Lm0/j7;->j:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v2, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/4 v7, 0x0

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    invoke-static {v1}, Lr/w0;->B1(Lr/w0;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iput-object v7, v1, Lr/w0;->n:Lr/p0;

    .line 58
    .line 59
    iget-object v6, v1, Lr/w0;->c:Lx0/e1;

    .line 60
    .line 61
    invoke-virtual {v6}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-static {v6, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    :goto_0
    invoke-static {v2, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iget v6, p0, Lm0/j7;->g:F

    .line 77
    .line 78
    if-nez v5, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Lr/q1;->p(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const-wide/16 v8, 0x0

    .line 84
    .line 85
    invoke-virtual {v0, v8, v9}, Lr/q1;->n(J)V

    .line 86
    .line 87
    .line 88
    iget-object v5, v1, Lr/w0;->b:Lx0/e1;

    .line 89
    .line 90
    invoke-virtual {v5, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v6}, Lr/q1;->j(F)V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-virtual {v1, v6}, Lr/w0;->K1(F)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v1, Lr/w0;->m:Lo/g0;

    .line 100
    .line 101
    invoke-virtual {v0}, Lo/g0;->h()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    new-instance v0, Lba/v0;

    .line 108
    .line 109
    const/16 v2, 0xd

    .line 110
    .line 111
    invoke-direct {v0, v2, v1, v7}, Lba/v0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x3

    .line 115
    invoke-static {p1, v7, v7, v0, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    const-wide/high16 v5, -0x8000000000000000L

    .line 120
    .line 121
    iput-wide v5, v1, Lr/w0;->l:J

    .line 122
    .line 123
    :goto_1
    iput v4, p0, Lm0/j7;->f:I

    .line 124
    .line 125
    invoke-static {v1, p0}, Lr/w0;->F1(Lr/w0;Lac/c;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 130
    .line 131
    if-ne p1, v0, :cond_6

    .line 132
    .line 133
    move-object v3, v0

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    :goto_2
    invoke-virtual {v1}, Lr/w0;->J1()V

    .line 136
    .line 137
    .line 138
    :goto_3
    return-object v3

    .line 139
    :pswitch_0
    iget-object v0, p0, Lm0/j7;->k:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lf3/c;

    .line 142
    .line 143
    iget-object v1, p0, Lm0/j7;->i:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    iget-object v2, p0, Lm0/j7;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Lm0/c2;

    .line 150
    .line 151
    iget v3, p0, Lm0/j7;->f:I

    .line 152
    .line 153
    const/4 v4, 0x1

    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    if-ne v3, v4, :cond_7

    .line 157
    .line 158
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 165
    .line 166
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_8
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, v2, Lm0/c2;->i:Lx0/e1;

    .line 174
    .line 175
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Ljava/util/Map;

    .line 180
    .line 181
    iget-object v3, v2, Lm0/c2;->i:Lx0/e1;

    .line 182
    .line 183
    invoke-virtual {v3, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v3, p0, Lm0/j7;->j:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v3, Lm0/j5;

    .line 189
    .line 190
    iget-object v5, v2, Lm0/c2;->o:Lx0/e1;

    .line 191
    .line 192
    invoke-virtual {v5, v3}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object v3, p0, Lm0/j7;->l:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, Lic/n;

    .line 198
    .line 199
    new-instance v5, La9/p;

    .line 200
    .line 201
    const/16 v6, 0x9

    .line 202
    .line 203
    invoke-direct {v5, v1, v3, v0, v6}, La9/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    iget-object v3, v2, Lm0/c2;->m:Lx0/e1;

    .line 207
    .line 208
    invoke-virtual {v3, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget v3, p0, Lm0/j7;->g:F

    .line 212
    .line 213
    invoke-interface {v0, v3}, Lf3/c;->Q(F)F

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    iget-object v3, v2, Lm0/c2;->n:Lx0/a1;

    .line 218
    .line 219
    invoke-virtual {v3, v0}, Lx0/a1;->f(F)V

    .line 220
    .line 221
    .line 222
    iput v4, p0, Lm0/j7;->f:I

    .line 223
    .line 224
    invoke-virtual {v2, p1, v1, p0}, Lm0/c2;->b(Ljava/util/Map;Ljava/util/LinkedHashMap;Lac/c;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 229
    .line 230
    if-ne p1, v0, :cond_9

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_9
    :goto_4
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 234
    .line 235
    :goto_5
    return-object v0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
