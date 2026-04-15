.class public final Lb9/a;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public g:J

.field public h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLjava/io/File;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/a;->e:I

    .line 1
    iput-wide p1, p0, Lb9/a;->g:J

    iput-object p3, p0, Lb9/a;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;Ljava/lang/Object;Lyb/c;I)V
    .locals 0

    .line 2
    iput p6, p0, Lb9/a;->e:I

    iput-wide p1, p0, Lb9/a;->g:J

    iput-object p3, p0, Lb9/a;->h:Ljava/lang/Object;

    iput-object p4, p0, Lb9/a;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lda/m0;JLyb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb9/a;->e:I

    .line 3
    iput-object p1, p0, Lb9/a;->i:Ljava/lang/Object;

    iput-wide p2, p0, Lb9/a;->g:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Lyb/c;I)V
    .locals 0

    .line 4
    iput p6, p0, Lb9/a;->e:I

    iput-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    iput-wide p2, p0, Lb9/a;->g:J

    iput-object p4, p0, Lb9/a;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lpc/f;Ljava/util/ArrayList;Lyb/c;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lb9/a;->e:I

    .line 5
    iput-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb9/a;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public static final x(Ljava/util/Map;Lda/b;Ljava/lang/String;Lac/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lda/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lda/b0;

    .line 7
    .line 8
    iget v1, v0, Lda/b0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lda/b0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lda/b0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lac/c;-><init>(Lyb/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lda/b0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lda/b0;->k:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    if-eq v1, v3, :cond_2

    .line 34
    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    iget p0, v0, Lda/b0;->i:I

    .line 51
    .line 52
    iget p1, v0, Lda/b0;->h:I

    .line 53
    .line 54
    iget-object p2, v0, Lda/b0;->g:Ljava/util/Iterator;

    .line 55
    .line 56
    iget-object v1, v0, Lda/b0;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, v0, Lda/b0;->e:Lda/b;

    .line 59
    .line 60
    iget-object v5, v0, Lda/b0;->d:Ljava/util/Map;

    .line 61
    .line 62
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p3, p1, Lda/b;->a:Ljava/util/List;

    .line 70
    .line 71
    check-cast p3, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    const/4 v1, 0x0

    .line 78
    move-object v4, p3

    .line 79
    move-object p3, p2

    .line 80
    move-object p2, v4

    .line 81
    const/4 v4, 0x0

    .line 82
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const/4 v6, 0x0

    .line 87
    sget-object v7, Lzb/a;->a:Lzb/a;

    .line 88
    .line 89
    if-eqz v5, :cond_8

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    add-int/lit8 v8, v4, 0x1

    .line 96
    .line 97
    if-ltz v4, :cond_7

    .line 98
    .line 99
    check-cast v5, Ls2/a;

    .line 100
    .line 101
    sget-object v6, Ls2/a;->b:Ls2/a;

    .line 102
    .line 103
    if-eq v5, v6, :cond_6

    .line 104
    .line 105
    iget-object v5, p1, Lda/b;->d:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lbg/o0;

    .line 112
    .line 113
    instance-of v6, v5, Lbg/n0;

    .line 114
    .line 115
    const-string v9, "/"

    .line 116
    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    iget-object v6, p1, Lda/b;->e:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    check-cast v4, Lda/b;

    .line 129
    .line 130
    check-cast v5, Lbg/n0;

    .line 131
    .line 132
    iget-object v5, v5, Lbg/n0;->b:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {p3, v9, v5}, Lj2/h0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iput-object p0, v0, Lda/b0;->d:Ljava/util/Map;

    .line 139
    .line 140
    iput-object p1, v0, Lda/b0;->e:Lda/b;

    .line 141
    .line 142
    iput-object p3, v0, Lda/b0;->f:Ljava/lang/String;

    .line 143
    .line 144
    iput-object p2, v0, Lda/b0;->g:Ljava/util/Iterator;

    .line 145
    .line 146
    iput v1, v0, Lda/b0;->h:I

    .line 147
    .line 148
    iput v8, v0, Lda/b0;->i:I

    .line 149
    .line 150
    iput v3, v0, Lda/b0;->k:I

    .line 151
    .line 152
    invoke-static {p0, v4, v5, v0}, Lb9/a;->x(Ljava/util/Map;Lda/b;Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    if-ne v4, v7, :cond_4

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    move-object v5, p0

    .line 160
    move-object v4, p1

    .line 161
    move p1, v1

    .line 162
    move p0, v8

    .line 163
    move-object v1, p3

    .line 164
    :goto_2
    move-object p3, v1

    .line 165
    move v1, p1

    .line 166
    move-object p1, v4

    .line 167
    move v4, p0

    .line 168
    move-object p0, v5

    .line 169
    goto :goto_1

    .line 170
    :cond_5
    instance-of v4, v5, Lbg/k0;

    .line 171
    .line 172
    if-eqz v4, :cond_6

    .line 173
    .line 174
    invoke-virtual {v5}, Lbg/o0;->a()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-static {p3, v9, v4}, Lj2/h0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v5, Lbg/k0;

    .line 183
    .line 184
    invoke-virtual {v5}, Lbg/k0;->d()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-interface {p0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_6
    move v4, v8

    .line 192
    goto :goto_1

    .line 193
    :cond_7
    invoke-static {}, Lud/b;->H()V

    .line 194
    .line 195
    .line 196
    throw v6

    .line 197
    :cond_8
    sget-object p0, Lhf/l0;->a:Lpf/e;

    .line 198
    .line 199
    sget-object p0, Lnf/n;->a:Ljf/d;

    .line 200
    .line 201
    new-instance p2, La9/k;

    .line 202
    .line 203
    const/4 p3, 0x4

    .line 204
    invoke-direct {p2, p3, p1, v6}, La9/k;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 205
    .line 206
    .line 207
    iput-object v6, v0, Lda/b0;->d:Ljava/util/Map;

    .line 208
    .line 209
    iput-object v6, v0, Lda/b0;->e:Lda/b;

    .line 210
    .line 211
    iput-object v6, v0, Lda/b0;->f:Ljava/lang/String;

    .line 212
    .line 213
    iput-object v6, v0, Lda/b0;->g:Ljava/util/Iterator;

    .line 214
    .line 215
    iput v2, v0, Lda/b0;->k:I

    .line 216
    .line 217
    invoke-static {p0, p2, v0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-ne p0, v7, :cond_9

    .line 222
    .line 223
    :goto_3
    return-object v7

    .line 224
    :cond_9
    :goto_4
    sget-object p0, Lub/a0;->a:Lub/a0;

    .line 225
    .line 226
    return-object p0
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


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 8

    .line 1
    iget p1, p0, Lb9/a;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb9/a;

    .line 7
    .line 8
    iget-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v2, p0, Lb9/a;->g:J

    .line 14
    .line 15
    iget-object p1, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    check-cast v4, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v6, 0x7

    .line 21
    move-object v5, p2

    .line 22
    invoke-direct/range {v0 .. v6}, Lb9/a;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lyb/c;I)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    move-object v6, p2

    .line 27
    new-instance p1, Lb9/a;

    .line 28
    .line 29
    iget-object p2, p0, Lb9/a;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p2, Lpc/f;

    .line 32
    .line 33
    iget-object v0, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1, p2, v0, v6}, Lb9/a;-><init>(Lpc/f;Ljava/util/ArrayList;Lyb/c;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_1
    move-object v6, p2

    .line 42
    new-instance v1, Lb9/a;

    .line 43
    .line 44
    iget-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    check-cast v2, Lda/b1;

    .line 48
    .line 49
    iget-wide v3, p0, Lb9/a;->g:J

    .line 50
    .line 51
    iget-object p1, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v5, p1

    .line 54
    check-cast v5, Lx0/w0;

    .line 55
    .line 56
    const/4 v7, 0x5

    .line 57
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lyb/c;I)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_2
    move-object v6, p2

    .line 62
    new-instance v1, Lb9/a;

    .line 63
    .line 64
    iget-wide v2, p0, Lb9/a;->g:J

    .line 65
    .line 66
    iget-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v4, p1

    .line 69
    check-cast v4, Lbg/p;

    .line 70
    .line 71
    iget-object p1, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v5, p1

    .line 74
    check-cast v5, Lda/b1;

    .line 75
    .line 76
    const/4 v7, 0x4

    .line 77
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(JLjava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_3
    move-object v6, p2

    .line 82
    new-instance v1, Lb9/a;

    .line 83
    .line 84
    iget-wide v2, p0, Lb9/a;->g:J

    .line 85
    .line 86
    iget-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v4, p1

    .line 89
    check-cast v4, Lx0/n2;

    .line 90
    .line 91
    iget-object p1, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v5, p1

    .line 94
    check-cast v5, Lx0/w0;

    .line 95
    .line 96
    const/4 v7, 0x3

    .line 97
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(JLjava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_4
    move-object v6, p2

    .line 102
    new-instance p1, Lb9/a;

    .line 103
    .line 104
    iget-object p2, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p2, Lda/m0;

    .line 107
    .line 108
    iget-wide v0, p0, Lb9/a;->g:J

    .line 109
    .line 110
    invoke-direct {p1, p2, v0, v1, v6}, Lb9/a;-><init>(Lda/m0;JLyb/c;)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_5
    move-object v6, p2

    .line 115
    new-instance v1, Lb9/a;

    .line 116
    .line 117
    iget-object p1, p0, Lb9/a;->h:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v2, p1

    .line 120
    check-cast v2, Lx0/n2;

    .line 121
    .line 122
    iget-wide v3, p0, Lb9/a;->g:J

    .line 123
    .line 124
    iget-object p1, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v5, p1

    .line 127
    check-cast v5, Lda/m0;

    .line 128
    .line 129
    const/4 v7, 0x1

    .line 130
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lyb/c;I)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :pswitch_6
    move-object v6, p2

    .line 135
    new-instance p1, Lb9/a;

    .line 136
    .line 137
    iget-wide v0, p0, Lb9/a;->g:J

    .line 138
    .line 139
    iget-object p2, p0, Lb9/a;->i:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p2, Ljava/io/File;

    .line 142
    .line 143
    invoke-direct {p1, v0, v1, p2, v6}, Lb9/a;-><init>(JLjava/io/File;Lyb/c;)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
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
    iget v0, p0, Lb9/a;->e:I

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
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lb9/a;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lb9/a;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lb9/a;

    .line 41
    .line 42
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lb9/a;

    .line 54
    .line 55
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lb9/a;

    .line 67
    .line 68
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lb9/a;

    .line 80
    .line 81
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lb9/a;

    .line 93
    .line 94
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_6
    invoke-virtual {p0, p1, p2}, Lb9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lb9/a;

    .line 106
    .line 107
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lb9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    nop

    .line 115
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lb9/a;->e:I

    .line 4
    .line 5
    const-string v2, "RJ"

    .line 6
    .line 7
    const-string v3, "getBytes(...)"

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    sget-object v6, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    iget-object v7, v1, Lb9/a;->i:Ljava/lang/Object;

    .line 14
    .line 15
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    sget-object v9, Lzb/a;->a:Lzb/a;

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 24
    .line 25
    move-object/from16 v19, v0

    .line 26
    .line 27
    check-cast v19, Ljava/lang/String;

    .line 28
    .line 29
    iget v0, v1, Lb9/a;->f:I

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    if-ne v0, v10, :cond_0

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static/range {v19 .. v19}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v8, Lb4/a;

    .line 57
    .line 58
    invoke-direct {v8}, Lb4/a;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, v8, Lb4/a;->c:Landroid/content/Context;

    .line 62
    .line 63
    iput-object v2, v8, Lb4/a;->b:Landroid/net/Uri;

    .line 64
    .line 65
    invoke-virtual {v8}, Lb4/a;->b()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-static {v8}, Lna/c;->k(Lb4/a;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v17

    .line 76
    if-nez v17, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object v8, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 88
    .line 89
    invoke-virtual {v0, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    invoke-static {v15, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    invoke-virtual {v8}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v18

    .line 104
    new-instance v11, Lc9/f;

    .line 105
    .line 106
    iget-wide v12, v1, Lb9/a;->g:J

    .line 107
    .line 108
    move-object v14, v7

    .line 109
    check-cast v14, Ljava/lang/String;

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    const/16 v21, 0x281

    .line 114
    .line 115
    invoke-direct/range {v11 .. v21}, Lc9/f;-><init>(JLjava/lang/String;[BLjava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    iput v10, v1, Lb9/a;->f:I

    .line 119
    .line 120
    iget-object v0, v2, Ld9/s;->a:Ln7/v;

    .line 121
    .line 122
    new-instance v3, Ld9/r;

    .line 123
    .line 124
    invoke-direct {v3, v2, v11, v4}, Ld9/r;-><init>(Ld9/s;Lc9/f;I)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v5, v10, v3, v1}, Lua/l;->X(Ln7/v;ZZLic/k;Lyb/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-ne v0, v9, :cond_4

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    move-object v0, v6

    .line 135
    :goto_0
    if-ne v0, v9, :cond_5

    .line 136
    .line 137
    move-object v6, v9

    .line 138
    goto :goto_2

    .line 139
    :cond_5
    :goto_1
    sget-object v0, Lj9/b0;->a:Lj9/b0;

    .line 140
    .line 141
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ln7/v;->g()La8/b;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0}, La8/b;->getWritableDatabase()La8/a;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, Lj9/b0;->a(La8/a;)V

    .line 154
    .line 155
    .line 156
    :goto_2
    return-object v6

    .line 157
    :pswitch_0
    iget v0, v1, Lb9/a;->f:I

    .line 158
    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    if-ne v0, v10, :cond_6

    .line 162
    .line 163
    iget-wide v2, v1, Lb9/a;->g:J

    .line 164
    .line 165
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :cond_7
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lpc/f;

    .line 181
    .line 182
    check-cast v7, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 185
    .line 186
    .line 187
    move-result-wide v2

    .line 188
    check-cast v0, Lic/n;

    .line 189
    .line 190
    iput-wide v2, v1, Lb9/a;->g:J

    .line 191
    .line 192
    iput v10, v1, Lb9/a;->f:I

    .line 193
    .line 194
    invoke-interface {v0, v7, v1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v9, :cond_8

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v4

    .line 205
    sub-long/2addr v4, v2

    .line 206
    new-instance v9, Ljava/lang/Long;

    .line 207
    .line 208
    invoke-direct {v9, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 209
    .line 210
    .line 211
    :goto_4
    return-object v9

    .line 212
    :pswitch_1
    check-cast v7, Lx0/w0;

    .line 213
    .line 214
    iget v0, v1, Lb9/a;->f:I

    .line 215
    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    if-ne v0, v10, :cond_9

    .line 219
    .line 220
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 225
    .line 226
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :cond_a
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-interface {v7, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    iget-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Lda/b1;

    .line 241
    .line 242
    iget-wide v2, v1, Lb9/a;->g:J

    .line 243
    .line 244
    invoke-virtual {v0, v2, v3, v10}, Lda/b1;->w(JZ)V

    .line 245
    .line 246
    .line 247
    iput v10, v1, Lb9/a;->f:I

    .line 248
    .line 249
    const-wide/16 v2, 0x3e8

    .line 250
    .line 251
    invoke-static {v2, v3, v1}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-ne v0, v9, :cond_b

    .line 256
    .line 257
    move-object v6, v9

    .line 258
    goto :goto_6

    .line 259
    :cond_b
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-interface {v7, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :goto_6
    return-object v6

    .line 265
    :pswitch_2
    iget-wide v2, v1, Lb9/a;->g:J

    .line 266
    .line 267
    iget v0, v1, Lb9/a;->f:I

    .line 268
    .line 269
    if-eqz v0, :cond_e

    .line 270
    .line 271
    if-eq v0, v10, :cond_c

    .line 272
    .line 273
    if-ne v0, v4, :cond_d

    .line 274
    .line 275
    :cond_c
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v0, p1

    .line 279
    .line 280
    check-cast v0, Lub/n;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 287
    .line 288
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v0

    .line 292
    :cond_e
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v0}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget-object v5, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v5, Lbg/p;

    .line 306
    .line 307
    iget-boolean v8, v5, Lbg/p;->k:Z

    .line 308
    .line 309
    iget-object v5, v5, Lbg/p;->a:Ljava/lang/String;

    .line 310
    .line 311
    sget-object v11, Lq9/r0;->g:Lm3/l;

    .line 312
    .line 313
    if-eqz v8, :cond_f

    .line 314
    .line 315
    iput v10, v1, Lb9/a;->f:I

    .line 316
    .line 317
    invoke-virtual {v11, v5, v0, v1}, Lm3/l;->w(Ljava/lang/String;Ljava/util/List;Lac/c;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-ne v0, v9, :cond_10

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_f
    iput v4, v1, Lb9/a;->f:I

    .line 325
    .line 326
    invoke-virtual {v11, v5, v0, v1}, Lm3/l;->o(Ljava/lang/String;Ljava/util/List;Lac/c;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    if-ne v0, v9, :cond_10

    .line 331
    .line 332
    :goto_7
    move-object v6, v9

    .line 333
    goto :goto_9

    .line 334
    :cond_10
    :goto_8
    check-cast v7, Lda/b1;

    .line 335
    .line 336
    invoke-virtual {v7, v2, v3, v10}, Lda/b1;->w(JZ)V

    .line 337
    .line 338
    .line 339
    :goto_9
    return-object v6

    .line 340
    :pswitch_3
    iget-wide v2, v1, Lb9/a;->g:J

    .line 341
    .line 342
    iget v0, v1, Lb9/a;->f:I

    .line 343
    .line 344
    if-eqz v0, :cond_13

    .line 345
    .line 346
    if-eq v0, v10, :cond_12

    .line 347
    .line 348
    if-ne v0, v4, :cond_11

    .line 349
    .line 350
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 355
    .line 356
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v0

    .line 360
    :cond_12
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    move-object/from16 v0, p1

    .line 364
    .line 365
    check-cast v0, Lub/n;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_13
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iget-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lx0/n2;

    .line 377
    .line 378
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Ljava/lang/Boolean;

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    iput v10, v1, Lb9/a;->f:I

    .line 389
    .line 390
    invoke-static {v2, v3, v1, v0}, Lna/c;->e(JLac/c;Z)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-ne v0, v9, :cond_14

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_14
    :goto_a
    check-cast v7, Lx0/w0;

    .line 398
    .line 399
    iput v4, v1, Lb9/a;->f:I

    .line 400
    .line 401
    invoke-static {v2, v3, v7, v10, v1}, Lda/a;->l(JLx0/w0;ZLac/c;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    if-ne v0, v9, :cond_15

    .line 406
    .line 407
    :goto_b
    move-object v6, v9

    .line 408
    :cond_15
    :goto_c
    return-object v6

    .line 409
    :pswitch_4
    iget-wide v12, v1, Lb9/a;->g:J

    .line 410
    .line 411
    move-object v11, v7

    .line 412
    check-cast v11, Lda/m0;

    .line 413
    .line 414
    iget v0, v1, Lb9/a;->f:I

    .line 415
    .line 416
    const/4 v3, 0x3

    .line 417
    const/4 v14, 0x0

    .line 418
    if-eqz v0, :cond_19

    .line 419
    .line 420
    if-eq v0, v10, :cond_18

    .line 421
    .line 422
    if-eq v0, v4, :cond_17

    .line 423
    .line 424
    if-ne v0, v3, :cond_16

    .line 425
    .line 426
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    goto/16 :goto_13

    .line 430
    .line 431
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 432
    .line 433
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    throw v0

    .line 437
    :cond_17
    :try_start_0
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    .line 439
    .line 440
    move-object/from16 v0, p1

    .line 441
    .line 442
    goto/16 :goto_f

    .line 443
    .line 444
    :catchall_0
    move-exception v0

    .line 445
    goto/16 :goto_10

    .line 446
    .line 447
    :cond_18
    iget-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 450
    .line 451
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    goto :goto_d

    .line 455
    :cond_19
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 459
    .line 460
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v11}, Lda/m0;->z()Lda/b;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    invoke-static {v12, v13, v2}, Lj2/h0;->i(JLjava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    iput-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 472
    .line 473
    iput v10, v1, Lb9/a;->f:I

    .line 474
    .line 475
    invoke-static {v0, v7, v2, v1}, Lb9/a;->x(Ljava/util/Map;Lda/b;Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    if-ne v2, v9, :cond_1a

    .line 480
    .line 481
    goto/16 :goto_12

    .line 482
    .line 483
    :cond_1a
    :goto_d
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-eqz v2, :cond_1b

    .line 488
    .line 489
    const v0, 0x7f0c015b

    .line 490
    .line 491
    .line 492
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    const/4 v11, 0x0

    .line 497
    const/16 v12, 0x1ff

    .line 498
    .line 499
    const-wide/16 v8, 0x0

    .line 500
    .line 501
    const/4 v10, 0x0

    .line 502
    invoke-static/range {v7 .. v12}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_13

    .line 506
    .line 507
    :cond_1b
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    if-eqz v2, :cond_1c

    .line 520
    .line 521
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    check-cast v2, Ljava/util/Map$Entry;

    .line 526
    .line 527
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    move-object/from16 v16, v7

    .line 532
    .line 533
    check-cast v16, Ljava/lang/String;

    .line 534
    .line 535
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    check-cast v2, Ljava/lang/String;

    .line 540
    .line 541
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 546
    .line 547
    .line 548
    move-result-object v17

    .line 549
    new-instance v15, Landroidx/media3/exoplayer/offline/o;

    .line 550
    .line 551
    sget-object v2, Lya/i0;->b:Lya/g0;

    .line 552
    .line 553
    sget-object v19, Lya/a1;->e:Lya/a1;

    .line 554
    .line 555
    const/16 v18, 0x0

    .line 556
    .line 557
    const/16 v20, 0x0

    .line 558
    .line 559
    const/16 v21, 0x0

    .line 560
    .line 561
    const/16 v22, 0x0

    .line 562
    .line 563
    invoke-direct/range {v15 .. v22}, Landroidx/media3/exoplayer/offline/o;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[B)V

    .line 564
    .line 565
    .line 566
    invoke-static {v7, v15}, Landroidx/media3/exoplayer/offline/r;->c(Lcom/cnl/kikoeru/MainApplication;Landroidx/media3/exoplayer/offline/o;)V

    .line 567
    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_1c
    invoke-virtual {v11}, Lda/m0;->A()Lbg/a2;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    if-eqz v0, :cond_1d

    .line 575
    .line 576
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v2}, Lcom/cnl/kikoeru/data/db/AppDatabase;->s()Ld9/m;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    invoke-static {v0, v5}, Lpc/f0;->T(Lbg/a2;I)Lc9/c;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iget-object v7, v2, Ld9/m;->a:Ln7/v;

    .line 592
    .line 593
    new-instance v8, Ld9/k;

    .line 594
    .line 595
    invoke-direct {v8, v2, v0, v5}, Ld9/k;-><init>(Ld9/m;Lc9/c;I)V

    .line 596
    .line 597
    .line 598
    invoke-static {v7, v5, v10, v8}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    :cond_1d
    :try_start_1
    sget-object v0, Lb9/d;->a:Lub/p;

    .line 602
    .line 603
    iput-object v14, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 604
    .line 605
    iput v4, v1, Lb9/a;->f:I

    .line 606
    .line 607
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 608
    .line 609
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 610
    .line 611
    new-instance v2, Lb9/c;

    .line 612
    .line 613
    invoke-direct {v2, v12, v13, v14, v5}, Lb9/c;-><init>(JLyb/c;I)V

    .line 614
    .line 615
    .line 616
    invoke-static {v0, v2, v1}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    if-ne v0, v9, :cond_1e

    .line 621
    .line 622
    goto :goto_12

    .line 623
    :cond_1e
    :goto_f
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 624
    .line 625
    goto :goto_11

    .line 626
    :goto_10
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 627
    .line 628
    .line 629
    :goto_11
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 630
    .line 631
    sget-object v0, Lnf/n;->a:Ljf/d;

    .line 632
    .line 633
    new-instance v10, Lda/m;

    .line 634
    .line 635
    const/4 v15, 0x5

    .line 636
    invoke-direct/range {v10 .. v15}, Lda/m;-><init>(Lda/m0;JLyb/c;I)V

    .line 637
    .line 638
    .line 639
    iput-object v14, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 640
    .line 641
    iput v3, v1, Lb9/a;->f:I

    .line 642
    .line 643
    invoke-static {v0, v10, v1}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    if-ne v0, v9, :cond_1f

    .line 648
    .line 649
    :goto_12
    move-object v6, v9

    .line 650
    :cond_1f
    :goto_13
    return-object v6

    .line 651
    :pswitch_5
    iget-wide v2, v1, Lb9/a;->g:J

    .line 652
    .line 653
    iget v0, v1, Lb9/a;->f:I

    .line 654
    .line 655
    if-eqz v0, :cond_22

    .line 656
    .line 657
    if-eq v0, v10, :cond_21

    .line 658
    .line 659
    if-ne v0, v4, :cond_20

    .line 660
    .line 661
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    goto :goto_16

    .line 665
    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 666
    .line 667
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v0

    .line 671
    :cond_21
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    move-object/from16 v0, p1

    .line 675
    .line 676
    check-cast v0, Lub/n;

    .line 677
    .line 678
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    goto :goto_14

    .line 682
    :cond_22
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    iget-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v0, Lx0/n2;

    .line 688
    .line 689
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    check-cast v0, Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    iput v10, v1, Lb9/a;->f:I

    .line 700
    .line 701
    invoke-static {v2, v3, v1, v0}, Lna/c;->e(JLac/c;Z)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    if-ne v0, v9, :cond_23

    .line 706
    .line 707
    goto :goto_15

    .line 708
    :cond_23
    :goto_14
    check-cast v7, Lda/m0;

    .line 709
    .line 710
    iput v4, v1, Lb9/a;->f:I

    .line 711
    .line 712
    invoke-virtual {v7, v2, v3, v1, v10}, Lda/m0;->H(JLac/c;Z)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    if-ne v0, v9, :cond_24

    .line 717
    .line 718
    :goto_15
    move-object v6, v9

    .line 719
    :cond_24
    :goto_16
    return-object v6

    .line 720
    :pswitch_6
    iget-wide v11, v1, Lb9/a;->g:J

    .line 721
    .line 722
    iget v0, v1, Lb9/a;->f:I

    .line 723
    .line 724
    if-eqz v0, :cond_26

    .line 725
    .line 726
    if-ne v0, v10, :cond_25

    .line 727
    .line 728
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    move-object/from16 v0, p1

    .line 732
    .line 733
    check-cast v0, Lub/n;

    .line 734
    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    goto :goto_17

    .line 739
    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 740
    .line 741
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v0

    .line 745
    :cond_26
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    sget-object v0, Lag/z;->a:Ljava/lang/String;

    .line 749
    .line 750
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-static {v11, v12, v0, v5}, Lag/z;->i(JLjava/lang/String;Z)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    check-cast v7, Ljava/io/File;

    .line 759
    .line 760
    instance-of v4, v0, Lub/m;

    .line 761
    .line 762
    if-nez v4, :cond_27

    .line 763
    .line 764
    move-object v4, v0

    .line 765
    check-cast v4, Lbg/a2;

    .line 766
    .line 767
    new-instance v5, Ljava/io/FileOutputStream;

    .line 768
    .line 769
    invoke-direct {v5, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 770
    .line 771
    .line 772
    :try_start_2
    sget-object v7, Lna/w;->a:Lxf/r;

    .line 773
    .line 774
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    sget-object v8, Lbg/a2;->Companion:Lbg/q1;

    .line 778
    .line 779
    invoke-virtual {v8}, Lbg/q1;->serializer()Lsf/a;

    .line 780
    .line 781
    .line 782
    move-result-object v8

    .line 783
    check-cast v8, Lsf/a;

    .line 784
    .line 785
    invoke-virtual {v7, v8, v4}, Lxf/c;->b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v7

    .line 789
    sget-object v8, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 790
    .line 791
    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    invoke-static {v7, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v5, v7}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 799
    .line 800
    .line 801
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 802
    .line 803
    .line 804
    new-instance v3, Ljava/io/File;

    .line 805
    .line 806
    invoke-static {}, Lb9/d;->a()Ljava/io/File;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    new-instance v7, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    const-string v2, ".cover"

    .line 819
    .line 820
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    invoke-direct {v3, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    iget-object v2, v4, Lbg/a2;->I:Ljava/lang/String;

    .line 831
    .line 832
    iput-object v0, v1, Lb9/a;->h:Ljava/lang/Object;

    .line 833
    .line 834
    iput v10, v1, Lb9/a;->f:I

    .line 835
    .line 836
    invoke-static {v3, v2, v1}, Lna/c;->f(Ljava/io/File;Ljava/lang/String;Lac/c;)Ljava/io/Serializable;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    if-ne v0, v9, :cond_27

    .line 841
    .line 842
    move-object v6, v9

    .line 843
    goto :goto_17

    .line 844
    :catchall_1
    move-exception v0

    .line 845
    move-object v2, v0

    .line 846
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 847
    :catchall_2
    move-exception v0

    .line 848
    invoke-static {v5, v2}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 849
    .line 850
    .line 851
    throw v0

    .line 852
    :cond_27
    :goto_17
    return-object v6

    .line 853
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
