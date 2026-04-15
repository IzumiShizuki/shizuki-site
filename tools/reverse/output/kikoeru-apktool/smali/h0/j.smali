.class public final Lh0/j;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lic/k;

.field public final synthetic d:Lj1/q;

.field public final synthetic e:Lt2/l0;

.field public final synthetic f:Ly2/g0;

.field public final synthetic g:Lic/k;

.field public final synthetic h:Lw/k;

.field public final synthetic i:Lq1/n0;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Lh0/s0;

.field public final synthetic n:Z

.field public final synthetic o:Z

.field public final synthetic p:Lf1/f;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lic/k;Lj1/q;ZZLt2/l0;Lh0/t0;Lh0/s0;ZIILy2/g0;Lic/k;Lw/k;Lq1/n0;Lf1/f;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/j;->b:I

    .line 1
    iput-object p1, p0, Lh0/j;->s:Ljava/lang/Object;

    iput-object p2, p0, Lh0/j;->c:Lic/k;

    iput-object p3, p0, Lh0/j;->d:Lj1/q;

    iput-boolean p4, p0, Lh0/j;->j:Z

    iput-boolean p5, p0, Lh0/j;->n:Z

    iput-object p6, p0, Lh0/j;->e:Lt2/l0;

    iput-object p7, p0, Lh0/j;->t:Ljava/lang/Object;

    iput-object p8, p0, Lh0/j;->m:Lh0/s0;

    iput-boolean p9, p0, Lh0/j;->o:Z

    iput p10, p0, Lh0/j;->k:I

    iput p11, p0, Lh0/j;->l:I

    iput-object p12, p0, Lh0/j;->f:Ly2/g0;

    iput-object p13, p0, Lh0/j;->g:Lic/k;

    iput-object p14, p0, Lh0/j;->h:Lw/k;

    move-object/from16 p1, p15

    iput-object p1, p0, Lh0/j;->i:Lq1/n0;

    move-object/from16 p1, p16

    iput-object p1, p0, Lh0/j;->p:Lf1/f;

    move/from16 p1, p17

    iput p1, p0, Lh0/j;->q:I

    move/from16 p1, p18

    iput p1, p0, Lh0/j;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly2/y;Lic/k;Lj1/q;Lt2/l0;Ly2/g0;Lic/k;Lw/k;Lq1/n0;ZIILy2/j;Lh0/s0;ZZLf1/f;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/j;->b:I

    .line 2
    iput-object p1, p0, Lh0/j;->s:Ljava/lang/Object;

    iput-object p2, p0, Lh0/j;->c:Lic/k;

    iput-object p3, p0, Lh0/j;->d:Lj1/q;

    iput-object p4, p0, Lh0/j;->e:Lt2/l0;

    iput-object p5, p0, Lh0/j;->f:Ly2/g0;

    iput-object p6, p0, Lh0/j;->g:Lic/k;

    iput-object p7, p0, Lh0/j;->h:Lw/k;

    iput-object p8, p0, Lh0/j;->i:Lq1/n0;

    iput-boolean p9, p0, Lh0/j;->j:Z

    iput p10, p0, Lh0/j;->k:I

    iput p11, p0, Lh0/j;->l:I

    iput-object p12, p0, Lh0/j;->t:Ljava/lang/Object;

    iput-object p13, p0, Lh0/j;->m:Lh0/s0;

    iput-boolean p14, p0, Lh0/j;->n:Z

    move/from16 p1, p15

    iput-boolean p1, p0, Lh0/j;->o:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lh0/j;->p:Lf1/f;

    move/from16 p1, p17

    iput p1, p0, Lh0/j;->q:I

    move/from16 p1, p18

    iput p1, p0, Lh0/j;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh0/j;->b:I

    .line 4
    .line 5
    move-object/from16 v18, p1

    .line 6
    .line 7
    check-cast v18, Lx0/o;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lh0/j;->s:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Ly2/y;

    .line 23
    .line 24
    iget-object v1, v0, Lh0/j;->t:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v13, v1

    .line 27
    check-cast v13, Ly2/j;

    .line 28
    .line 29
    iget v1, v0, Lh0/j;->q:I

    .line 30
    .line 31
    or-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 34
    .line 35
    .line 36
    move-result v19

    .line 37
    iget v1, v0, Lh0/j;->r:I

    .line 38
    .line 39
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 40
    .line 41
    .line 42
    move-result v20

    .line 43
    iget-object v3, v0, Lh0/j;->c:Lic/k;

    .line 44
    .line 45
    iget-object v4, v0, Lh0/j;->d:Lj1/q;

    .line 46
    .line 47
    iget-object v5, v0, Lh0/j;->e:Lt2/l0;

    .line 48
    .line 49
    iget-object v6, v0, Lh0/j;->f:Ly2/g0;

    .line 50
    .line 51
    iget-object v7, v0, Lh0/j;->g:Lic/k;

    .line 52
    .line 53
    iget-object v8, v0, Lh0/j;->h:Lw/k;

    .line 54
    .line 55
    iget-object v9, v0, Lh0/j;->i:Lq1/n0;

    .line 56
    .line 57
    iget-boolean v10, v0, Lh0/j;->j:Z

    .line 58
    .line 59
    iget v11, v0, Lh0/j;->k:I

    .line 60
    .line 61
    iget v12, v0, Lh0/j;->l:I

    .line 62
    .line 63
    iget-object v14, v0, Lh0/j;->m:Lh0/s0;

    .line 64
    .line 65
    iget-boolean v15, v0, Lh0/j;->n:Z

    .line 66
    .line 67
    iget-boolean v1, v0, Lh0/j;->o:Z

    .line 68
    .line 69
    move/from16 v16, v1

    .line 70
    .line 71
    iget-object v1, v0, Lh0/j;->p:Lf1/f;

    .line 72
    .line 73
    move-object/from16 v17, v1

    .line 74
    .line 75
    invoke-static/range {v2 .. v20}, Lh0/q0;->e(Ly2/y;Lic/k;Lj1/q;Lt2/l0;Ly2/g0;Lic/k;Lw/k;Lq1/n0;ZIILy2/j;Lh0/s0;ZZLf1/f;Lx0/o;II)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_0
    move-object/from16 v1, p2

    .line 82
    .line 83
    check-cast v1, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, Lh0/j;->s:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v2, v1

    .line 91
    check-cast v2, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v1, v0, Lh0/j;->t:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v8, v1

    .line 96
    check-cast v8, Lh0/t0;

    .line 97
    .line 98
    iget v1, v0, Lh0/j;->q:I

    .line 99
    .line 100
    or-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 103
    .line 104
    .line 105
    move-result v19

    .line 106
    iget v1, v0, Lh0/j;->r:I

    .line 107
    .line 108
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 109
    .line 110
    .line 111
    move-result v20

    .line 112
    iget-object v3, v0, Lh0/j;->c:Lic/k;

    .line 113
    .line 114
    iget-object v4, v0, Lh0/j;->d:Lj1/q;

    .line 115
    .line 116
    iget-boolean v5, v0, Lh0/j;->j:Z

    .line 117
    .line 118
    iget-boolean v6, v0, Lh0/j;->n:Z

    .line 119
    .line 120
    iget-object v7, v0, Lh0/j;->e:Lt2/l0;

    .line 121
    .line 122
    iget-object v9, v0, Lh0/j;->m:Lh0/s0;

    .line 123
    .line 124
    iget-boolean v10, v0, Lh0/j;->o:Z

    .line 125
    .line 126
    iget v11, v0, Lh0/j;->k:I

    .line 127
    .line 128
    iget v12, v0, Lh0/j;->l:I

    .line 129
    .line 130
    iget-object v13, v0, Lh0/j;->f:Ly2/g0;

    .line 131
    .line 132
    iget-object v14, v0, Lh0/j;->g:Lic/k;

    .line 133
    .line 134
    iget-object v15, v0, Lh0/j;->h:Lw/k;

    .line 135
    .line 136
    iget-object v1, v0, Lh0/j;->i:Lq1/n0;

    .line 137
    .line 138
    move-object/from16 v16, v1

    .line 139
    .line 140
    iget-object v1, v0, Lh0/j;->p:Lf1/f;

    .line 141
    .line 142
    move-object/from16 v17, v1

    .line 143
    .line 144
    invoke-static/range {v2 .. v20}, Lh0/k;->a(Ljava/lang/String;Lic/k;Lj1/q;ZZLt2/l0;Lh0/t0;Lh0/s0;ZIILy2/g0;Lic/k;Lw/k;Lq1/n0;Lf1/f;Lx0/o;II)V

    .line 145
    .line 146
    .line 147
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 148
    .line 149
    return-object v1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
