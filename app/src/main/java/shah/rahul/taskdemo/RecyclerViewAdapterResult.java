//package shah.rahul.taskdemo;
//
//import android.content.Intent;
//import android.graphics.Paint;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//import shah.rahul.taskdemo.data.Products;
//
//public class RecyclerViewAdapterResult  extends RecyclerView.Adapter<RecyclerViewAdapterResult.ExampleViewHolder> {
//    private ArrayList<Products> mExampleList;
//    private ArrayList<Products> mExampleListFull;
//    private RecyclerViewAdapterResult.OnItemClickListener mListener;
//    public interface OnItemClickListener {
//        void onProductClick(int position);
//        void onDeleteClick(int position);
//    }
//    public void setOnItemClickListener(RecyclerViewAdapterResult.OnItemClickListener listener) {
//        mListener = listener;
//    }
//    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
//
//        public TextView mTextView1;
//        public ImageView mImageView;
//        public TextView discount;
//
//        public ExampleViewHolder(final View itemView, final RecyclerViewAdapterResult.OnItemClickListener listener) {
//            super(itemView);
//            mTextView1 = itemView.findViewById(R.id.product_details);
//            mImageView = itemView.findViewById(R.id.product_image);
//            discount = itemView.findViewById(R.id.original_price3);
//            discount.setPaintFlags(discount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
//
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(itemView.getContext(), ProductDetails.class);
//                    itemView.getContext().startActivity(intent);
//                }
//            });
//
//        }
//    }
//
//    public RecyclerViewAdapterResult(ArrayList<Products> exampleList) {
//        mExampleList = exampleList;
//        mExampleListFull = new ArrayList<>(exampleList);
//    }
//    @Override
//    public RecyclerViewAdapterResult.ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cuisine_result, parent, false);
//        return new RecyclerViewAdapterResult.ExampleViewHolder(v, mListener);
//    }
//    @Override
//    public void onBindViewHolder(RecyclerViewAdapterResult.ExampleViewHolder holder, int position) {
//        Products currentItem = mExampleList.get(position);
//        holder.mTextView1.setText(currentItem.getName());
//        holder.mImageView.setImageResource(currentItem.getImage());
//
//    }
//    @Override
//    public int getItemCount() {
//        return mExampleList.size();
//    }
//
//}